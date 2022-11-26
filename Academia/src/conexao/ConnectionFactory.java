package conexao;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastropessoa","root", "usbw");
        } catch(SQLException excecao){
            throw new RuntimeException(excecao);
        }
    }
}
