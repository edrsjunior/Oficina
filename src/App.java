import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int option = operacoes.selectMenu();
        Oficina raimundoAutos = new Oficina();

        if (option == 1) {
            while(option != 0){
            System.out.println("CADASTRAR CLIENTE");
            option = operacoes.gerenciarClient();
            if (option == 1) {
                raimundoAutos.addCliente(operacoes.cadastrarCliente());
            }
            if (option == 2) {
                Cliente cFinded = raimundoAutos.consultarClientebyCPF(JOptionPane.showInputDialog(null, "CPF TO SEARCH"));
                if (cFinded == null) {
                    JOptionPane.showMessageDialog(null, "CLIENTE NÃO ENCONTRADO");
                }
                else{
                    JOptionPane.showMessageDialog(null, cFinded.getNome());
                }
            }
            option = JOptionPane.showConfirmDialog(null, "SAIR?", "SAIR", JOptionPane.YES_NO_OPTION);
            }
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
