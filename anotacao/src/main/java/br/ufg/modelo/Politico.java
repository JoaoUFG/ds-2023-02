package br.ufg.modelo;

import br.ufg.annotations.Observado;
import br.ufg.util.Notificador;

import java.util.ArrayList;
import java.util.List;

@Observado(caracteristica = "rico")
public class Politico {

    List<Object> observadores = new ArrayList<>();

    private String cargo;

    public void setCargo(String cargo) {
        Notificador.notificarMeusObservadores(this.observadores);
        this.cargo = cargo;
    }

    public void addObservadores(Object obj){
        observadores.add(obj);
   }

}
