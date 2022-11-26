package modelo;

public class Visitante {
    private String cpf;
    private String nome;
    private String cidade;
    private String uf;
    private String telefone;
    private String email;
    private String genero;

    // Método construtor
    public Visitante(){}

    public Visitante(String cpf, String nome, String cidade, String uf, String telefone, String email, string genero){
        this.cpf=cpf;
        this.nome=nome;
        this.cidade=cidade;
        this.uf=uf;
        this.telefone=telefone;
        this.email=email;
        this.genero=gerero;
    }

    //Métodos get e set
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade=cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf){
        this.uf=uf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
}
