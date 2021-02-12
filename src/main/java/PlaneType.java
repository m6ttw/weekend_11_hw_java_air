public enum PlaneType {
    BOEING747("Boeing 747", 660, 440),
    BOEING737("Boeing 737", 190, 70),
    AIRBUS_A380("Airbus A380", 853, 580);


    private final String planeType;
    private final int capacity;
    private final int totalWeight;

    PlaneType(String planeType, int capacity, int totalWeight){
        this.planeType = planeType;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public String getPlaneType(){
        return this.planeType;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }
}
