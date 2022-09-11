/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author joaol
 */
public class aniversario {
    
    int i;
    int dia[] = new int[30], mes[] = new int[30];
    
    //input de dados
    Scanner teclado = new Scanner(System.in);
    
    public aniversario() {
        for(i = 0; i < 3; i++) {
            System.out.println("Dia de aniversario do aluno "+ (i+1));
            dia[i] = teclado.nextInt();
            System.out.println("Mes de aniversario do aluno "+ (i+1));
            mes[i] = teclado.nextInt();
            
        //tratamento de erro
            if (dia[i] < 0 || dia[i] > 31) {
                System.out.println("[ERRO] Entrada incorreta dos dados.");
                break;
            } else if (mes[i] < 0 || mes[i] > 12) {
                System.out.println("[ERRO] Entrada incorreta dos dados.");
                break;
            }
        }
    }
    public void mesAniversario() {
        for(i = 0; i < 3; i++) {
            switch (mes[i]) {
                case 1 -> System.out.println("Mes do aluno "+(i+1)+": Janeiro");
                case 2 -> System.out.println("Mes do aluno "+(i+1)+": Fevereiro");
                case 3 -> System.out.println("Mes do aluno "+(i+1)+": Março");
                case 4 -> System.out.println("Mes do aluno "+(i+1)+": Abril");
                case 5 -> System.out.println("Mes do aluno "+(i+1)+": Maio");
                case 6 -> System.out.println("Mes do aluno "+(i+1)+": Junho");
                case 7 -> System.out.println("Mes do aluno "+(i+1)+": Julho");
                case 8 -> System.out.println("Mes do aluno "+(i+1)+": Agosto");
                case 9 -> System.out.println("Mes do aluno "+(i+1)+": Setembro");
                case 10 -> System.out.println("Mes do aluno "+(i+1)+": Outubro");
                case 11 -> System.out.println("Mes do aluno "+(i+1)+": Novembro");
                case 12 -> System.out.println("Mes do aluno "+(i+1)+": Dezembro");
            }
        }
    }
}
