package com.project;

import com.project.model.Endereco;

public class Main {

    static Integer  testePointer = 0;

    public static void main(String[] args) {

        try {

        System.out.println("Iniciando testes unitários:");
        System.out.println("---------------------------->");
        Endereco endereco = Endereco.builder().
                setor("Residencial São Geraldo")
                .cidade("Goiânia")
                .bloco("Bloco B, 102")
                .quadra("QI 07")
                .numero(18)
                .estado("Goiás")
                .cep("746902885")
                .build();

        assertEquals(endereco.bloco, "Bloco B, 102");
        assertEquals(endereco.quadra, "QI 07");
        assertEquals(endereco.numero, 18);
/*
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
 */
        System.out.println("<----------------------------");

        }catch (Exception e){
            System.out.println("Teste errado: "+ e.getMessage());
        }
        }

        public static void assertEquals(Object atual, Object esperado) throws Exception{

        if(!atual.equals(esperado))throw new Exception("Teste errado");

            System.out.println("Tesde de número: "+ ++testePointer +" passado!");

        }

}