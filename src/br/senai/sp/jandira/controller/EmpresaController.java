package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresaController {

    //Instanciar Conexão
    Conexao conexao = new Conexao();

    //Referência do nosso banco no Controller
    Connection connection = conexao.getConnection();

    public void consultarFuncionarios() throws SQLException {
        //Responsável por executar a query
        Statement statement = connection.createStatement();

        //Query
        String queryConsulta = "SELECT * FROM funcionario";

        //Armazena o retorno do banco
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){
            int idFuncionario = resultSet.getInt("idFuncionario");
            String nome = resultSet.getString("nome");
            String sobrenome = resultSet.getString("sobrenome");
            int matricula = resultSet.getInt("matricula");

            System.out.println(idFuncionario);
            System.out.println(nome + " " + sobrenome);
            System.out.println(matricula);
            System.out.println("===============================");
        }
    }

    public void consultarDepartamentos() throws SQLException {
        //Responsável por executar a query
        Statement statement = connection.createStatement();

        //Query
        String queryConsulta = "SELECT * FROM departamento";

        //Armazena o retorno do banco
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){
            int idDepartamento = resultSet.getInt("idDepartamento");
            String nome = resultSet.getString("nome");
            String sigla = resultSet.getString("sigla");

            System.out.println(idDepartamento);
            System.out.println(nome);
            System.out.println(sigla);
            System.out.println("===============================");
        }
    }


}
