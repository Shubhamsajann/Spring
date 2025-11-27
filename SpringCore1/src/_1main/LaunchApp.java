package _1main;

import _2service.Java;
import _2service.Telusko;

public class LaunchApp {

    public static void main(String[] args) {

        // ---------- Constructor Injection ----------
        // Creating target object with dependency injected via constructor
        Telusko t = new Telusko(new Java());

        // ---------- Setter Injection ----------
        // You can change the dependency dynamically using setter
        t.setCourse(new Java());

        // Calling business logic
        Boolean b = t.buythecourse(55.3);

        if (b) {
            System.out.println("Course Purchased");
        } else {
            System.out.println("Failed to purchase");
        }
    }
}
