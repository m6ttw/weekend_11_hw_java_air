public enum Rank {
    CAPTAIN(1),
    FIRSTOFFICER(2),
    PURSER(3),
    FLIGHTATTENDANT(4);

    private final int rank;

    Rank(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return this.rank;
    }
}
