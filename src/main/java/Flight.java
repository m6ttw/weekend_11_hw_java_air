import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Plane plane;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewList;
    private ArrayList<Passenger> passengerList;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime, Plane plane, Pilot pilot){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = plane;
        this.pilot = pilot;
        this.cabinCrewList = new ArrayList<CabinCrewMember>();
        this.passengerList = new ArrayList<Passenger>();
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public int countCabinCrewList(){
        return this.cabinCrewList.size();
    }

    public int countPassengerList(){
        return this.passengerList.size();
    }

    public int getNumberOfAvailableSeats() {
        int planeSeats = this.plane.getCapacityFromEnum();
        int numPassengers = countPassengerList();
        return planeSeats - numPassengers;
    }

    public void bookPassenger(Passenger passenger){
        if(getNumberOfAvailableSeats() > 1) {passengerList.add(passenger);
        }
    }

}
