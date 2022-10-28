import java.util.Date;
import java.util.HashMap;

public class Pedido {
    
    private Date dataEmissao;
    
    HashMap<String, Integer> listaItem = new HashMap<>();
    
    public Pedido() {
        this.dataEmissao = new Date();
    }
    
    public void getDataEmissao() {
        System.out.println(dataEmissao);
    }
    
    public void menu(){
        System.out.println("itens:\nCaju\nGoiaba\nMelancia");
    }
    
    public void inserirItem(String item, int qtd) {
        if(("Melancia".equals(item) || "Caju".equals(item) || "Goiaba".equals(item)) && (qtd >= 0))
            listaItem.put(item, qtd);
        else
            System.out.println("Item nao adicionado. [Entrada incorreta de dados]");
    }
    public void buscarItem(String item) {
        if(listaItem.get(item) != null)
            System.out.println("Item ja adicionado.");
        else
            System.out.println("Item nao adicionado.");
    }
    public void buscarQtd(String item) {
        if(listaItem.get(item) != null)
            System.out.println(listaItem.get(item));
        else
            System.out.println("Item nao encontrado.");
    }
    public void trocarQtd(String item, int qtd){
        if(qtd >= 0)
            listaItem.replace(item, qtd);
        else
            System.out.println("Quantidade invalida.");
    }
    public void removerItem(String item) {
        if("Melancia".equals(item) || "Caju".equals(item) || "Goiaba".equals(item))
            listaItem.remove(item);
        else
            System.out.println("Item nao encontrado. [Entrada incorreta de dados]");
    }
    
    public void verLista() {
        System.out.println(listaItem.toString());
    }
    public void limparLista() {
        listaItem.clear();
    }
}