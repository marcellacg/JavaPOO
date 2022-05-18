import contas.ContaCorrente;
import contas.ContaEspecial;
import contas.TipoDeConta;
import contas.ContaPoupanca;
import sistema.Banco;
import sistema.Sistema;

import javax.swing.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
      // Cria o objeto sistema
        Sistema sistema = new Sistema();

        Scanner input = new Scanner(System.in);
        int opcao = 1;
        while (opcao != 0){

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                            "----- BANCO JUJUBA -----" +
                                    "\n\nPara continuar, digite uma opção:\n" +
                                    "\n1 - Cadastrar novo Banco" +
                                    "\n2 - Listar Banco" +
                                    "\n3 - Cadastrar nova Conta" +
                                    "\n4 - Depositar" +
                                    "\n5 - Sacar" +
                                    "\n6 - Transferir" +
                                    "\n7 - Exibir saldo" +
                                    "\n8 - Exibir extrato" +
                                    "\n9 - Ver rendimentos" +
                                    "\n10 - Desativar conta" +
                                    "\n11 - Reativar conta" +
                                    "\n0 - Sair"));

            if(opcao == 1){
                String nomeBanco = JOptionPane.showInputDialog(
                        "----- CADASTRO DE NOVO BANCO -----" +
                        "\nNome do Banco a ser cadastrado");

                sistema.cadastrarBanco(new Banco(nomeBanco));
            }else if(opcao == 2){
               JOptionPane.showMessageDialog(null, "----- LISTA DOS BANCOS CADASTRADOS -----");
                sistema.listarBancos();
            }else if(opcao == 3){
                String cliente = JOptionPane.showInputDialog(
                        "----- CADASTRAR NOVA CONTA -----" +
                        "\nInforme o nome do cliente:");
                String numeroDaConta = JOptionPane.showInputDialog(
                        "----- CADASTRAR NOVA CONTA -----" +
                        "\nInforme o número da conta:");
                String numeroDaAgencia = JOptionPane.showInputDialog(
                        "----- CADASTRAR NOVA CONTA -----" +
                        "\nInforme o número da agência:");
                String saldo = JOptionPane.showInputDialog(
                        "----- CADASTRAR NOVA CONTA -----" +
                                "\nInforme o valor desejado para abrir a conta:");
                String tipo = JOptionPane.showInputDialog(
                        "----- CADASTRAR NOVA CONTA -----" +
                                "\nQual tipo de conta deseja abrir?" +
                                "\n\nEscolha uma das opções: " +
                                "\n1 - Conta Corrente" +
                                "\n2 - Conta Poupança " +
                                "\n3 - Conta Especial");

                JOptionPane.showMessageDialog(null,
                        "Informe o código do banco:" +
                        "\nOpcões na próxima tela!");

                sistema.listarBancos();

                String banco = JOptionPane.showInputDialog("Digite código do banco desejado: ");
                TipoDeConta conta = null;

                if(tipo.equals("1")){
                    conta = new ContaPoupanca(cliente, numeroDaConta, numeroDaAgencia,  Double.parseDouble(saldo), 0.0);
                }else  if(tipo.equals("2")) {
                    conta = new ContaCorrente(cliente, numeroDaConta, numeroDaAgencia,  Double.parseDouble(saldo), 0.0);
                }else  if(tipo.equals("3")) {
                    System.out.println("Informe o limit da conta especial: ");
                    String limit = input.nextLine();
                    conta = new ContaEspecial(cliente, numeroDaConta, numeroDaAgencia,  Double.parseDouble(saldo), Double.parseDouble(limit));
                }
                sistema.cadastrarConta(conta, Integer.parseInt(banco));
            }
            else if(opcao == 4){
                System.out.println("############ Depositar ##############");
                System.out.println("Informe o número da conta:");
                String numero = input.nextLine();
                System.out.println("Informe a agência:");
                String agencia = input.nextLine();
                System.out.println("Informe o código do banco (veja as opções a seguir):");
                sistema.listarBancos();
                String banco = input.nextLine();
                System.out.println("Informe o valor a ser depositado:");
                String valor = input.nextLine();
                sistema.depositar(Integer.parseInt(banco), numero, agencia, Double.parseDouble(valor));
            }
            else if(opcao == 5){
                System.out.println("############ Sacar ##############");
                System.out.println("Informe o número da conta:");
                String numero = input.nextLine();
                System.out.println("Informe a agência:");
                String agencia = input.nextLine();
                System.out.println("Informe o código do banco (veja as opções a seguir):");
                sistema.listarBancos();
                String banco = input.nextLine();
                System.out.println("Informe o valor a ser sacado:");
                String valor = input.nextLine();
                sistema.sacar(Integer.parseInt(banco), numero, agencia, Double.parseDouble(valor));
            }else if(opcao == 6){
                System.out.println("############ Transferir ##############");
                System.out.println("Informe o número da conta:");
                String numero = input.nextLine();
                System.out.println("Informe a agência:");
                String agencia = input.nextLine();
                System.out.println("Informe o código do banco (veja as opções a seguir):");
                sistema.listarBancos();
                String banco = input.nextLine();


                System.out.println("Informe o número da conta Destino:");
                String numeroDestino = input.nextLine();
                System.out.println("Informe a agência da conta Destino:");
                String agenciaDestino = input.nextLine();
                System.out.println("Informe o código do banco da conta Destino (veja as opções a seguir):");
                sistema.listarBancos();
                String bancoDestino = input.nextLine();

                System.out.println("Informe o valor a ser transferido:");
                String valor = input.nextLine();

                sistema.transferir(Integer.parseInt(banco), numero, agencia, Integer.parseInt(bancoDestino), numeroDestino, agenciaDestino, Double.parseDouble(valor));
            }else if(opcao == 7){
                System.out.println("############ Exibir saldo ##############");
                System.out.println("Informe o número da conta:");
                String numero = input.nextLine();
                System.out.println("Informe a agência:");
                String agencia = input.nextLine();
                System.out.println("Informe o código do banco (veja as opções a seguir):");
                sistema.listarBancos();
                String banco = input.nextLine();
                sistema.exibirSaldo(Integer.parseInt(banco), numero, agencia);
            }else if(opcao == 8){
                System.out.println("############ Exibir extrato ##############");
                System.out.println("Informe o número da conta:");
                String numero = input.nextLine();
                System.out.println("Informe a agência:");
                String agencia = input.nextLine();
                System.out.println("Informe o código do banco (veja as opções a seguir):");
                sistema.listarBancos();
                String banco = input.nextLine();
                sistema.exibirExtrato(Integer.parseInt(banco), numero, agencia);
            }else if(opcao == 9){
                System.out.println("############ ver rendimento ##############");
            }else if(opcao == 10){
                System.out.println("############ Desativar conta ##############");
                System.out.println("Informe o número da conta:");
                String numero = input.nextLine();
                System.out.println("Informe a agência:");
                String agencia = input.nextLine();
                System.out.println("Informe o código do banco (veja as opções a seguir):");
                sistema.listarBancos();
                String banco = input.nextLine();
                sistema.encerrarConta(Integer.parseInt(banco), numero, agencia);
            }else if(opcao == 11){
                System.out.println("############ Reativar conta ##############");
                System.out.println("Informe o número da conta:");
                String numero = input.nextLine();
                System.out.println("Informe a agência:");
                String agencia = input.nextLine();
                System.out.println("Informe o código do banco (veja as opções a seguir):");
                sistema.listarBancos();
                String banco = input.nextLine();
                sistema.reativarConta(Integer.parseInt(banco), numero, agencia);
            }else if(opcao == 0){
                System.out.println("############ Finalizando sistema ##############");
                break;
            }
        }

