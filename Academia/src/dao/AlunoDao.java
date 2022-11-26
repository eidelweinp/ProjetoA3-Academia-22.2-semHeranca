package dao;
import java.sql.*;
import conexao.ConnectionFactory;
import modelo.Aluno;

public class AlunoDao{
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
    String plano;
    float mensalidade;

    public Object alunos;

    public AlunoDao(){
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Aluno aluno){
        String sql = "INSERT INTO cadastoaluno(cpf,nome,endereco,bairro,cep,cidade,uf,telefone,email,genero,dataNasc,plano,mensalidade) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Aluno.getCpf());
            stmt.setString(2, Aluno.getNome());
            stmt.setString(3, Aluno.getEndereco());
            stmt.setString(4, Aluno.getBairro());
            stmt.setString(5, Aluno.getCep());
            stmt.setString(6, Aluno.getCidade());
            stmt.setString(7, Aluno.getUf());
            stmt.setString(8, Aluno.getTelefone());
            stmt.setString(9, Aluno.getEmail());
            stmt.setString(10, Aluno.getGenero());
            stmt.setString(11, Aluno.getDataNasc());
            stmt.setString(12, Aluno.getPlano());
            stmt.setFloat(13, Aluno.getMensalidade());
            stmt.execute();
            stmt.close();
        }catch(SQLException){
            throw new RuntimeException(u);
        }
    }
}
