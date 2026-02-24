package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        appointments.add("Abai - 10:00 AM");
        appointments.add("Bayastan - 11:00 AM");
        appointments.add("Nurbek - 12:00 PM");

        // TODO: Add 1 urgent appointment at the beginning
        appointments.addFirst("URGENT: Vitaly - 9:30 AM");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if (appointments.isEmpty()) {
            System.out.println("No appointments to cancel.");
            return;
        }
        System.out.println("Canceling last appointment" +  appointments.removeLast());
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
            return;
        }
        System.out.println("First appointment " + appointments.getFirst());
        System.out.println("Last appointment " +appointments.getLast());
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
