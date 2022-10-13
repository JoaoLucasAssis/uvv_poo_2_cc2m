import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Oraculo {
    
    String nome;
    Guerreiro guerreiro;

    Random g = new Random(); //g recebe a classe random

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
        Scanner t = new Scanner(System.in);

        System.out.println("#### Level 1 ###");
        System.out.println("Advinhe um número...");

        int n = t.nextInt();
        int s = g.nextInt(100) + 1; //[1,100]

        if (n == s) {
            prologoVencedor();
        }
        else {
            while (n != s) {
                
                if (n > s) {
                    System.out.println("Menor.");
                    guerreiro.vidas--;
                    System.out.println("Tente novamente: ");
                    n = t.nextInt();
                } else {
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
        }
        return 0;
    }

    public int loadLevel2(int o) {

        if (o != 0 && o != 1) {
            MsgDeErro("Valor invalido", "Digite 0[par] ou 1[impar].");
        }
        else {
            System.out.println("#### Level 2 ###");
            
            int n1 = g.nextInt(6);
            int n2 = g.nextInt(6);
            int soma = n1 + n2;
            
            System.out.println("n1: "+n1+" + "+"n2: "+n2+" = "+soma);
            if (soma % 2 == o) {
            	prologoVencedor();
            }
            else {
                prologoPerdedor();
            }
        }
        return 0;
    }
    
    //Prologos
    public void prologoIntroducao() {
        String txt = "Ola " + guerreiro.nome + ", me chamo " + this.nome + ". Voce tem " + guerreiro.vidas + " vidas."; //Prólogo da história do jogo
        MsgDeInformacao("Introducao", txt);
    }
    
    public void prologoVencedor() {
        String txt = "Parabens " + guerreiro.nome + "! Eu, " + this.nome + ", estou feliz.";
        MsgDeInformacao("Voce venceu!", txt);
    }
    
    public void prologoPerdedor() {
        String txt = "Lamento " + guerreiro.nome + "! Eu, " + this.nome + ", estou desapontado.";
        MsgDeInformacao("Voce perdeu!", txt);
    }
    
    //Mensagens
    public static void MsgDeInformacao(String cabecalho, String frase){
	JOptionPane.showMessageDialog(null, frase, cabecalho, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void MsgDeErro(String cabecalho, String frase) {
	JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.ERROR_MESSAGE);
    }
}
