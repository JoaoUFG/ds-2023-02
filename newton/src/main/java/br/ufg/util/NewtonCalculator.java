package br.ufg.util;

public class NewtonCalculator {

    public Double obterRaizQuadrada(Double num, Double marginError){
        var x = num;
        var e =  module( x*x - num ) > marginError;
        while(e){
            x = x - ( (x*x - num)/(2 * x) );
            e =  module( x*x - num ) > marginError;
        }
        return x;
    }
    private Double module(Double n){
        return n<0? n*-1 : n;
    }

}
