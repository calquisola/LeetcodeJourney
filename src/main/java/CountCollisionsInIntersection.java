import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountCollisionsInIntersection {
    // An intersection is accident prone if it has more than 1 collisions
    // Find the intersection with the most collisions

    public static void main(String[] args) {

        List<Event> events = new ArrayList<>();
        events.add(new Event("Madison", "Park", 1));
        events.add(new Event("Summer", "North", 2));
        events.add(new Event("5th", "Washington", 3));
        events.add(new Event("Water", "Wall", 3));
        events.add(new Event("Madison", "Park", 2));
        events.add(new Event("Madison", "Park", 4));

        HashMap<String, Integer> map = new HashMap<>();
        String key;
        int count = 0;
        int maxCollisions = 0;
        String maxCollisionsKey = "";
        for (Event event : events) {
            key = event.getStreet1()+"-"+event.getStreet2();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + event.getNumCollisions());
            } else {
                map.put(key, event.getNumCollisions());
            }

            if(maxCollisions < map.get(key)) {
                maxCollisions = map.get(key);
                maxCollisionsKey = key;
            }

        }

        System.out.println(maxCollisionsKey);

    }
}


class Event{
    String street1;
    String street2;
    int numCollisions;

    Event(String street1, String street2, int numCollisions) {
        this.street1 = street1;
        this.street2 = street2;
        this.numCollisions = numCollisions;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public int getNumCollisions() {
        return numCollisions;
    }

    public void setNumCollisions(int numCollisions) {
        this.numCollisions = numCollisions;
    }

    @Override
    public String toString() {
        return "Event{" +
                "street1='" + street1 + '\'' +
                ", street2='" + street2 + '\'' +
                ", numCollisions=" + numCollisions +
                '}';
    }
}
