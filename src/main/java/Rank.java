public enum Rank {
    CAPTAIN(1),
    CO_PILOT(2),
    PURSER(3),
    FLIGHT_ATTENDANT(4);

    private final int rank;

    Rank(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return this.rank;
    }
}
