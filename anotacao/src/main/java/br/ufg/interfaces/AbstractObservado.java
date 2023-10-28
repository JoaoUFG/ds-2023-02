package br.ufg.interfaces;

import br.ufg.annotations.Observado;
import br.ufg.annotations.Observador;

import java.util.ArrayList;
import java.util.List;


@Observado(caracteristica = "")
public abstract class AbstractObservado {

    List<IObservador> observadores;

    public void addObservador(IObservador obs) {
        if(observadores==null){
            this.observadores = new ArrayList<>();
        }
        this.observadores.add(obs);
    }

    public void excluirObservador(IObservador obj){
        if(observadores==null){
            return;
        }
        observadores.remove(obj);
    }



    public final void notificarObservadores() {

        observadores.forEach(iObservador -> {

            var annotationObservador = iObservador.getClass().getAnnotation(Observador.class);

            if(annotationObservador==null) return;
            if(annotationObservador.interesse().equals(this.getClass().getAnnotation(br.ufg.annotations.Observado.class).caracteristica()))
                iObservador.tratarNotificacao(this);
        });
    }


}
