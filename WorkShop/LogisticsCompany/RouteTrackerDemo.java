package WorkShop.LogisticsCompany;

public class RouteTrackerDemo {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");
        driver.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 40, 60, 70)); // delayed 10*2=20
        driver.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 30, 20, 20)); // on time
        driver.addCheckpoint(new RestCheckpoint("C3", "Motel X", 20, 30, 35)); // delayed 5>30? no, so 0
        driver.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 30, 45, 60)); // delayed 15*2=30
        // For sample, make Motel X delay > 30 for penalty
        driver.getRouteHistory().removeCheckpoint("C3");
        driver.addCheckpoint(new RestCheckpoint("C5", "Motel X", 20, 30, 65)); // delayed 35>30, penalty 17.5
        driver.printRouteSummary();
    }
}
