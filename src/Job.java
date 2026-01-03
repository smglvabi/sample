public class Job {
    private int id;
    private String title;
    private User client;
    private double budget;

    public Job(int id,String title, User client,double budget) {
        this.id = id;
        this.title = title;
        this.client = client;
        this.budget = budget;
    }
    public int getId(){return id;}
    public String getTitle(){return title;}
    public double getBudget(){return budget;}
    public User getClient(){return client;}

    public void setTitle(){this.title = title;}
    public void setBudget(){this.budget = budget;}
    public void setClient(){this.client = client;}


    public void printInfo(){
        System.out.println(this);
    }
    public String toString() {
        return("Job{id=" + id + ", title =" + title +
                ", client=" + client + ", budget=" + budget);
    }@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job other = (Job) o;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
