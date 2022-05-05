import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

    public static int gerenciarClient() {
        String message = 
        "1 - Cadastrar \n"
        +"2 - Consultar por CPF \n"
        +"3 - Excluir \n"
        +"4 - Editar \n"
        +"5 - Listar todos os cadastros \n"
        +"6 - Voltar \n";

        String option = JOptionPane.showInputDialog(null, message);

        return Integer.parseInt(option);
    }

    public static int gerenciarPecasORServices(String menuContext) {
        String message = 
        "1 - Cadastrar \n"
        +"2 - Consultar por código \n"
        +"3 - Excluir \n"
        +"4 - Editar \n"
        +"5 - Listar todos os cadastros \n"
        +"6 - Voltar \n";
        
        String option = JOptionPane.showInputDialog(null,message, menuContext,JOptionPane.OK_CANCEL_OPTION);

        return Integer.parseInt(option);
    }

    
    public static int gerenciarOS() {
        String message = 
        "1 - Abrir nova ordem de serviço \n"
        +"2 - Gerenciar Itens \n"
        +"3 - Excluir \n"
        +"4 - Editar \n"
        +"5 - Listar todos as ordens \n"
        +"6 - Voltar \n";

        String option = JOptionPane.showInputDialog(null, message);

        return Integer.parseInt(option);
    }

    public static int gerenciarItens() {
        String message = 
        "1 - Adicionar nova peça \n"
        +"2 - Adicionar serviço \n"
        +"3 - Excluir peça\n"
        +"4 - Excluir Serviço \n"
        +"5 - Consultar Total \n"
        +"6 - Voltar \n";

        String option = JOptionPane.showInputDialog(null, message);

        return Integer.parseInt(option);
    }

    public static Cliente cadastrarCliente() {

        //CRIA MULTIPLOS CAMPOS PARA ACESSAR OS VALORES SEPARADOS
        JTextField nome = new JTextField();
        JTextField cpf = new JTextField();
        JTextField endereco = new JTextField();
        JTextField fone = new JTextField();
        //=====================================================


        //CRIA UM OBJETO MENSAGEM COM GERAL
        Object[] message = {
            "Nome: ", nome,
            "CPF: ", cpf,
            "Endereço", endereco,
            "Fone: ", fone
        };
        //=====================================================

        //CHAMA A JANELINHA COM UM OK OR CANCEL
        int option = JOptionPane.showConfirmDialog(null, message, "INSERIR DADOS CLIENTES: ", JOptionPane.OK_CANCEL_OPTION);
        
        if (option == JOptionPane.OK_OPTION) {
            Cliente tempClient = new Cliente(nome.getText(),cpf.getText(),endereco.getText(),fone.getText());
            return tempClient;
        }
        else{
            return null;
        }

        
    }

    //CADASTRAR PEÇA
    public static Servico cadastrarServico() {
      
        //CRIA MULTIPLOS CAMPOS PARA ACESSAR OS VALORES SEPARADOS
        JTextField codServico = new JTextField();
        JTextField desc = new JTextField();
        JTextField preco = new JTextField();
        JTextField tempoExec = new JTextField();
        //=====================================================


        //CRIA UM OBJETO MENSAGEM COM GERAL
        Object[] message = {
            "Codigo do Serviço: ", codServico,
            "Descrição: ", desc,
            "preco", preco,
            "Tempo Estimado para execução: ", tempoExec
        };
        //=====================================================

        //CHAMA A JANELINHA COM UM OK OR CANCEL
        int option = JOptionPane.showConfirmDialog(null, message, "INSERIR DADOS SERVIÇO: ", JOptionPane.OK_CANCEL_OPTION);
        
        if (option == JOptionPane.OK_OPTION) {
            Servico tempService = new Servico(Integer.parseInt(codServico.getText()),desc.getText(),Float.parseFloat(preco.getText()),LocalTime.parse(tempoExec.getText()));
            return tempService;
        }
        else{
            return null;
        }

        
    }

    //CADASTRAR PEÇA
    public static OrdemServico newOS() {
      
        //CRIA MULTIPLOS CAMPOS PARA ACESSAR OS VALORES SEPARADOS
        JTextField placa = new JTextField();
        JTextField dataEnd = new JTextField();
        JTextField pecaToAdd = new JTextField();
        JTextField typeItem = new JTextField();
        JTextField preco = new JTextField();
        JTextField qntd = new JTextField();
        //=====================================================


        //CRIA UM OBJETO MENSAGEM COM GERAL
        Object[] message = {
            "Placa do Veiculo: ", placa,
            "Data Termino Previa(XX/XX/XXXX HH:mm): ", dataEnd
        };
        //=====================================================

        //CHAMA A JANELINHA COM UM OK OR CANCEL
        int option = JOptionPane.showConfirmDialog(null, message, "INSERIR DADOS OS: ", JOptionPane.OK_CANCEL_OPTION);
        
        DateTimeFormatter formaterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dataEndFormated = LocalDateTime.parse(dataEnd.getText(),formaterDate);

        if (option == JOptionPane.OK_OPTION) {
            System.out.println("GET ITENS OS");
            message = new Object[]{
                "CODIGO DO ITEM/SERVIÇO: ", pecaToAdd,
                "Serviço=A ou Peça=P: ", typeItem,
                "Preço:", preco,
                "Quantidade", qntd
            };
            ArrayList<itemOS> itensToAdd = new ArrayList<itemOS>();
            option = JOptionPane.showConfirmDialog(null, message,"INFORMAÇÔES DO ITEM",JOptionPane.OK_CANCEL_OPTION);
            itensToAdd.add(new itemOS(typeItem.getText(), Integer.parseInt(pecaToAdd.getText()), Float.parseFloat(preco.getText())));

            while(option == JOptionPane.OK_OPTION)
            {
                option = JOptionPane.showConfirmDialog(null, message,"INFORMAÇÔES DO ITEM",JOptionPane.OK_CANCEL_OPTION);
                itensToAdd.add(new itemOS(typeItem.getText(), Integer.parseInt(pecaToAdd.getText()), Float.parseFloat(preco.getText())));
            }

            OrdemServico tempOS = new OrdemServico(dataEndFormated,placa.getText(),itensToAdd);
            return tempOS;
        }
        else{
            return null;
        }

        
    }
}
