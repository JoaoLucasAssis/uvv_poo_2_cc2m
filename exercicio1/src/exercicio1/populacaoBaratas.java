/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

import java.util.Random;

/**
 *
 * @author joaol
 */
public class populacaoBaratas {
    
    int nb;
    
    public populacaoBaratas() {
        
        Random n = new Random();
        nb = n.nextInt(50);
    }
    
    public void aumentaBaratas(int a) {
        System.out.println("Qtd atual de baratas: "+nb);
        System.out.println("Qtd mutiplicada em "+a+" vezes");
        nb *= a;
        System.out.println("Qtd atual de baratas:"+nb);
    }
    
    public void spray() {
        System.out.println("Qtd atual de baratas: "+nb);
        nb *= 0.9;
        System.out.println("Qtd atual de baratas:"+nb+" (-10%)");
    }
    
    public void qtdBaratas() {
        System.out.println("Qtd de baratas: "+nb);
    }
}
