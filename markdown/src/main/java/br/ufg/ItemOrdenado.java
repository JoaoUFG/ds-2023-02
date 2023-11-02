package br.ufg;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemOrdenado implements Markdown{


    ArrayList<Markdown> markdownList = new ArrayList<>();

    public ItemOrdenado(Markdown... markdowns){
        markdownList.addAll(Arrays.stream(markdowns).toList());
    }

    @Override
    public String exibir() {
        StringBuilder listaItens  = new StringBuilder();
        listaItens.append("\n");

        for (int i = 0; i < markdownList.size(); i++) {

            listaItens
                    .append(" ").append(i + 1).append(". ").append(markdownList.get(i).exibir()).append("\n");

        }

        return listaItens.toString();
    }
}
