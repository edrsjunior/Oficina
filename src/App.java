import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int option=0;
        Oficina raimundoAutos = new Oficina();

        while(option != 6){
        option = operacoes.selectMenu();
            if (option == 1) {
                while(option != 6){
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
                if(option == 6)
                    if(JOptionPane.showConfirmDialog(null, "Certeza que deseja voltar?", "VOLTAR", JOptionPane.YES_NO_OPTION)==0){
                        option = 0;
                        break;
                    }
                    else{
                        option = 0;
                    }
                    
                }
                
                
            }

            if (option == 2) {
                while(option != 6){
                    option = operacoes.gerenciarPecasORServices("GERENCIAR PEÇAS");
                        if (option == 1) {
                            raimundoAutos.addPeca(operacoes.cadastrarPeca());
                        }
                        if (option == 2) {
                            Peca pFinded = raimundoAutos.findPecaByCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "CODE TO SEARCH")));
                            if (pFinded == null) {
                                JOptionPane.showMessageDialog(null, "PEÇA NÃO ENCONTRADA");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, pFinded.toString());
                            }
                        }
                        if (option == 3) {
                            if(raimundoAutos.deletePecaByCode(Integer.parseInt(JOptionPane.showInputDialog(null, "CODE TO DELETE")))){
                                JOptionPane.showMessageDialog(null, "DELETADO COM SUCESSO");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "CODE NÃO ENCONTRADO");
                            }
                        }
                        if (option == 4) {
                            int pecaEdit = Integer.parseInt(JOptionPane.showInputDialog(null, "CODIGO TO EDIT"));
                            if(raimundoAutos.pecaExists(pecaEdit)){
                                Peca p = operacoes.cadastrarPeca();

                                if(raimundoAutos.editPecaByCode(pecaEdit, p.getDescricao(), p.getPreco(),p.getQtdeEstoque())){
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
                    }
                }

            /*
            if (option == 2) {
                System.out.println("GERENCIAR PEÇAS");
                option = operacoes.gerenciarPecasORServices("PEÇAS");
            }*/
            if (option == 3) {
                System.out.println("GERENCIAR SERVICOS");
                while(option != 6){
                    option = operacoes.gerenciarPecasORServices("SERVIÇOS");
                    if (option == 1) {
                        raimundoAutos.addServico(operacoes.cadastrarServico());
                    }
                    if (option == 2) {
                        Servico sFinded = raimundoAutos.findServicebyCode(Integer.parseInt(JOptionPane.showInputDialog(null, "CODE TO SEARCH")));
                        if (sFinded == null) {
                            JOptionPane.showMessageDialog(null, "SERVIÇO NÃO ENCONTRADO");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, sFinded.toString());
                        }
                    }
                    if (option == 3) {
                        if(raimundoAutos.deleteServiceByCode(Integer.parseInt(JOptionPane.showInputDialog(null, "CODE TO DELETE")))){
                            JOptionPane.showMessageDialog(null, "DELETADO COM SUCESSO");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "CODE NÃO ENCONTRADO");
                        }
                    }
                    if (option == 4) {
                        int codeEdit = Integer.parseInt(JOptionPane.showInputDialog(null, "CODE TO EDIT"));
                        if(raimundoAutos.serviceExists(codeEdit)){
                            Servico s = operacoes.cadastrarServico();
                            
    
                            if(raimundoAutos.editServiceByCode(codeEdit, s.getDescricao(), s.getPreco(),s.getTempoExecucao())){
                                JOptionPane.showMessageDialog(null, "ALTERADO COM SUCESSO");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "INTERNAL ERROR");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "CODE NÃO ENCONTRADO");
                        }
                    }
                    if (option == 5) {
                        JOptionPane.showMessageDialog(null, raimundoAutos.getAllServices());
                    }
                    if(option == 6)
                        if(JOptionPane.showConfirmDialog(null, "Certeza que deseja voltar?", "VOLTAR", JOptionPane.YES_NO_OPTION)==0){
                            option = 0;
                            break;
                        }
                        else{
                            option = 0;
                        }
                        
                    }

                
            }
            if (option == 4) {
                System.out.println("GERENCIAR ORDEM DE SERVICO");
                option = operacoes.gerenciarOS();
            }
            if (option == 5) {
                System.out.println("CONSULTAR TOTAL VENDIDO EM UM PERIODO");
                //operacoes.consultarTotalVendas();
            }
            if (option == 6) {
                if(JOptionPane.showConfirmDialog(null, "Certeza que deseja sair?", "SAIR", JOptionPane.YES_NO_OPTION)==0){
                    option = 0;
                    break;
                }
                else{
                    option = 0;
                }
            }
        } 
    }
}
