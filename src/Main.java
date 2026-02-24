import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        AppointmentService appointmentService = new AppointmentService();
        IssueService issueService = new IssueService();
        ActionHistoryService actionService = new ActionHistoryService();

        studentService.initializeStudents();
        appointmentService.initializeAppointments();
        issueService.initializeIssues();
        actionService.initializeActions();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== 🎓 Smart University Service System =====");
            System.out.println("1. Show Students");
            System.out.println("2. Show Appointments");
            System.out.println("3. Show Emergency Issues");
            System.out.println("4. Show Action History");
            System.out.println("5. Add New Issue");
            System.out.println("6. Undo Action");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // TODO
                    studentService.printStudents();
                    break;
                case 2:
                    // TODO
                    appointmentService.printAppointments();
                    break;
                case 3:
                    // TODO
                    issueService.showMostUrgent();
                    break;
                case 4:
                    // TODO
                    actionService.printHistory();
                    break;
                case 5:
                    // TODO
                    System.out.print("Enter issue description: ");
                    String desc = scanner.nextLine();

                    System.out.print("Enter urgency level (1 = most urgent): ");
                    int urgency = scanner.nextInt();

                    issueService.addNewIssue(desc, urgency);
                    break;
                case 6:
                    // TODO
                    actionService.undoLastAction();
                    break;
                case 7:
                    System.out.println("Exiting... 👋");
                    break;
                default:
                    System.out.println("Invalid option ❌");
            }

        } while (choice != 7);

        scanner.close();
    }
}
