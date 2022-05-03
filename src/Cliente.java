public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String fone;

    
    

    public Cliente(String nome, String cpf, String endereco, String fone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.fone = fone;
    }

    

    public Cliente(Cliente c) {
        this.nome = c.getNome();
        this.cpf = c.getCpf();
        this.endereco = c.getEndereco();
        this.fone = c.getFone();
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        String dados = 
        "============================\n"
        +"NOME: "+this.getNome()+"\n"
        +"CPF: "+this.getCpf()+"\n"
        +"ENDERECO: "+this.getEndereco()+"\n"
        +"FONE: "+this.getFone()+"\n"
        +"===========================";

        return dados;
    }

    
}
