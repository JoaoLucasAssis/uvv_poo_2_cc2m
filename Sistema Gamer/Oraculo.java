import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Oraculo {
    
    String nome;
    Guerreiro guerreiro;
    
    Icon icO = new ImageIcon("oraculo.png");
    Icon icV = new ImageIcon("trofeu.png");
    Icon icP = new ImageIcon("game_over.png");
    
    Scanner t = new Scanner(System.in);

    Random g = new Random();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int setVidas() {
        return guerreiro.vidas = g.nextInt(4) + 9;
    }

    public boolean decidirVidaExtra(String txt) {
        StringTokenizer st = new StringTokenizer(txt, " ");
        return (st.countTokens() > 5);
    }

    //Levels
    public int loadLevel1() {

        System.out.println("#### Level 1 ###");
        System.out.println("Advinhe um numero...");

        int n = t.nextInt();
        int s = g.nextInt(100) + 1; //[1,99]
        while (n != s) {
                if (n > s) {
                    System.out.println("Menor.");
                    guerreiro.vidas--;
                    System.out.println("Tente novamente: ");
                    n = t.nextInt();
                } 
                else {
                    System.out.println("Maior.");
                    guerreiro.vidas--;
                    System.out.println("Tente novamente: ");
                    n = t.nextInt();
                }
                if (guerreiro.vidas == 0) {
                    System.out.println("Voce esta sem vidas.");
                    prologoPerdedor();
                    break;
                }
            }
        if (n == s) {
                prologoVencedor();
                System.out.println("Vamos parar o proximo level");
                System.out.println("Advinhe se a soma de dois numeros sera par(0) ou impar(1)");
                System.out.println("Digite o seu palpite: ");
                int a = t.nextInt();
                loadLevel2(a);
       	    }
        return 0;
        }

    public int loadLevel2(int o) {
        
        do {
            MsgDeErro("Valor invalido", "Digite 0[par] ou 1[impar].");
            System.out.println("Digite novamente: ");
            o = t.nextInt();
        } while(o != 0 && o != 1);

        System.out.println("#### Level 2 ###");
            
        int n1 = g.nextInt(6);
        int n2 = g.nextInt(6);
        int soma = n1 + n2;
            
        System.out.println("n1: "+n1+" + "+"n2: "+n2+" = "+soma);
        if (soma % 2 == o)
            prologoVencedor();
        else
            prologoPerdedor();
        return 0;
    }
    
    //Prologos
    public void prologoIntroducao() {
        String txt = "Ola " + guerreiro.nome + ", me chamo " + this.nome + ". Voce tem " + guerreiro.vidas + " vidas."; //Prólogo da história do jogo
        MsgDeInformacao("Introducao", txt, icO);
    }
    
    public void prologoVencedor() {
        String txt = "Parabens " + guerreiro.nome + "! Eu, " + this.nome + ", estou feliz.";
        MsgDeInformacao("Voce venceu!", txt, icV);
    }
    
    public void prologoPerdedor() {
        String txt = "Lamento " + guerreiro.nome + "! Eu, " + this.nome + ", estou desapontado.";
        MsgDeInformacao("Voce perdeu!", txt, icP);
    }
    
    //Mensagens
    public static void MsgDeInformacao(String cabecalho, String frase, Icon icon){
	JOptionPane.showMessageDialog(null, frase, cabecalho, JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
    public static void MsgDeErro(String cabecalho, String frase) {
	JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.ERROR_MESSAGE);
    }
}
