package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ProcuradorClasse {

//     rootDirectories = FileSystems.getDefault().getRootDirectories();

    ArrayList<String> caminhosEncontrados = new ArrayList<>();

    public ArrayList<String> procurarClasse(String classeAchar, String dir){

        File pasta = new File(dir);

        File[] arquivos = pasta.listFiles();

        for (File arquivo : arquivos) {
            System.out.println(arquivo.getName());
        }

        if (arquivos != null) {
            this.procurarRecursivo(pasta,classeAchar,this.caminhosEncontrados);
        }

        if (this.caminhosEncontrados.isEmpty()) {
            System.out.println("Classe "+ classeAchar + " nao encontrada");
        }

        return this.caminhosEncontrados;
    }

    public void procurarRecursivo(File arquivo, String classeAchar, List<String> caminhosAchados){
        if(arquivo==null) return;

        if(!arquivo.isFile()){
            System.out.println("Olhando a pasta:" + " "+ arquivo.getName());

            File[] arquivos = arquivo.listFiles();

            if (arquivos==null) return;

            Arrays.stream(arquivos).toList().forEach(arquivoListado->{
                this.procurarRecursivo(arquivoListado,classeAchar,caminhosAchados);
            });

        }
        if (arquivo.getName().equals(classeAchar)) {
            System.out.println("Arquivo encontrado: " + arquivo.getAbsolutePath());
            caminhosAchados.add(arquivo.getAbsolutePath());
        }

    }

    public void procurarRecursivoConcorrente(File arquivo, String classeAchar, List<String> caminhosAchados){
        if(arquivo==null) return;

        if(!arquivo.isFile()){
            System.out.println("Olhando a pasta:" + " "+ arquivo.getName());

            File[] arquivos = arquivo.listFiles();

            if (arquivos==null) return;

            Arrays.stream(arquivos).parallel().forEach(arquivoListado->{
                this.procurarRecursivo(arquivoListado,classeAchar,caminhosAchados);
            });
        }

        if (arquivo.getName().equals(classeAchar)) {
            System.out.println("Arquivo encontrado: " + arquivo.getAbsolutePath());
            caminhosAchados.add(arquivo.getAbsolutePath());
        }

    }




    public ArrayList<String> procurarConcorrente(String classeAchar, String dir){

        File pasta = new File(dir);

        File[] arquivos = pasta.listFiles();

        for (File arquivo : arquivos) {
            System.out.println(arquivo.getName());
        }

        if (arquivos != null) {
            this.procurarRecursivoConcorrente(pasta,classeAchar,this.caminhosEncontrados);
        }

        if (this.caminhosEncontrados.isEmpty()) {
            System.out.println("Classe "+ classeAchar + " nao encontrada");
        }

        return this.caminhosEncontrados;
    }

}
