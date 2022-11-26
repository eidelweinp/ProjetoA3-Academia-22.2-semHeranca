package dao;
import java.sql.*;
import conexao.ConnectionFactory;
import modelo.Funcionario;

public class FuncionarioDao{
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

    public Object funcionarios;

    public FuncionarioDao(){
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Funcionario funcionario){
        String sql = "INSERT INTO cadastofuncionario(cpf,nome,endereco,bairro,cep,cidade,uf,telefone,email,genero,dataNasc,cargo,salario) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Funcionario.getCpf());
            stmt.setString(2, Funcionario.getNome());
            stmt.setString(3, Funcionario.getEndereco());
            stmt.setString(4, Funcionario.getBairro());
            stmt.setString(5, Funcionario.getCep());
            stmt.setString(6, Funcionario.getCidade());
            stmt.setString(7, Funcionario.getUf());
            stmt.setString(8, Funcionario.getTelefone());
            stmt.setString(9, Funcionario.getEmail());
            stmt.setString(10, Funcionario.getGenero());
            stmt.setString(11, Funcionario.getDataNasc());
            stmt.setString(12, Funcionario.getCargo());
            stmt.setFloat(13, Funcionario.getSalario());
            stmt.execute();
            stmt.close();
        }catch(SQLException){
            throw new RuntimeException(u);
        }
    }
}