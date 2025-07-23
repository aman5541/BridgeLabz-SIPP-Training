package WorkShop.LogisticsCompany;

public class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String checkpointId, String locationName, double distanceFromLast, double expectedDuration, double actualDuration) {
        super(checkpointId, locationName, distanceFromLast, expectedDuration, actualDuration);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public String getType() { return "FuelCheckpoint"; }

    @Override
    public double calculatePenalty() {
        if (isDelayed()) {
            return 10.0;
        }
        return 0.0;
    }
}
