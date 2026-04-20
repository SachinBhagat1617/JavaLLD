package Entity;

public class ParkingSpot {
    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    private String spotId;
    private boolean isFree=true;

    public ParkingSpot(String spotId){
        this.spotId=spotId;
    }
    public boolean isAvailable(){
        return isFree;
    }
    public void occupySpot(){
        isFree=false;
    }
    public void releaseSpot(){
        isFree=true;
    }
}
