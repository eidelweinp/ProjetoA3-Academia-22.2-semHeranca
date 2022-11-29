package conexao;
import java.sql.Connection;
import java.sql.SQLException;

public class TestarConexao {
    public static void main(String[] args) throws SQLException{
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Deu certo!");
        connection.close();
    }
}