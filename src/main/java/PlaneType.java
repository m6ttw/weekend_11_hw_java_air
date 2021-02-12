public enum PlaneType {
    BOEING747("Boeing 747", 600, 1200.00),
    BOEING737("Boeing 737", 190, 70.00),
    AIRBUS_A380("Airbus A380", 853, 580.00);


    private final String planeType;
    private final int capacity;
    private final double totalWeight;

    PlaneType(String planeType, int capacity, double totalWeight){
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

    public double getTotalWeight(){
        return this.totalWeight;
    }
}
