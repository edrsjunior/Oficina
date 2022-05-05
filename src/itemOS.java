public class itemOS {
    private String tipoItem;
    private int cod;
    private float preco;
    private int qtde;
    
  
    public itemOS(String tipoItem, int code, float preco) {
        this.tipoItem = tipoItem;
        this.preco = preco;
        this.cod = code;
    }



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
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    

    
}
