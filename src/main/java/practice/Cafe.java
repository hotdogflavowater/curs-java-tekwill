package practice;

import java.util.HashMap;
import java.util.Map;

public class Cafe {
    public static void main(String[] args) {
        Map<String, String> orders = new HashMap<>();

        orders.put("Alice", "Cappuccino");
        orders.put("Vasile", "Jin");
        orders.put("Charlie", "Espresso");

        for (String name : orders.keySet()) {
            String order = orders.get(name);
            System.out.println(name + " - " + order);
        }
    }
}

