import java.util.Scanner;

public class Guerreiro {

    Oraculo oraculo = new Oraculo();
    String nome;
    int vidas;

    Scanner t = new Scanner(System.in);

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getVidas() {
        return vidas;
    }

    public void vidaExtra() {
        System.out.println("Quer uma vida extra? Implore.");
        String txt = t.nextLine();
        
        if (oraculo.decidirVidaExtra(txt))
            this.vidas++;
        else 
            System.out.println("Voce e indigno de piedade!");
    }
}