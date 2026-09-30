package br.com.fiap.bo;


import br.com.fiap.dao.RemedioDAO;
import br.com.fiap.to.RemedioTO;

import java.util.ArrayList;

//classe que conversa com as classes DAO e que serve para definir regras de negocio do projeto
public class RemedioBO {

    private RemedioDAO remedioDAO;


    public ArrayList<RemedioTO>findAll(){
        remedioDAO = new RemedioDAO();
        //aqui se implementas as regras de negocio

        return remedioDAO.findAll();
    }
}
