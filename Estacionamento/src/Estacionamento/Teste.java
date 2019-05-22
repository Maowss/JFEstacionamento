package Estacionamento;

import java.sql.*;
import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();
        CarroBean cbean = new CarroBean();
        CarroDAO cdao = new CarroDAO(con);

//        cbean.setPlaca("FLS1920");
//        cbean.setCor("ielou");
//        cbean.setDescricao("Maowss 43");
//
//        System.out.println(cdao.inserir(cbean)); //AQUI INSERE OS ATRIBUTOS DO CARRO.
//        cbean.setPlaca("ATM1927");
//        cbean.setCor("Grinza");
//        cbean.setDescricao("Maowss 12");
//        System.out.println(cdao.alterar(cbean)); //AQUI ALTERA OS ATRIBUTOS DO CARRO COM BASE NA PLACA (pois ela é PK no bd)
//        cbean.setPlaca("FLS1920");
//        System.out.println(cdao.excluir(cbean)); //AQUI EXCLUI COM BASE NA PLACA;
        List<CarroBean> lista = cdao.listarTodos();

        if (lista != null) {
            for (CarroBean carro : lista) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Descrição: " + carro.getDescricao());
                System.out.println("\n");
            }
            Conexao.fecharConexao(con); //FECHA A CONEXÃO COM O BANCO DE DADOS
        }

    }
}
