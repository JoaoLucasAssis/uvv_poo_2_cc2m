public class Main {
    
    public static void main(String[] args) {
        
        Guerreiro joao = new Guerreiro();
        Oraculo oraculo = new Oraculo();
        
        oraculo.guerreiro = joao;
        
        joao.setNome("joao");
        oraculo.setNome("Oraculo");
        oraculo.setVidas();
        
        oraculo.prologoIntroducao();

        oraculo.loadLevel1();
    }
}
