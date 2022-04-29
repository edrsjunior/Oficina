import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int option = operacoes.selectMenu();
        Oficina raimundoAutos = new Oficina();

        if (option == 1) {
            do{
            option = operacoes.gerenciarClient();
            if (option == 1) {
                raimundoAutos.addCliente(operacoes.cadastrarCliente());
            }
            if (option == 2) {
                Cliente cFinded = raimundoAutos.findClientebyCPF(JOptionPane.showInputDialog(null, "CPF TO SEARCH"));
                if (cFinded == null) {
                    JOptionPane.showMessageDialog(null, "CLIENTE NÃO ENCONTRADO");
                }
                else{
                    JOptionPane.showMessageDialog(null, cFinded.toString());
                }
            }
            if (option == 3) {
                if(raimundoAutos.deleteClienteByCpf(JOptionPane.showInputDialog(null, "CPF TO DELETE"))){
                    JOptionPane.showMessageDialog(null, "DELETADO COM SUCESSO");
                }
                else{
                    JOptionPane.showMessageDialog(null, "CPF NÃO ENCONTRADO");
                }
            }
            if (option == 4) {
                String cpfEdit = JOptionPane.showInputDialog(null, "CPF TO EDIT");
                if(raimundoAutos.clientExists(cpfEdit)){
                    Cliente c = operacoes.cadastrarCliente();
                    

                    if(raimundoAutos.editClienteByCpf(cpfEdit, c.getNome(), c.getCpf(),c.getEndereco(),c.getFone())){
                        JOptionPane.showMessageDialog(null, "ALTERADO COM SUCESSO");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "INTERNAL ERROR");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "CPF NÃO ENCONTRADO");
                }
            }
            if (option == 5) {
                JOptionPane.showMessageDialog(null, raimundoAutos.getAllClientes());
            }
            option = JOptionPane.showConfirmDialog(null, "Voltar", "VOLTAR", JOptionPane.YES_NO_OPTION);
            
            }while(option == 0);
        }
        if (option == 2) {
            System.out.println("GERENCIAR PEÇAS");
            option = operacoes.gerenciarPecasORServices();
        }
        if (option == 3) {
            System.out.println("GERENCIAR SERVICOS");
            option = operacoes.gerenciarPecasORServices();
        }
        if (option == 4) {
            System.out.println("GERENCIAR ORDEM DE SERVICO");
            option = operacoes.gerenciarOS();
        }
        if (option == 5) {
            System.out.println("CONSULTAR TOTAL VENDIDO EM UM PERIODO");
            //operacoes.consultarTotalVendas();
        }
        if (option == 4) {
            System.out.println("GERENCIAR ORDEM DE SERVICO");
            option = operacoes.gerenciarOS();
        }
    }
}
