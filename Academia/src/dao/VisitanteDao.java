package dao;
import java.sql.*;
import conexao.ConnectionFactory;
import modelo.Visitante;

public class VisitanteDao{
    private Connection connection;

    String cpf;
    String nome;
    String cidade;
    String uf;
    String telefone;
    String email;
    String genero;

    public Object visitantes;

    public VisitanteDao(){
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Visitante visitante){
        String sql = "INSERT INTO cadastovisitante(cpf,nome,cidade,uf,telefone,email,genero) VALUES(?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Visitante.getCpf());
            stmt.setString(2, Visitante.getNome());
            stmt.setString(3, Visitante.getCidade());
            stmt.setString(4, Visitante.getUf());
            stmt.setString(5, Visitante.getTelefone());
            stmt.setString(6, Visitante.getEmail());
            stmt.setString(7, Visitante.getGenero());
            stmt.execute();
            stmt.close();
        }catch(SQLException){
            throw new RuntimeException(u);
        }
    }
}