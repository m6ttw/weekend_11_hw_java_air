public class Pilot{
    private String name;
    private Rank rank;
    private String pilotLicenceNumber;

    public Pilot(String name, Rank rank, String pilotLicenceNumber){
        this.name = name;
        this.rank = rank;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getName(){
        return this.name;
    }

    public Rank getRank(){
        return this.rank;
    }

    public int getValueFromEnum(){
        return this.rank.getValue();
    }

    Rank[] ranks = Rank.values();

    public String getPilotLicenceNumber(){
        return this.pilotLicenceNumber;
    }

}
