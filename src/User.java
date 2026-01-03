public class User {
    private int id;
    private String name;
    private String role;
    public User(int id, String name, String role){
        this.id = id;
        this.name = name;
        this.role = role;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void printInfo(){
        System.out.println(this);
    }
    public String toString(){
        return ("User{id=" + id + ", name='" + name + "', role='" + role + "'}");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User other = (User) o;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
