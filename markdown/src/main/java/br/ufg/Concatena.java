package br.ufg;

public class Concatena implements Markdown{
    Markdown markdown;
    public Concatena(Markdown m1, Markdown m2){

        markdown = new Texto(m1.exibir() + m2.exibir());

    }

    @Override
    public String exibir() {
        return markdown.exibir();
    }
}
