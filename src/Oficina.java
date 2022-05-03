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
    public void openOS(OrdemServico os) {
        BD_OS.add(os);
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
        Iterator<Servico> iterator = BD_Servico.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCodServico()==codeToDelete) {
                iterator.remove();
                return true;
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
}
