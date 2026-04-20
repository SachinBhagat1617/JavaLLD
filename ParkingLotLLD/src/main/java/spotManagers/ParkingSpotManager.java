package spotManagers;

import Entity.ParkingSpot;
import LookUpStrategy.ParkingSpotLookUpStrategy;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public abstract class ParkingSpotManager { // abstract class removes code Duplication
    private final List<ParkingSpot> spots;
    private final ParkingSpotLookUpStrategy strategy;
    private final ReentrantLock lock=new ReentrantLock(true);
    public ParkingSpotManager(List<ParkingSpot>spots,
                              ParkingSpotLookUpStrategy strategy){
        this.spots=spots;
        this.strategy=strategy;
    }

    public ParkingSpot park(){
        lock.lock();
        try{
            ParkingSpot spot=strategy.selectSpot(spots);
            if(spot==null){
                return null;
            }
            spot.occupySpot();
            return spot;
        }finally{
            lock.unlock();
        }
    }

    public void unPark(ParkingSpot spot){
        lock.lock();
        try{
            spot.releaseSpot();
            return;
        }finally{
            lock.unlock();
        }
    }

    public boolean hasFreeSpot(){
        lock.lock();
        try{
            return spots.stream().anyMatch(ParkingSpot::isAvailable);
        }finally{
            lock.unlock();
        }
    }
}
