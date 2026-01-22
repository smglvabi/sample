import java.util.Scanner;
public class App {

    public static void main(String[] args) {


        UserDAO userDAO = new UserDAO();

        User u = new User(10, "TestUser", "CLIENT", "Astana");

        userDAO.saveUser(u);                 // INSERT
        User foundFromId = userDAO.findById(10);   // SELECT
        foundFromId.printInfo();

        userDAO.updateUserName(10, "Updated");
        userDAO.deleteUser(10);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String name = scanner.nextLine();

        System.out.print("Enter role (CLIENT / FREELANCER): ");
        String role = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        User user = new User(11, name, role, city);
        userDAO.saveUser(user);

        //updatin:
        System.out.print("Enter old city to update: ");
        String oldCity = scanner.nextLine();

        System.out.print("Enter new city: ");
        String newCity = scanner.nextLine();

        userDAO.updateCity(oldCity, newCity);

        //1-2 asik
        //JobPortal portal = new JobPortal();   // переменная будет хранить объекты жобпортала
        //        User client = new User(1, "Beka", "CLIENT");
        //        User u1 = new User(1, "Beka", "CLIENT");
        //        User u2 = new User(1, "Beka", "CLIENT");
        //        User freelancer1 = new User(2, "Erke", "FREELANCER");
        //        User freelancer2 = new User(3, "Toqtarbulan", "FREELANCER");
        //        Job job1 = new Job(1, "Editor", client, 500);
        //        Proposal p1 = new Proposal(101, job1, freelancer1, 450, "PENDING");
        //        Proposal p2 = new Proposal(102, job1, freelancer2, 450, "PENDING");
        //
        //
        //
        //        portal.addUser(client);
        //        portal.addUser(freelancer1);
        //        portal.addUser(freelancer2);
        //        portal.addJob(job1);
        //        portal.addProposal(p1);
        //        portal.addProposal(p2);
        //
        //
        //        Scanner scanner = new Scanner(System.in);
        //
        //        System.out.print("Enter user name: ");
        //        String name = scanner.nextLine();
        //
        //        System.out.print("Enter role (CLIENT / FREELANCER): ");
        //        String role = scanner.nextLine();
        //
        //        User user = new User(1, name, role);
        //        portal.addUser(user);
        //
        //        System.out.println("User added:");
        //        user.printInfo();
        //        System.out.print("Enter user id for search:");
        //        int id = scanner.nextInt();
        //
        //
        //        User foundFromPortal = portal.findUserById(id);
        //
        //        if (foundFromPortal != null){
        //            System.out.println("User found:");
        //            foundFromPortal.printInfo();
        //        } else {
        //            System.out.println("User with entered id is not found");
        //        }
        //        System.out.print("Enter minimum budget for search");
        //        double minBudget = scanner.nextDouble();
        //
        //        System.out.println("Work with budget >=" + minBudget + ":");
        //        for (Job j : portal.filterJobsByBudget(minBudget)){
        //            j.printInfo();
        //            scanner.close();
        //        }
        //
        //        System.out.println("Works on descending budget:");
        //        for (Job j : portal.sortJobsByBudgetDesc()){
        //            j.printInfo();
        //        }
        //        System.out.println("Bids at an ascending rate:");
        //        for (Proposal p : portal.sortProposalsByBid()) {
        //            p.printInfo();
        //        }
        //System.out.println(u1.equals(u2));


    }
}