/*
        System.out.println("############ Cadastrar banco ##############");
        sistema.cadastrarBanco(new sistema.Banco("Santander"));
        sistema.cadastrarBanco(new sistema.Banco("Brasil"));
        sistema.cadastrarBanco(new sistema.Banco("Bradesco"));


        System.out.println("############ Cadastrar conta ##############");

        contas.ContaGeral contaCorrente = new contas.ContaCorrente("Bendo Gonçalves", "123451-x", "1234", 50.0, 0.0);
        contas.ContaGeral contaEspecial = new contas.ContaEspecial("Bendo Gonçalves", "123452-x", "1234",  50.0,  1000.0);
        contas.ContaGeral contaPoupanca = new contas.ContaPoupanca("Bendo Gonçalves", "123453-x", "1235",  50.0, 0.0);
        sistema.cadastrarConta(contaCorrente, 1);
        sistema.cadastrarConta(contaEspecial, 2);
        sistema.cadastrarConta(contaPoupanca, 1);


        System.out.println("############ Depositar conta ##############");
        sistema.depositar(1, "123451-x", "1234", 1000.0);
        sistema.depositar(2, "123452-x", "1234", 150.0);
        sistema.depositar(1, "123453-x", "1235", 100.0);

        System.out.println("############ Exibir saldo ##############");
        sistema.exibirSaldo(1, "123451-x", "1234");
        sistema.exibirSaldo(2, "123452-x", "1234");
        sistema.exibirSaldo(1, "123453-x", "1235");

        System.out.println("############ Sacar conta ##############");
        sistema.sacar(1, "123451-x", "1234", 100.0);
        sistema.sacar(2, "123452-x", "1234", 10.0);
        sistema.sacar(1, "123453-x", "1235", 10.0);


        System.out.println("############ Transferir ##############");
        sistema.transferir(1, "123451-x", "1234", 1, "123453-x", "1235", 10.0);
        sistema.transferir(2, "123452-x", "1234", 1, "123453-x", "1235", 10.0);



        System.out.println("############ Encerrar conta ##############");
        sistema.encerrarConta(1, "123451-x", "1234");
        sistema.sacar(1, "123451-x", "1234", 940.0);
        sistema.encerrarConta(1, "123451-x", "1234");


        System.out.println("############ Reativar conta ##############");
        sistema.reativarConta(1, "123451-x", "1234");

        System.out.println("############ Exibir extrato ##############");
        sistema.exibirExtrato(1, "123451-x", "1234");*/

    }
}
