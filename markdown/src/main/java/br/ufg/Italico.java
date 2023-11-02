package br.ufg;

public class Italico implements Markdown{
    Markdown markdown;
    public Italico(Markdown markdown){
        this.markdown = markdown;
    }

    @Override
    public String exibir() {
        return " _"+this.markdown.exibir()+"_ ";
    }
}
