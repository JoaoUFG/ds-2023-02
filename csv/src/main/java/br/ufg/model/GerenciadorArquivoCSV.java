package br.ufg.model;

import java.io.*;

public class GerenciadorArquivoCSV {

    private String path;
    public GerenciadorArquivoCSV(String path){
        this.path = path;
    }
    public void mapCSV( String outputFileName,EscritorLinha l){


        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
                String linha;
                while ((linha = reader.readLine()) != null) {

                    l.acaoLinha(linha,writer);

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
