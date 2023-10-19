package br.ufg.model;

import java.io.*;

public class ValidadorCSV {

    public boolean validarQuantidadeColunas(String path){
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String linha;
                while ((linha = reader.readLine()) != null) {

                    String[] columns = linha.split(",");
                    if(columns.length<2) throw new IOException();

                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

}
