import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.Locale;

public class Servico {
    private int codServico;
    private String descricao;
    private float preco;
    private LocalTime tempoExecucao;

    

    public Servico(int codServico, String descricao, float preco, LocalTime tempoExecucao) {
        this.codServico = codServico;
        this.descricao = descricao;
        this.preco = preco;
        this.tempoExecucao = tempoExecucao;
    }

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
    public LocalTime getTempoExecucao() {
        return tempoExecucao;
    }
    public void setTempoExecucao(LocalTime tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    @Override
    public String toString() {
        NumberFormat formaterMoeda = NumberFormat.getCurrencyInstance(Locale.getDefault());

        String dados = 
        "============================\n"
        +"CODE: "+this.getCodServico()+"\n"
        +"DESC: "+this.getDescricao()+"\n"
        +"PREÇO: "+formaterMoeda.format(this.getPreco())+"\n"
        +"TEMPO ESTIMADO DE EXECUÇÃO: "+this.getTempoExecucao().toString()+"\n"
        +"===========================";

        return dados;
    }
}
