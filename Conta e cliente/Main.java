public class Main {
    public static void main(String[] args) {

        Cliente c01 = new Cliente("Joao", "Vitoria", "123.456.789-00");
        Cliente c02 = new Cliente("Lucas", "Vila Velha", "789.456.123-00");

        Conta cc01 = new Conta();
        Conta cc02 = new Conta();

        cc01.titular = c01;
        cc02.titular = c02;

        cc01.titular.getDados();
        cc02.titular.getDados();

        cc01.deposita(1200);
        cc02.deposita(1500);

        cc01.getSaldo();
        cc02.getSaldo();
        
        cc01.transfere(cc02, 150);
        
        cc01.getSaldo();
        cc02.getSaldo();
    }
}
