package springpackage;
public class TravelBookingService {
    private Travel travel;

    public TravelBookingService(Travel travel) {
        this.travel = travel;
    }

    public double getCost() {
        return travel.getCost();
    }

    public int getTotalHours() {
        return travel.getTotalHours();
    }
}
