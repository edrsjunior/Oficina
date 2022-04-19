public class itemOS {
    private char tipoItem;
    private float preco;
    private int qtde;

    /*
    public itemOS(char tipoItem) {
        if ('P'==this.tipoItem) {
            return new itemOS('P');
        }
        if ('S'==this.tipoItem) {
            return new itemOS('S');
        }
    }
    */

    
  
    public itemOS(char tipoItem, float preco) {
        this.tipoItem = tipoItem;
        this.preco = preco;
    }



    public char getTipoItem() {
        return tipoItem;
    }
    public void setTipoItem(char tipoItem) {
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
