public class Plane {
    private PlaneType planeType;
    private PlaneType capacity;
    private PlaneType totalWeight;

    public Plane(PlaneType planeType, PlaneType capacity, PlaneType totalWeight){
        this.planeType = planeType;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public PlaneType getCapacity(){
        return this.capacity;
    }

    public PlaneType getTotalWeight(){
        return this.totalWeight;
    }

    public String getPlaneTypeFromEnum(){
        return this.planeType.getPlaneType();
    }

    public int getCapacityFromEnum(){
        return this.capacity.getCapacity();
    }

    public double getTotalWeightFromEnum(){
        return this.totalWeight.getTotalWeight();
    }

//    PlaneType[] planeTypes = PlaneType.values();
}
