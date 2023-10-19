package br.ufg.model;

import java.io.IOException;
import java.io.PrintWriter;

public interface EscritorLinha {
    void acaoLinha(String linha, PrintWriter writer) throws IOException;
}
