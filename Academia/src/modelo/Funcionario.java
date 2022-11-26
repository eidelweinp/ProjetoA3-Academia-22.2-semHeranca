package modelo;

public class Funcionario {
    private String cpf;
    private String nome;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String telefone;
    private String email;
    private String genero;
    private String dataNasc;
    private String cargo;
    private float salario;

    // Método construtor
    public Funcionario(){}

    public Funcionario(String cpf, String nome, String endereco, String bairro, String cep, String cidade, String uf, String telefone, String email, String genero, String dataNasc, String cargo, float salario){
        this.cpf=cpf;
        this.nome=nome;
        this.endereco=endereco;
        this.bairro=bairro;
        this.cep=cep;
        this.cidade=cidade;
        this.uf=uf;
        this.telefone=telefone;
        this.email=email;
        this.genero=genero;
        this.dataNasc=dataNasc;
        this.cargo=cargo;
        this.salario=salario;
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
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro=bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep){
        this.cep=cep;
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
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc){
        this.dataNasc=dataNasc;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo=cargo;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario){
        this.salario=salario;
    }

}
