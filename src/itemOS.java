import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class itemOS {
    private String tipoItem;
    private float preco;
    private int qtde;

    Locale local = new Locale("pt","BR")

    public String getTipoItem() {
        return tipoItem;
    }
    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    
}
