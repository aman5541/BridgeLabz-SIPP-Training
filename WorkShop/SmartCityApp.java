package WorkShop;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.*;

public class SmartCityApp {
    public static void main(String[] args) {
        Location a = new Location("A", 0.0, 0.0);
        Location b = new Location("B", 1.0, 1.0);
        Route r = new Route("R1", "A→B", a, b);
        Schedule sch = new Schedule(LocalDateTime.now().plusMinutes(15), true);

        TransportService bus = new BusService("Bus1", r, 10.0, Arrays.asList(sch));
        TransportService taxi = new TaxiService("Taxi1", r, 15.0, Arrays.asList(sch));
        TransportService ambulance = new AmbulanceService("Amb1", r, 0.0, Arrays.asList(sch));
        List<TransportService> services = Arrays.asList(bus, taxi, ambulance);

        Passenger p = new Passenger("P1", r, LocalDateTime.now(), 10.0);

        services.stream()
                .filter(s -> s.getRoute().id.equals("R1"))
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(TransportService::printDetails);

        FareCalculator calc = (route, passenger, baseFare) -> {
            double dist = GeoUtils.calculateDistance(route.from, route.to);
            return baseFare + dist;
        };
        System.out.println(calc.calculateFare(r, p, bus.getFare()));

        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println("Emergency: " + s.getId()));

        List<Passenger> ps = Arrays.asList(p, new Passenger("P2", r, LocalDateTime.now(), 15.0));
        Map<String, Long> countByRoute = ps.stream()
                .collect(Collectors.groupingBy(t -> t.route.id, Collectors.counting()));
        System.out.println(countByRoute);
        DoubleSummaryStatistics stats = ps.stream()
                .collect(Collectors.summarizingDouble(x -> x.farePaid));
        System.out.println(stats.getSum() + " " + stats.getAverage());
    }
}

interface TransportService {
    String getId();
    Route getRoute();
    double getFare();
    List<Schedule> getSchedules();
    default void printDetails() {
        System.out.println(getId() + " route " + getRoute().name + " fare " + getFare());
    }
}

interface GeoUtils {
    static double calculateDistance(Location a, Location b) {
        double dx = a.lat - b.lat;
        double dy = a.lng - b.lng;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

@FunctionalInterface
interface FareCalculator {
    double calculateFare(Route route, Passenger passenger, double baseFare);
}

interface EmergencyService {}

class Location {
    final String name;
    final double lat, lng;
    Location(String name, double lat, double lng) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
    }
}

class Route {
    final String id, name;
    final Location from, to;
    Route(String id, String name, Location from, Location to) {
        this.id = id;
        this.name = name;
        this.from = from;
        this.to = to;
    }
}

class Schedule {
    final LocalDateTime depart;
    final boolean peak;
    Schedule(LocalDateTime depart, boolean peak) {
        this.depart = depart;
        this.peak = peak;
    }
}

class Passenger {
    final String id;
    final Route route;
    final LocalDateTime time;
    final double farePaid;
    Passenger(String id, Route route, LocalDateTime time, double farePaid) {
        this.id = id;
        this.route = route;
        this.time = time;
        this.farePaid = farePaid;
    }
}

class BusService implements TransportService {
    private final String id;
    private final Route route;
    private final double fare;
    private final List<Schedule> schedules;
    BusService(String id, Route route, double fare, List<Schedule> schedules) {
        this.id = id;
        this.route = route;
        this.fare = fare;
        this.schedules = schedules;
    }
    public String getId() { return id; }
    public Route getRoute() { return route; }
    public double getFare() { return fare; }
    public List<Schedule> getSchedules() { return schedules; }
}

class TaxiService implements TransportService {
    private final String id;
    private final Route route;
    private final double fare;
    private final List<Schedule> schedules;
    TaxiService(String id, Route route, double fare, List<Schedule> schedules) {
        this.id = id;
        this.route = route;
        this.fare = fare;
        this.schedules = schedules;
    }
    public String getId() { return id; }
    public Route getRoute() { return route; }
    public double getFare() { return fare; }
    public List<Schedule> getSchedules() { return schedules; }
}

class AmbulanceService implements TransportService, EmergencyService {
    private final String id;
    private final Route route;
    private final double fare;
    private final List<Schedule> schedules;
    AmbulanceService(String id, Route route, double fare, List<Schedule> schedules) {
        this.id = id;
        this.route = route;
        this.fare = fare;
        this.schedules = schedules;
    }
    public String getId() { return id; }
    public Route getRoute() { return route; }
    public double getFare() { return fare; }
    public List<Schedule> getSchedules() { return schedules; }
}

