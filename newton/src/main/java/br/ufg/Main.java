package br.ufg;


import br.ufg.util.NewtonCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var calculadora = new NewtonCalculator();
        var guessNumber = Double.parseDouble(
                new Scanner(System.in).next().replace(',','.')
        );

        System.out.println(calculadora.obterRaizQuadrada(guessNumber,0.0001));

    }
}