public class User {
    private int id;
    private String name;
    private String role;
    private String city;
    public User(int id, String name, String role, String city){
        this.id = id;
        this.name = name;
        this.role = role;
        this.city = city;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void printInfo(){
        System.out.println(this);
    }
    public String toString(){
        return "User{id=" + id + ", name='" + name + "', role='" + role + "', city='" + city + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return id == user.id;
    }
    @Override
    public int hashCode() {
        return id;
    }
}