package br.ufg.modelo;

import br.ufg.interfaces.AbstractObservado;

import java.util.ArrayList;
import java.util.List;

@br.ufg.annotations.Observado(caracteristica = "pobre")
public class Modelo extends AbstractObservado {

    List<String> linkDasFotos = new ArrayList<>();

    public void postarFoto(String s) {
        linkDasFotos.add(s);
        this.notificarObservadores();
    }
}
