package br.ufg;

import java.util.zip.ZipInputStream;

public class Texto implements Markdown{
    private final String markdown;

    public Texto(String markdown){

        this.markdown = markdown;
    }


    @Override
    public String exibir() {
        return this.markdown;
    }
}
