package WorkShop.LogisticsCompany;

public class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String checkpointId, String locationName, double distanceFromLast, double expectedDuration, double actualDuration) {
        super(checkpointId, locationName, distanceFromLast, expectedDuration, actualDuration);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public String getType() { return "DeliveryCheckpoint"; }

    @Override
    public double calculatePenalty() {
        if (isDelayed()) {
            return (actualDuration - expectedDuration) * 2;
        }
        return 0.0;
    }
}
