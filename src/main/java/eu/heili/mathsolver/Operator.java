package eu.heili.mathsolver;

public abstract class Operator extends Expr {
    private Expr a, b;

    public Operator(Expr a, Expr b) {
        this.a = a;
        this.b = b;
    }

    Expr geta() {
        return a;
    }

    Expr getb() {
        return b;
    }
}
