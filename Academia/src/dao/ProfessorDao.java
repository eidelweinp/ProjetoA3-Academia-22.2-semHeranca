package dao;
import java.sql.*;
import conexao.ConnectionFactory;
import modelo.Professor;

public class ProfessorDao{
    private Connection connection;

    String cpf;
    String nome;
    String endereco;
    String bairro;
    String cep;
    String cidade;
    String uf;
    String telefone;
    String email;
    String genero;
    String dataNasc;
    String cargo;
    float salario;

    public Object professores;

    public ProfessorDao(){
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Professor professor){
        String sql = "INSERT INTO cadastoprofessor(cpf,nome,endereco,bairro,cep,cidade,uf,telefone,email,genero,dataNasc,cargo,salario) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Professor.getCpf());
            stmt.setString(2, Professor.getNome());
            stmt.setString(3, Professor.getEndereco());
            stmt.setString(4, Professor.getBairro());
            stmt.setString(5, Professor.getCep());
            stmt.setString(6, Professor.getCidade());
            stmt.setString(7, Professor.getUf());
            stmt.setString(8, Professor.getTelefone());
            stmt.setString(9, Professor.getEmail());
            stmt.setString(10, Professor.getGenero());
            stmt.setString(11, Professor.getDataNasc());
            stmt.setString(12, Professor.getCargo());
            stmt.setFloat(13, Professor.getSalario());
            stmt.execute();
            stmt.close();
        }catch(SQLException){
            throw new RuntimeException(u);
        }
    }
}