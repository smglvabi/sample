public class Proposal {
    private int id;
    private Job job;
    private User freelancer;
    private double bidAmount;
    private String status;
    public Proposal(int id, Job job, User freelancer,
                    double bidAmount,String status){
        this.id = id;
        this.job = job;
        this.freelancer = freelancer;
        this.bidAmount = bidAmount;
        this.status = status;
    }
    public int getId() { return id; }
    public Job getJob() { return job; }
    public User getFreelancer() { return freelancer; }
    public double getBidAmount() { return bidAmount; }
    public String getStatus() { return status; }

    public void setBidAmount(double bidAmount)
    { this.bidAmount = bidAmount; }
    public void setStatus(String status) {this.status = status;}
    public void printInfo(){
        System.out.println(this);
    }
    public String toString() {
        return "Proposal{id=" + id +
                ", job='" + job.getTitle() + "'" +
                ", freelancer=" + freelancer.getName() +
                ", bidAmount=" + bidAmount +
                ", status='" + status + "'}";
    }
}
