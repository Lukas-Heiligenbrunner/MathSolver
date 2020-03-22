package eu.heili.mathsolver;

public class Mul extends Operator {
    private Expr a;
    private Expr b;

    public Mul(Expr a, Expr b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    @Override
    public Expr simplify() {
        a = a.simplify();
        b = b.simplify();

        // if a or b is 1 the term can be simplified
        if (a.isOne()) return b;
        if (b.isOne()) return a;

        // if a or b is 0 whole term is 0
        if (a.isZero() || b.isZero()) return new Const(0.0);

        return this;
    }

    @Override
    public Double evaluate() {
        return a.evaluate() * b.evaluate();
    }

    @Override
    public String toInfixString() {
        return "(" + a.toInfixString() + " * " + b.toInfixString() + ")";
    }
}
