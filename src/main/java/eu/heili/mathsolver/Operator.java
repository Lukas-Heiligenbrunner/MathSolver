package eu.heili.mathsolver;

public abstract class Operator implements Expression {
    private Expression a,b;

    public Operator(Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }

    Expression geta(){
        return a;
    }

    Expression getb(){
        return b;
    }
}
