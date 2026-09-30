package br.com.fiap.dao;

import br.com.fiap.to.RemedioTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioDAO {
    //teste mockado para simular insercao via banco
    public ArrayList<RemedioTO> findAll(){ //Arraylist que vai retornar objeto de remedioTO
        ArrayList<RemedioTO> remedios = new ArrayList<>();
        RemedioTO remedio = new RemedioTO(1L, "Loratadina", 7.67, LocalDate.parse("2023-12-23"), LocalDate.parse("2026-10-10"));
        remedios.add(remedio);

        remedio = new RemedioTO(2L, "Amoxicilina", 26.50,LocalDate.now(), LocalDate.now().plusYears(2));
        remedios.add(remedio);

        remedio = new RemedioTO(3L, "Codeina", 23.90,LocalDate.now().minusYears(1), LocalDate.now().plusYears(1));
        remedios.add(remedio);

        return remedios;

    }
}
