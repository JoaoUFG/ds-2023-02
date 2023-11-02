package br.ufg;

public class Item implements Markdown{

    Markdown  markdown;
    public Item(Markdown markdown){
        this.markdown = markdown;
    }

    @Override
    public String exibir() {
        return "º"+" "+markdown.exibir();
    }
}
