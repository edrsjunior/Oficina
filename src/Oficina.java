import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Oficina {
    Locale local = new Locale("pt","BR");
    NumberFormat formatator = DecimalFormat.getCurrencyInstance(local);

    ArrayList<Peca> BD_Pecas = new ArrayList<Peca>();
    ArrayList<Cliente> BD_Clientes = new ArrayList<Cliente>();
    ArrayList<Servico> BD_Servico = new ArrayList<Servico>();
    ArrayList<OrdemServico> BD_OS = new ArrayList<OrdemServico>();
    
    //É NECESSARIO INICIAR O VALOR DAS OS PARA PUXAR E INCREMENTAR FUTURAMENTE
    public Oficina() {
        BD_OS.add(new OrdemServico(0));
    }
    //----------------------------------------------------------------
    public ArrayList<Cliente> getBD_Clientes() {
        return BD_Clientes;
    }
    public void addCliente(Cliente cliente) {
        BD_Clientes.add(cliente);
    }
    public void addServico(Servico service) {
        BD_Servico.add(service);
    }
    public void addPeca(Peca pc) {
        BD_Pecas.add(pc);
    }


    public Cliente findClientebyCPF(String cpfSearch) {
        
        Iterator<Cliente> iterator = BD_Clientes.iterator();
        while (iterator.hasNext()) {
            Cliente c = iterator.next();
            if (c.getCpf().equals(cpfSearch)) {
                return c;
            }
        }

        return null;
    }

    public Servico findServicebyCode(int codeSearch) {
        
        Iterator<Servico> iterator = BD_Servico.iterator();
        while (iterator.hasNext()) {
            Servico s = iterator.next();
            if (s.getCodServico() == codeSearch) {
                return s;
            }
        }

        return null;
    }

    public Peca findPecabyCode(int codeSearch) {
        
        Iterator<Peca> iterator = BD_Pecas.iterator();
        while (iterator.hasNext()) {
            Peca p = iterator.next();
            if (p.getCodPeca() == codeSearch) {
                return p;
            }
        }

        return null;
    }

    
    
    public boolean clientExists(String cpfSearch) {
        Iterator<Cliente> iterator = BD_Clientes.iterator();
        while (iterator.hasNext()) {
            Cliente c = iterator.next();
            if (c.getCpf().equals(cpfSearch)) {
                return true;
            }
        }

        return false;
    }

    public boolean serviceExists(int codeSearch) {
        Iterator<Servico> iterator = BD_Servico.iterator();
        while (iterator.hasNext()) {
            Servico s = iterator.next();
            if (s.getCodServico()==codeSearch) {
                return true;
            }
        }

        return false;
    }

    public boolean pecaExists(int codeSearch) {
        Iterator<Peca> iterator = BD_Pecas.iterator();
        while (iterator.hasNext()) {
            Peca p = iterator.next();
            if (p.getCodPeca()==codeSearch) {
                return true;
            }
        }

        return false;
    }

    public boolean serviceORPecaHasOS(int cod) {
        Iterator<OrdemServico> iteratorOS = BD_OS.iterator();
        Iterator<itemOS> iteratorItens;
        int cont=0;

        while (iteratorOS.hasNext()) {
            iteratorItens = iteratorOS.next().getItens().iterator();
            while (iteratorItens.hasNext()) {
                if (iteratorItens.next().getCod() == cod) {
                    cont++;
                }
            }
                
        }

        if (cont > 0) {
            return true;
        }
        
        return false;
        
    }

    public boolean deleteClienteByCpf(String cpfToDelete) {
        Iterator<Cliente> iterator = BD_Clientes.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCpf().equals(cpfToDelete)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean deleteServiceByCode(int codeToDelete) {
        if (serviceORPecaHasOS(codeToDelete) == false) {
            Iterator<Servico> iterator = BD_Servico.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getCodServico()==codeToDelete) {
                    iterator.remove();
                    return true;
                }
            }
            
        }
        return false;
    }

    public boolean deletePecaByCode(int codeToDelete) {
        if (serviceORPecaHasOS(codeToDelete) == false) {
            Iterator<Peca> iterator = BD_Pecas.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getCodPeca()==codeToDelete) {
                    iterator.remove();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean editClienteByCpf(String cpfSearch,String nomeEdit, String cpfEdit, String enderecoEdit, String foneEdit) {
        
        Iterator<Cliente> iterator = BD_Clientes.iterator();
        while (iterator.hasNext()) {
            Cliente c = iterator.next();
            if (c.getCpf().equals(cpfSearch)) {
                c.setNome(nomeEdit);
                c.setCpf(cpfEdit);
                c.setEndereco(enderecoEdit);
                c.setFone(foneEdit);
                return true;
            }
        }

        return false;
    }

    public boolean editServiceByCode(int codServico, String descricao, float preco, LocalTime tempoExecucao) {
        
        Iterator<Servico> iterator = BD_Servico.iterator();
        while (iterator.hasNext()) {
            Servico s = iterator.next();
            if (s.getCodServico() == codServico) {
                s.setDescricao(descricao);
                s.setPreco(preco);
                s.setTempoExecucao(tempoExecucao);
                return true;
            }
        }

        return false;
    }

    public boolean editPecaByCode(int codPeca, String descricao, float preco, int qntdAlter) {
        
        Iterator<Peca> iterator = BD_Pecas.iterator();
        while (iterator.hasNext()) {
            Peca p = iterator.next();
            if (p.getCodPeca() == codPeca) {
                p.setDescricao(descricao);
                p.setPreco(preco);
                p.setQtdeEstoque(qntdAlter);
                return true;
            }
        }

        return false;
    }

    public String getAllClientes() {
        
        String allClients = "===========TODOS CLIENTES:=========\n\n";

        Iterator<Cliente> iterator = BD_Clientes.iterator();
        while (iterator.hasNext()) {
            Cliente c = iterator.next();
            allClients += c.toString() +"\n";
        }

        return allClients;
    }

    public String getAllServices() {
        
        String allServices = "===========TODOS SERVIÇOS:=========\n\n";

        Iterator<Servico> iterator = BD_Servico.iterator();
        while (iterator.hasNext()) {
            Servico s = iterator.next();
            allServices += s.toString() +"\n";
        }

        return allServices;
    }

    public String getAllPecas() {
        
        String allPecas = "===========TODAS PECAS:=========\n\n";

        Iterator<Peca> iterator = BD_Pecas.iterator();
        while (iterator.hasNext()) {
            Peca p = iterator.next();
            allPecas += p.toString() +"\n";
        }

        return allPecas;
    }

    public boolean openOS(OrdemServico os) {

        ArrayList<itemOS> checklist = new ArrayList<itemOS>();
        checklist = os.getItens();

        Iterator<itemOS> iterator = checklist.iterator();
        while (iterator.hasNext()) {
            itemOS it = iterator.next();
            if (it.getTipoItem().toLowerCase().equals("s")) {
                if(serviceExists(it.getCod()) == false) {
                    System.err.println("O SERVIÇO "+it.getCod()+" NÃO EXISTE");
                    return false;
                }
            }
            if(it.getTipoItem().toLowerCase().equals("p")){
                if(pecaExists(it.getCod())==false) {
                    System.err.println("A PEÇA "+it.getCod()+" NÃO EXISTE");
                    return false;
                }
                ;
                
                if (findPecabyCode(it.getCod()).getQtdeEstoque() < it.getQtde()) {
                    System.err.println("NÃO TEM A QUANTIDADE DE PEÇAS DISPONIVEIS, ESTOQUE ATUAL: "+findPecabyCode(it.getCod()).getQtdeEstoque());
                    return false;
                }
            }
        }
        return true;


            
       
    }
}
