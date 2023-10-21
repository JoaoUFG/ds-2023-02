package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var entrada = scanner.nextLine();

        var parametros = new ArrayList<String>(Arrays.stream(entrada.split(" ")).toList());

        ProcuradorClasse procuradorClasse = new ProcuradorClasse();


        if(!parametros.get(0).equals("fc")) throw new IllegalArgumentException("use o comando ->fc<-");
        if(parametros.size()<4)parametros.add("-");


        var classe = parametros.get(1);
        var dir = parametros.get(2);


        if(!parametros.get(3).equals("-p")){
            var caminhosEncontrados = procuradorClasse.procurarClasse(classe,dir);

            if(caminhosEncontrados.isEmpty()) {
                System.out.println("Classe nao encontrada");
            }else{
                System.out.println("-------- LISTANDO CLASSES ENCONTRADAS -------");
                caminhosEncontrados.stream().toList().forEach(caminho->{
                    System.out.println(caminho);
                });
            }

        }else {
            var caminhosEncontrados = procuradorClasse.procurarConcorrente(classe,dir);

            if(caminhosEncontrados.isEmpty()) {
                System.out.println("Classe nao encontrada");
            }else{
                System.out.println("-------- LISTANDO CLASSES ENCONTRADAS PARALELAMENTE -------");
                caminhosEncontrados.stream().toList().forEach(caminho->{
                    System.out.println(caminho);
                });
            }
        }
// /home/aluno/joao/ds-2023-02/classe/src/main/java/org/example/Main.java

    }
}