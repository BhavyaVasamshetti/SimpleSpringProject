package springpackage;

public class FlightTravel implements Travel {
    private double cost;
    private int totalHours;

    public FlightTravel(double cost, int totalHours) {
        this.cost = cost;
        this.totalHours = totalHours;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public int getTotalHours() {
        return totalHours;
    }
}
