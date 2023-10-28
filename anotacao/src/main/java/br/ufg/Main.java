package br.ufg;

import br.ufg.interfaces.AbstractObservado;
import br.ufg.interfaces.IObservador;
import br.ufg.modelo.*;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var influenciador = new Influencer();
        var comediante = new Comediante();
        var modelo = new Modelo();
        var politico = new Politico();
        var patrocinador = new Patrocinador();

        List<AbstractObservado> observados = List.of(influenciador,comediante,modelo,politico);

        observados.forEach(abstractObservado -> {
            abstractObservado.addObservador(patrocinador);
        });

        influenciador.setIgInstagram("@joaogabriel_t");
        comediante.incluirPiada("Um dia um cara estava...");
        modelo.postarFoto("https://onlyfans...");
        politico.fazerAmizade(modelo);

    }
}