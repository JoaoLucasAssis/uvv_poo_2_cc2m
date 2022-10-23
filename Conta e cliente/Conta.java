public class Conta {
    
    private double saldo;
    protected Cliente titular;
    
    public boolean saca(double valor) {
        if (verificarTranslacao(valor)) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    private boolean verificarTranslacao(double valor) {
        return saldo >= valor;
    }
    
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public void transfere(Conta destino, double valor) {
        if (this.saca(valor))
            destino.deposita(valor);
        else
            System.out.println("Transferencia nao realizada. Saldo insuficiente.");
    }   

    public void getSaldo() {
        System.out.println(saldo);
    }
    
}