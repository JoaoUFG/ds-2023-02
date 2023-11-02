package br.ufg;

public class Main {
    public static void main(String[] args) {
//        Markdown inputItalico = new Italico(new Texto("Este texto é em italico"));
//        Markdown inputNegrito = new Negrito(inputItalico);
//        Markdown item = new ItemNaoOrdenado(
//                new Italico(
//                        new Texto("Um item em Itálico")),
//                new Negrito(
//                        new Italico(
//                                new Texto("Isso agora é negrito com italico"))),
//                new Texto("Isso é um texto comum"),
//                new ItemOrdenado(
//                        new Texto("Isso é um subitem ordenado"), new Texto("Isso é o segundo subitem ordenado")),
//                new Concatena(new Negrito(new Texto("MarkOfDownsNegrito")), new Italico(new Texto("Super Italic Second Hello")))
//        );

        Markdown markdown = new Concatena(new Texto("# Título\n"),
                new Concatena(
                        new Concatena(
                                new Texto("Uma simples linha, com"),
                                new Concatena(
                                        new Concatena(
                                                new Negrito(new Texto("negrito")),
                                                new Texto("e")
                                        ),
                                        new Italico(new Texto("italico"))
                                )
                        ),
                        new Concatena(
                                new Texto("\n"),
                                new Concatena(
                                        new Item(new Texto("Primeiro item da linha com")),
                                        new Italico(new Texto("itálico"))
                                )
                        )
                )
                );


        System.out.printf(markdown.exibir());



    }
}