package model;

public class Constante implements Expressao{

    public final float valor;
    public Constante(Float valor){
        this.valor = (Float) valor;
    }
    @Override
    public float valor() {
        return this.valor;
    }
}
