import java.text.DecimalFormat;
import java.text.NumberFormat;
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


    public ArrayList<Cliente> getBD_Clientes() {
        return BD_Clientes;
    }
    public void addCliente(Cliente cliente) {
        BD_Clientes.add(cliente);
    }
    public Cliente consultarClientebyCPF(String cpfSearch) {
        
        Iterator<Cliente> iterator = BD_Clientes.iterator();
        while (iterator.hasNext()) {
            Cliente c = iterator.next();
            if (c.getCpf().equals(cpfSearch)) {
                return c;
            }
        }

        return null;
    }
   
    

    

    
}
