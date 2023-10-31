package model;

public class Subtrai implements Expressao{
    Expressao e1;
    Expressao e2;

    @Override
    public  float valor(){
        return e1.valor()-e2.valor();
    }
    public  Subtrai(Expressao e1, Expressao e2){
        this.e1 = e1;
        this.e2 = e2;
    }
}
