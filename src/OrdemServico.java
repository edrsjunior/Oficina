import java.time.LocalDateTime;

public class OrdemServico {
    private int numeroOS;
    private LocalDateTime dataOS;
    private LocalDateTime dataPrevTermino;
    private LocalDateTime dataTermino;
    private String placaCarro;
    private char situacao;

    public int getNumeroOS() {
        return numeroOS;
    }
    public void setNumeroOS(int numeroOS) {
        this.numeroOS = numeroOS;
    }
    public LocalDateTime getDataOS() {
        return dataOS;
    }
    public void setDataOS(LocalDateTime dataOS) {
        this.dataOS = dataOS;
    }
    public LocalDateTime getDataPrevTermino() {
        return dataPrevTermino;
    }
    public void setDataPrevTermino(LocalDateTime dataPrevTermino) {
        this.dataPrevTermino = dataPrevTermino;
    }
    public LocalDateTime getDataTermino() {
        return dataTermino;
    }
    public void setDataTermino(LocalDateTime dataTermino) {
        this.dataTermino = dataTermino;
    }
    public String getPlacaCarro() {
        return placaCarro;
    }
    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }
    public char getSituacao() {
        return situacao;
    }
    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
    
    @Override
    public String toString() {
        return "OrdemServico" 
                +"========================"
                +"[Data da Ordem=" + dataOS.toString() + "\n" 
                +"Previsão Termino=" + dataPrevTermino +"\n"
                + "Termino="+ dataTermino +"\n"
                + "OS ID=" + numeroOS + "\n"
                +"placaCarro=" + placaCarro + "\n" 
                +"situacao=" + situacao
                + "]";
    }

    
    
}
