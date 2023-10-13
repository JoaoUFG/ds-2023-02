package br.ufg.model;

import java.util.Observable;
import java.util.Observer;


public class Celula extends Observable implements Observer {

    private String coluna;
    private String linha;

    private String valor;

    public void alterarValor(String valor) {
        this.valor = valor;
        setChanged();
        notifyObservers(valor);
    }



    public Celula(String coluna, String linha){
        this.coluna = coluna;
        this.linha = linha;
    }
    public Celula(){}

    public String getName(){
        return coluna+linha;
    }

    public void update(Observable o, Object arg) {
        Celula observada = (Celula)o;
        System.out.println("Reavaliar "+ this.getName() + " por mudança ocorrida em "+ observada.getName());
        this.processarAlteracao(arg);
        this.setChanged();
        this.notifyObservers();
    }
    private void processarAlteracao(Object arg){
        return;
    }


}
