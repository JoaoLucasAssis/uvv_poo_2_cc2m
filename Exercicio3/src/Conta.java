
public class Conta {
    
    private double saldo;
    private int numero;
    
    public boolean saca(double valor) {
        if (verificarTranslacao(valor)) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saque invalido.");
            return false;
        }
    }
    
    private boolean verificarTranslacao(double valor) {
        return saldo >= valor;
    }
    
    public void deposita(double valor) {
        saldo += valor;
    }
    
    public void transfere(Conta destino, double valor) {
        this.saca(valor);
        destino.deposita(valor);
    }   

    public void getSaldo() {
        System.out.println(saldo);
    }
    
}
