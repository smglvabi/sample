public class Job {
    private int id;
    private String title;
    private User client;
    private double budget;

    public Job(int id, String title, User client, double budget) {
        this.id = id;
        this.title = title;
        this.client = client;
        this.budget = budget;
    }
    public int getId() { return id; }
    public String getTitle() { return title; }
    public double getBudget() { return budget; }
    public User getClient() { return client; }
    public void setTitle(String title) { this.title = title; }
    public void setBudget(double budget) { this.budget = budget; }
    public void setClient(User client) { this.client = client; }

    public void printInfo(){
        System.out.println(this);
    }
    public String toString() {
        return("Job{id=" + id + ", title =" + title +
                ", client=" + client.getName() + ", budget=" + budget);
    }
}
