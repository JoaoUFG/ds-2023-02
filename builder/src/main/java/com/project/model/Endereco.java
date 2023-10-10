package com.project.model;


import lombok.Builder;
import lombok.Getter;

public class Endereco {

    public String setor;
    public String cep;
    public Integer numero;
    public String cidade;
    public String estado;
    public String bloco;
    public String quadra;

public static final class Builder{

    String setor;
    String cep;
    Integer numero;
    String cidade;
    String estado;
    String bloco;
    String quadra;
    public Builder setor(String setor){
        this.setor = setor;
        return this;
    }

    public Builder cep(String setor){
        this.cep = setor;
        return this;
    }
    public Builder numero(Integer setor){
        this.numero = setor;
        return this;
    }
    public Builder cidade(String setor){
        this.cidade = setor;
        return this;
    }
    public Builder estado(String setor){
        this.estado = setor;
        return this;
    }
    public Builder bloco(String setor){
        this.bloco = setor;
        return this;
    }
    public Builder quadra(String setor){
        this.quadra = setor;
        return this;
    }


    public Endereco build(){
        return new Endereco(this);
    }

}

public Endereco(Builder builder){
    this.setor = builder.setor;
    this.cep = builder.cep;
    this.bloco = builder.bloco;
    this.cidade = builder.cidade;
    this.estado = builder.estado;
    this.numero = builder.numero;
    this.quadra = builder.quadra;
}

public static Builder builder(){
    return new Builder();
}







}
