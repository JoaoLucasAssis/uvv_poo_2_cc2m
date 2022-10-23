public class Cliente {

    private String nome, endereco, cpf;
    
    public Cliente(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void getNome() {
        System.out.println(this.nome);
    }
    public void getEndereco() {
        System.out.println(this.endereco);
    }
    public void getCpf() {
        System.out.println(this.cpf);
    }

    public void getDados() {
        System.out.println("Nome: "+this.nome+"\nEndereco: "+this.endereco+"\nCPF: "+this.cpf);
    }
}
