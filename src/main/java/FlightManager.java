public class FlightManager extends Plane{

    public FlightManager(PlaneType planeType, PlaneType capacity, PlaneType totalWeight){
        super(planeType, capacity, totalWeight);
    }

    public double getBagWeightPerPassenger(){
        return (getTotalWeightFromEnum() / 2.00) / getCapacityFromEnum();
    }

    public double calculateBaggageWeightBooked(Flight flight){
        return flight.countPassengerList() * getBagWeightPerPassenger();
    }
}