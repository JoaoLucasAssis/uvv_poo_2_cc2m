public class Funcionario {
    
    private String nome;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void getNome() {
        System.out.println(this.nome);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
}