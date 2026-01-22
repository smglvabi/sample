import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class JobPortal {
   private List <User> users = new ArrayList<>();
   private List<Job> jobs = new ArrayList<>();
   private List<Proposal> proposals = new ArrayList<>();
    public void addUser(User user) {
        users.add(user);
    }

    public void addJob(Job job) {
        jobs.add(job);
    }

    public void addProposal(Proposal proposal) {
        proposals.add(proposal);
    }
    public List<User> getUser() {
        return users;
    }
    public List<Job> getJobs(){
        return jobs;
    }
    public List <Proposal> getProposals(){
        return proposals;
    }


    public List<Job> filterJobsByBudget(double minBudget){
        List<Job> result = new ArrayList<>();
        for (Job j : jobs){
            if (j.getBudget() <= minBudget){
                result.add(j);
            }
        }
        return result;
    }

    public List<Proposal> filterProposalsByStatus(String status){
        List<Proposal> result = new ArrayList<>();
        for (Proposal p : proposals){
            if (p.getStatus().equals(status)){
                result.add(p);
            }
        }
        return result;
    }
    public User findUserById(int id){
        for (User u : users){
            if (u.getId() == id){
                return u;
            }
        }
        return null;
    }
    public List<Job> sortJobsByBudgetDesc() {
        List<Job> sorted = new ArrayList<>(jobs);          // создаём копию списка
        sorted.sort(Comparator.comparingDouble(Job::getBudget).reversed()); // сортировка по бюджету, убывание
        return sorted;
    }

    public List<Proposal> sortProposalsByBid(){
        List<Proposal> sorted = new ArrayList<>(proposals);
        sorted.sort(Comparator.comparingDouble(Proposal::getBidAmount));
        return sorted;
    }
}
