public class itemOS {
    private String tipoItem;
    private int cod;
    private int qtde;
    
  
    public itemOS(String tipoItem, int code, float preco) {
        this.tipoItem = tipoItem;
        this.cod = code;
    }



    public String getTipoItem() {
        return tipoItem;
    }
    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
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
