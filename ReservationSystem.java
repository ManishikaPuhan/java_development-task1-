import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReservationSystem { // Updated class name to match the file name
    private static Map<String, user> users = new HashMap<>();
    private static Map<String, Reservation> reservations = new HashMap<>();

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        users.put("user1", new user("user1", "password1")); // Sample user

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (login(username, password)) {
            System.out.println("Login successful!");
            while (true) {
                System.out.println("1. Make Reservation");
                System.out.println("2. Cancel Reservation");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        makeReservation(scanner);
                        break;
                    case 2:
                        cancelReservation(scanner);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    private static boolean login(String username, String password) {
        user user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }

    private static void makeReservation(Scanner scanner) {
        System.out.print("Enter train number: ");
        String trainNumber = scanner.nextLine();
        System.out.print("Enter train name: ");
        String trainName = scanner.nextLine();
        System.out.print("Enter class type: ");
        String classType = scanner.nextLine();
        System.out.print("Enter date of journey (YYYY-MM-DD): ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter from location: ");
        String from = scanner.nextLine();
        System.out.print("Enter to location: ");
        String to = scanner.nextLine();

        Reservation reservation = new Reservation(trainNumber, trainName, classType, dateOfJourney, from, to);
        reservations.put(reservation.getPNRNumber(), reservation);
        System.out.println("Reservation successful! Your PNR number is: " + reservation.getPNRNumber());
    }

    private static void cancelReservation(Scanner scanner) {
        System.out.print("Enter PNR number to cancel: ");
        String pnrNumber = scanner.nextLine();

        if (reservations.containsKey(pnrNumber)) {
            reservations.remove(pnrNumber);
            System.out.println("Reservation with PNR " + pnrNumber + " has been cancelled.");
        } else {
            System.out.println("PNR number not found.");
        }
    }
}
