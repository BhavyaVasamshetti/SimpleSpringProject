package springpackage;

public class TrainTravel implements Travel {
    private double cost;
    private int totalHours;

    public TrainTravel(double cost, int totalHours) {
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
