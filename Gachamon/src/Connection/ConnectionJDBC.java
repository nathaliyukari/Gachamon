package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) {
        String urlconnection = "jdbc:mysql://localhost:3306/gachamon";

        try (Connection connection = DriverManager.getConnection(urlconnection,"eeikee","Subeteainotame59")){
            System.out.println("Conectado com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Falha na conexao");
            throwables.printStackTrace();
        }
    }
}
