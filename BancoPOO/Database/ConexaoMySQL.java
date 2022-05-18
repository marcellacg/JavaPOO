package database;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import contas.ContaCorrente;
import contas.ContaEspecial;
import contas.TipoDeConta;
import contas.ContaPoupanca;
import sistema.Banco;
import sistema.Historico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConexaoMySQL {
    public static String status = "Não conectou...";

    public ConexaoMySQL() {
    }

    public static Connection getConexaoMySQL() {
        Connection connection = null;

        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);
            String serverName = "localhost:3306";
            String mydatabase = "projetobanco";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";
            String password = "root1234";
            connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                status = "STATUS--->Conectado com sucesso!";
            } else {
                status = "STATUS--->Não foi possivel realizar conexão. Tente novamente.";
            }

            return connection;
        } catch (ClassNotFoundException var7) {
            System.out.println("O driver expecificado não foi encontrado." + var7);
            return null;
        } catch (SQLException var8) {
            System.out.println("Nao foi possível conectar ao Banco de Dados." + var8);
            var8.printStackTrace();
            return null;
        }
    }

    public static String statusDaConexao() {
        return status;
    }

    public static boolean fecharConexao() {
        try {
            getConexaoMySQL().close();
            return true;
        } catch (SQLException var1) {
            return false;
        }
    }

    public static Connection reiniciarConexao() {
        fecharConexao();
        return getConexaoMySQL();
    }

    public static boolean cadastrarBanco(Banco banco) {
        try {
            Statement stmt = getConexaoMySQL().createStatement();
            String sql = "INSERT INTO banco (nome) VALUES('" + banco.getNome() + "')";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException var3) {
            System.out.println(var3);
            return false;
        }
    }

    public static boolean cadastrarConta(TipoDeConta conta, Integer banco) {
        try {
            Statement stmt = getConexaoMySQL().createStatement();
            String sql = "INSERT INTO conta (numeroDaConta, numeroDaAgencia,  cliente, tipo, ativa,  saldo, limite, banco) VALUES('" + conta.getNumeroDaConta() + "','" + conta.getNumeroDaAgencia() + "','" + conta.getCliente() + "','" + conta.getTipo() + "'," + conta.getAtiva() + "," + conta.getSaldo() + "," + conta.getLimit() + "," + banco + ")";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException var4) {
            System.out.println(var4);
            return false;
        }
    }

    public static List<Banco> getBancos() {
        try {
            Statement stmt = getConexaoMySQL().createStatement();
            String sql = "SELECT * FROM Banco";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList bancos = new ArrayList();

            while(rs.next()) {
                Banco banco = new Banco(Integer.parseInt(rs.getString("idBanco")), rs.getString("nome"));
                bancos.add(banco);
            }

            return bancos;
        } catch (SQLException var5) {
            System.out.println(var5);
            return new ArrayList();
        }
    }

    public static List<Historico> listarHistorico(Integer contaId) {
        try {
            Statement stmt = getConexaoMySQL().createStatement();
            String sql = "SELECT * FROM Historico WHERE conta = " + contaId + "";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList historicos = new ArrayList();

            while(rs.next()) {
                Historico historico = new Historico(rs.getString("operacao"), rs.getString("data"), Double.parseDouble(rs.getString("valor")));
                historicos.add(historico);
            }

            return historicos;
        } catch (SQLException var6) {
            System.out.println(var6);
            return new ArrayList();
        }
    }

    public static List<TipoDeConta> getContas() {
        try {
            Statement stmt = getConexaoMySQL().createStatement();
            String sql = "SELECT * FROM Conta";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList contas = new ArrayList();

            while(rs.next()) {
                TipoDeConta conta = null;
                if (rs.getString("tipo").equals("CONTA CORRENTE")) {
                    conta = new ContaCorrente();
                } else if (rs.getString("tipo").equals("CONTA ESPECIAL")) {
                    conta = new ContaEspecial();
                } else {
                    conta = new ContaPoupanca();
                }

                ((TipoDeConta)conta).setId(Integer.parseInt(rs.getString("id")));
                ((TipoDeConta)conta).setNumeroDaConta(rs.getString("cliente"));
                ((TipoDeConta)conta).setNumeroDaAgencia(rs.getString("agencia"));
                ((TipoDeConta)conta).setAtiva(Integer.parseInt(rs.getString("ativa")));
                ((TipoDeConta)conta).setSaldo(Double.parseDouble(rs.getString("saldo")));
                ((TipoDeConta)conta).setTipo(rs.getString("tipo"));
                ((TipoDeConta)conta).setLimit(Double.parseDouble(rs.getString("limite")));
                contas.add(conta);
            }

            return contas;
        } catch (SQLException var5) {
            System.out.println(var5);
            return new ArrayList();
        }
    }

    public static boolean atualizarSaldo(Integer idConta, Double saldo) {
        try {
            Statement stmt = getConexaoMySQL().createStatement();
            String sql = "UPDATE conta SET saldo=" + saldo + " WHERE idConta = " + idConta + ";";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException var4) {
            System.out.println(var4);
            return false;
        }
    }

    public static TipoDeConta listarConta(Integer codigoBanco, String numero, String agencia) {
        try {
            Statement stmt = getConexaoMySQL().createStatement();
            String sql = "SELECT * FROM conta WHERE banco = " + codigoBanco + " && numero LIKE '" + numero + "' && agencia LIKE '" + agencia + "';";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            TipoDeConta conta = null;
            if (rs.getString("tipo").equals("CONTA CORRENTE")) {
                conta = new ContaCorrente();
            } else if (rs.getString("tipo").equals("CONTA ESPECIAL")) {
                conta = new ContaEspecial();
            } else {
                conta = new ContaPoupanca();
            }

            ((TipoDeConta)conta).setId(Integer.parseInt(rs.getString("idConta")));
            ((TipoDeConta)conta).setNumeroDaConta(rs.getString("numero"));
            ((TipoDeConta)conta).setCliente(rs.getString("cliente"));
            ((TipoDeConta)conta).setNumeroDaAgencia(rs.getString("agencia"));
            ((TipoDeConta)conta).setAtiva(Integer.parseInt(rs.getString("ativa")));
            ((TipoDeConta)conta).setSaldo(Double.parseDouble(rs.getString("saldo")));
            ((TipoDeConta)conta).setTipo(rs.getString("tipo"));
            ((TipoDeConta)conta).setLimit(Double.parseDouble(rs.getString("limite")));
            return (TipoDeConta)conta;
        } catch (SQLException var7) {
            System.out.println(var7);
            return null;
        }
    }

    public static boolean atualizarStatus(Integer idConta, Integer status) {
        try {
            Statement stmt = getConexaoMySQL().createStatement();
            String sql = "UPDATE conta SET ativa=" + status + " WHERE idConta = " + idConta + ";";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException var4) {
            System.out.println(var4);
            return false;
        }
    }

    public static boolean salvaHistorico(Historico historico) {
        try {
            Statement stmt = getConexaoMySQL().createStatement();
            String sql = "INSERT INTO historico (operacao, data, valor,  conta) VALUES('" + historico.getTipoDeMovimentacao() + "','" + historico.getData() + "'," + historico.getValor() + "," + historico.getConta() + ")";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException var3) {
            System.out.println(var3);
            return false;
        }
    }
}