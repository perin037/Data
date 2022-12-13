package rs.ac.ni.pmf.data;

public class User {
    private String firstname;
    private String lastname;
    private String username;
    private int age;
    private boolean registered;

    public User(String firstname, String lastname, String username, int age, boolean registered) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.age = age;
        this.registered = registered;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public boolean isRegistered() {
        return registered;
    }
}
