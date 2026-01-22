public class Client extends User {
    private double budgetLimit;

    public Client(int id, String name, double budgetLimit) {
        super(id, name, "CLIENT","Shymkent"); // вызывает конструктор User
        this.budgetLimit = budgetLimit;
    }

    public double getBudgetLimit() { return budgetLimit; }
    public void setBudgetLimit(double budgetLimit) { this.budgetLimit = budgetLimit; }

    @Override
    public void printInfo() {
        System.out.println(super.toString() + ", budgetLimit=" + budgetLimit);
    }
}