package br.ufg.modelo;

import br.ufg.interfaces.AbstractObservado;

import java.util.ArrayList;
import java.util.List;

@br.ufg.annotations.Observado(caracteristica = "pobre")
public class Comediante extends AbstractObservado {

    private List<String> piadasProntas = new ArrayList<>();

    public void incluirPiada(String piada){
        this.piadasProntas.add(piada);
        this.notificarObservadores();
    }


}
