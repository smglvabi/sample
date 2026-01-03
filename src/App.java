import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        JobPortal portal = new JobPortal();

        User client = new User(1, "Beka", "CLIENT");
        User freelancer1 = new User(2, "Erke", "FREELANCER");
        User freelancer2 = new User(3, "Toqtarbulan", "FREELANCER");

        Job job1 = new Job(1, "Editor", client, 500);
        Job job2 = new Job(2, "Logo Design", client, 300);

        Proposal p1 = new Proposal(101, job1, freelancer1, 450, "PENDING");
        Proposal p2 = new Proposal(102, job1, freelancer2, 430, "PENDING");

        portal.addUser(client);
        portal.addUser(freelancer1);
        portal.addUser(freelancer2);
        portal.addJob(job1);
        portal.addJob(job2);
        portal.addProposal(p1);
        portal.addProposal(p2);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1) Show all jobs");
            System.out.println("2) Filter jobs by min budget");
            System.out.println("3) Sort jobs by budget DESC");
            System.out.println("4) Search jobs by title keyword");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 0) break;

            switch (choice) {
                case 1 -> {
                    for (Job j : portal.getJobs()) j.printInfo();
                }
                case 2 -> {
                    System.out.print("Min budget: ");
                    double min = Double.parseDouble(sc.nextLine());
                    List<Job> res = portal.filterJobsByBudget(min);
                    for (Job j : res) j.printInfo();
                }
                case 3 -> {
                    List<Job> res = portal.sortJobsByBudgetDesc();
                    for (Job j : res) j.printInfo();
                }
                case 4 -> {
                    System.out.print("Keyword: ");
                    String k = sc.nextLine();
                    List<Job> res = portal.searchJobsByTitle(k);
                    for (Job j : res) j.printInfo();
                }
                default -> System.out.println("Wrong option");
            }
        }

        sc.close();
        System.out.println("Bye!");
    }
}