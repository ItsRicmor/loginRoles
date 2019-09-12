package loginroles2.models;

public class User {
    
    //PASADO
    
    private String email;
    private String password;
    private Person person;
    private Role role;

    public User() {
    }

    public User(String email, String password, Person person, Role role) {
        this.email = email;
        this.password = password;
        this.person = person;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
}
