import javax.swing.JOptionPane;

public class operacoes {
    public static int selectMenu() {
        String message =
        "1 - Gerenciar clientes \n"
        +"2 - Gerenciar peças \n"
        +"3 - Gerenciar serviços \n"
        +"4 - Gerenciar ordens de serviço \n"
        +"5 - Consultar total vendido em um período \n"
        +"6 - Sair do programa \n";

        String option = JOptionPane.showInputDialog(null, message);

        return Integer.parseInt(option);
    }
}
