package br.ufg.modelo;

import br.ufg.interfaces.AbstractObservado;

import java.util.ArrayList;
import java.util.List;

@br.ufg.annotations.Observado(caracteristica = "rico")
public class Politico extends AbstractObservado {

    List<Object> amizades = new ArrayList<>();

    public void fazerAmizade(Object itemDeAmizade) {
        amizades.add(itemDeAmizade);
        this.notificarObservadores();
    }
}
