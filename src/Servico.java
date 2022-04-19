import java.time.Instant;

public class Servico {
    private int codServico;
    private String descricao;
    private float preco;
    private Instant tempoExecucao;
    public int getCodServico() {
        return codServico;
    }
    public void setCodServico(int codServico) {
        this.codServico = codServico;
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
    public Instant getTempoExecucao() {
        return tempoExecucao;
    }
    public void setTempoExecucao(Instant tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    
}
