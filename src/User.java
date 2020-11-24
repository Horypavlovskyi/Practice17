public class User {
    private String login;
    private String password;
    private String name;
    private Position role = Position.ANONYMOUS;

    public User(String login, String password, String name, Position role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getRole() {
        return role;
    }

    public void setRole(Position role) {
        this.role = role;
    }
}
