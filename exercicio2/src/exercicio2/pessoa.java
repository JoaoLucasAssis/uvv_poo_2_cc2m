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
public class pessoa {
    
    String nome[] = new String[30];
    int idade[] = new int[30];
    int i, soma = 0, qtd = 0, n = 0;
    int menor = 100, maior = 0;
    
    //input de dados
    Scanner teclado = new Scanner(System.in);
    
    //construtor
    public pessoa() {
        for(i = 0; i < 5; i++) {
            System.out.println("Nome do aluno " + (i+1));
            nome[i] = teclado.next();
            System.out.println("Idade do aluno " + (i+1));
            idade[i] = teclado.nextInt();
            
            //tratamento de erro
            if (idade[i] < 0 || idade[i] > 100) {
                System.out.println("[ERRO] Entrada incorreta de dados.");
                break;
            }
        }
    }
    
    //calculo media das idades
    public void mediaIdade() {
        for(i = 0; i < 5; i++) {
            soma += idade[i];
        }
        soma /= 5;
        System.out.println("Media das idades: "+ soma);
    }
    
    //calculo menor idade
    public void menorIdade() {
        for(i = 0; i < 5; i++) {
            n = idade[i];
            if (n < menor) {
                menor = n;
            }
        }
        System.out.println("Menor idade: "+ menor);
    }
    
    //calculo maior idade
    public void maiorIdade() {
        for(i = 0; i < 5; i++) {
            n = idade[i];
            if (maior < n) {
                maior = n;
            }
        }
        System.out.println("Maior idade: "+ maior);
    }
    
    //qtd maiores de idade
    public void qtdMaiorIdade() {
        for(i = 0; i < 5; i++) {
            if (idade[i] >= 18) {
                qtd += 1;
            }
        }
        System.out.println("Qtd maiores de idade: "+qtd);
    }
    
    public void verificarAniversario() {
        aniversario grupo = new aniversario();
        grupo.mesAniversario();
    }
}
