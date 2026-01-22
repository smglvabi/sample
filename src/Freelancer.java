import java.util.ArrayList;
import java.util.List;

public class Freelancer extends User {
    private List<String> skills = new ArrayList<>();

    public Freelancer(int id, String name) {
        super(id, name, "FREELANCER","Turkistan");
    }

    public void addSkill(String skill) { skills.add(skill); }
    public List<String> getSkills() { return skills; }

    @Override
    public void printInfo() {
        System.out.println(super.toString() + ", skills=" + skills);
    }
}