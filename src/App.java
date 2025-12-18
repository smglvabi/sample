public class App {
    public static void main(String[] args) {
        User client = new User(1, "Beka", "CLIENT");
        User freelancer1 = new User(2, "Erke", "FREELANCER");
        User freelancer2 = new User(3, "Toqtarbulan", "FREELANCER");
        Job job1 = new Job(1, "Editor", client, 500);
        Proposal p1 = new Proposal(101, job1, freelancer1, 450, "PENDING");
        Proposal p2 = new Proposal(102, job1, freelancer2, 450, "PENDING");
        job1.printInfo();
        client.printInfo();
        p1.printInfo();
        p2.printInfo();
        p1.setStatus("ACCEPTED");
        p1.setBidAmount(430);
        System.out.println("After update:");
        p1.printInfo();
        System.out.println("freelancer1 == freelancer2: "
                + (freelancer1 == freelancer2));
        System.out.println("Same role:"+ freelancer1.getRole().equals(freelancer2.getRole()));
    }
}