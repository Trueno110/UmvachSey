package Data;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public static List<User> userAccounts = new ArrayList<>();
    static {
        User Admin = new User("admin", "admin","Vitold");
        userAccounts.add(Admin);
    }
}

