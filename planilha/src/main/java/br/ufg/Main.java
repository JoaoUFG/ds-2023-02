package br.ufg;

import br.ufg.model.Celula;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)  {
        var celularPrinciapl = new Celula("A","1");
        var celularDependente = new Celula("B","2");
        var outraCelulaDependenteDaPrincipal = new Celula("X","911");

        var celulaDependenteDaDependente = new Celula("C","6");

        celularPrinciapl.addObserver(celularDependente);
        celularPrinciapl.addObserver(outraCelulaDependenteDaPrincipal);

        celularDependente.addObserver(celulaDependenteDaDependente);

        System.out.println("----------------------");
        celularPrinciapl.alterarValor("AAA");
        System.out.println("----------------------");


    }




}