import java.util.*;
import java.lang.Math;

public class SIH {

    // Hub class to hold hub details
    static class Hub {
        String id;
        double latitude;
        double longitude;
        int numberOfParcels;

        Hub(String id, double latitude, double longitude, int numberOfParcels) {
            this.id = id;
            this.latitude = latitude;
            this.longitude = longitude;
            this.numberOfParcels = numberOfParcels;
        }
    }

    // Helper: Haversine distance calculation
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371; // Earth radius in km
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                   Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }

    // Find the next optimal waypoint based on parcels/distance
    public static Hub findOptimalWaypoint(Hub currentNode, List<Hub> remainingHubs, int remainingCapacity) {
        Hub bestHub = null;
        double bestScore = -Double.MAX_VALUE;

        for (Hub hub : remainingHubs) {
            double distance = calculateDistance(currentNode.latitude, currentNode.longitude, hub.latitude, hub.longitude);
            double score = hub.numberOfParcels / distance;
            if (score > bestScore) {
                bestScore = score;
                bestHub = hub;
            }
        }

        return bestHub;
    }

    // Main A* route function
    public static List<String> aStarWithWaypoints(List<Hub> hubs, String sourceId, String destinationId, int truckCapacity, int maxWaypoints) {
        Hub sourceNode = null, destinationNode = null;
        for (Hub hub : hubs) {
            if (hub.id.equals(sourceId)) sourceNode = hub;
            else if (hub.id.equals(destinationId)) destinationNode = hub;
        }

        if (sourceNode == null || destinationNode == null) {
            throw new IllegalArgumentException("Source or Destination not found");
        }

        List<String> route = new ArrayList<>();
        route.add(sourceNode.id);

        Hub currentNode = sourceNode;
        int remainingCapacity = truckCapacity;

        List<Hub> remainingHubs = new ArrayList<>();
        for (Hub hub : hubs) {
            if (!hub.id.equals(sourceId) && !hub.id.equals(destinationId)) {
                remainingHubs.add(hub);
            }
        }

        int waypointsCount = 0;
        while (waypointsCount < maxWaypoints && !remainingHubs.isEmpty()) {
            Hub waypoint = findOptimalWaypoint(currentNode, remainingHubs, remainingCapacity);
            if (waypoint != null) {
                route.add(waypoint.id);
                waypointsCount++;

                remainingCapacity -= Math.min(waypoint.numberOfParcels, remainingCapacity);
                currentNode = waypoint;
                remainingHubs.remove(waypoint);
            } else {
                break;
            }
        }

        route.add(destinationNode.id);
        return route;
    }

    // Sample Input
    public static void main(String[] args) {
        List<Hub> hubs = Arrays.asList(
            new Hub("A", 10.0, 10.0, 5),
            new Hub("B", 10.5, 10.5, 15),
            new Hub("C", 11.0, 11.0, 20),
            new Hub("D", 11.5, 11.5, 10),
            new Hub("E", 12.0, 12.0, 25)
        );

        String sourceId = "A";
        String destinationId = "E";
        int truckCapacity = 30;
        int maxWaypoints = 2;

        List<String> route = aStarWithWaypoints(hubs, sourceId, destinationId, truckCapacity, maxWaypoints);

        System.out.println("Optimized Route: " + route);
    }
}
