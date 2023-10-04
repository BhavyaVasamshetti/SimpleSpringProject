package springpackage;
public class BusTravel implements Travel {
    private double cost;
    private int totalHours;

    public BusTravel(double cost, int totalHours) {
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


