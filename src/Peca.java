public class Peca {
    private int codPeca;
    private String descricao;
    private float preco;
    private int qtdeEstoque;

    
    

    public Peca(int codPeca, String descricao, float preco, int qtdeEstoque) {
        this.codPeca = codPeca;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdeEstoque = qtdeEstoque;
    }

    public int getCodPeca() {
        return codPeca;
    }
    public void setCodPeca(int codPeca) {
        this.codPeca = codPeca;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQtdeEstoque() {
        return qtdeEstoque;
    }
    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    @Override
        public String toString() {
        String dados = 
        "============================\n"
        +"CÓDIGO: "+this.getCodPeca()+"\n"
        +"DESCRIÇÃO: "+this.getDescricao()+"\n"
        +"PREÇO: "+this.getPreco()+"\n"
        +"ESTOQUE: "+this.getQtdeEstoque()+"\n"
        +"===========================";

        return dados;
    }

}
