package gachamon;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Register {
    public List<User> lista(){
        List<User> user = new ArrayList<>();
        ConnectionJDBC.getConnection();
        return user;
    }
}
