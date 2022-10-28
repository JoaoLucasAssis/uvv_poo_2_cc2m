import java.util.HashMap;

public class Loja {
    
    HashMap<Integer, Pedido> listaPedido = new HashMap<>();

    public void menu() {
        System.out.println("metodos:");
        System.out.println("inserirPedido(int i, Pedido p)\nbuscarPedido(int i)");
        System.out.println("trocarPedido(int i, Pedido p)\nremoverPedido(int i)\nverLista()\nlimparLista()");
    }
    
    public void inserirPedido(int i, Pedido p) {
        listaPedido.put(i, p);
    }
    public void buscarPedido(int i) {
        System.out.println("PedidoID: "+listaPedido.get(i));
    }
    public void trocarPedido(int i, Pedido p){
        listaPedido.replace(i, p);
    }
    public void removerPedido(int i) {
        listaPedido.remove(i);
    }
    
    public void verLista() {
        System.out.println(listaPedido.toString());
    }
    public void limparLista() {
        listaPedido.clear();
    }
    
    public static void main(String[] args) {
    }
}