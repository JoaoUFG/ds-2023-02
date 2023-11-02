package br.ufg;

public class Negrito implements Markdown{

    Markdown markdown;

    public Negrito(Markdown markdown){
        this.markdown = markdown;
    }

    @Override
    public String exibir() {
        return " **"+markdown.exibir()+"** ";
    }
}
