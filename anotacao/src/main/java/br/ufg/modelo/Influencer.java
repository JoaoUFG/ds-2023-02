package br.ufg.modelo;


import br.ufg.annotations.Observado;
import br.ufg.interfaces.AbstractObservado;

@Observado(caracteristica="rico")
public class Influencer extends AbstractObservado {

    private String igInstagram;

    public String getIgInstagram() {
        return igInstagram;
    }

    public void setIgInstagram(String igInstagram) {
        this.igInstagram = igInstagram;
        this.notificarObservadores();

    }

}
