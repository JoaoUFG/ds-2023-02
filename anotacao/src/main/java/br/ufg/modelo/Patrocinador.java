package br.ufg.modelo;


import br.ufg.annotations.Observador;
import br.ufg.annotations.RecepcionarNotificacao;
import br.ufg.interfaces.IObservador;

@Observador(interesse = "rico")
public class Patrocinador  implements  IObservador{


    public void tratarNotificacao(Object arg) {
        System.out.println("Ocorreu movimento no " + " " + arg.getClass().getSimpleName());
    }
}
