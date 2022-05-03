import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrdemServico {
    private int numeroOS;
    private LocalDateTime dataOS;
    private LocalDateTime dataPrevTermino;
    private LocalDateTime dataTermino;
    private String placaCarro;
    private char situacao;
    private ArrayList<itemOS> itens = new ArrayList<itemOS>();

    
    

    public OrdemServico(int numeroOS, LocalDateTime dataPrevTermino,
            String placaCarro, ArrayList<itemOS> itensInput) {
        
        
        this.numeroOS = numeroOS;
        this.dataOS = LocalDateTime.now();
        this.dataPrevTermino = dataPrevTermino;
        this.placaCarro = placaCarro;
        this.situacao = 'A';
        this.itens = itensInput;
    }


    public OrdemServico(int numeroOS) {
        this.situacao = 'A';
        this.numeroOS = numeroOS;
        this.dataOS = LocalDateTime.now();
    }


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
    
    public void addItens(itemOS item) {
        this.itens.add(item);
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

    
    public boolean finalizar(){
        if(situacao=='A'){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean cancelar(){
        if(situacao=='A'){
            return true;
        }
        else{
            return false;
        }
    }
}
