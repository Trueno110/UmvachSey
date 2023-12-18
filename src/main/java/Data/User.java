package Data;

public class User {
    private String Login;
    private String Passvord;
    private String Name;

    public User(String login, String passvord, String name) {
        Login = login;
        Passvord = passvord;
        Name = name;
    }

    public String getLogin() {
        return Login;
    }

    public String getPassvord() {
        return Passvord;
    }

    public String getName() {
        return Name;
    }
}
