package eu.heili.mathsolver;

public class Multiplication extends Operator {
    private Expression a;
    private Expression b;

    public Multiplication(Expression a, Expression b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    @Override
    public Expression simplify() {
        a = a.simplify();
        b = b.simplify();

        // if a or b is 1 the term can be simplified
        if (a.evaluate().equals(1.0)) return b;
        if (b.evaluate().equals(1.0)) return a;

        if (a.evaluate().equals(-1.0)) return new Val(-1.0 * b.evaluate());
        if (b.evaluate().equals(-1.0)) return new Val(-1.0 * a.evaluate());

        // if a or b is 0 whole term is 0
        if (a.evaluate().equals(0.0)) return new Val(0.0);
        if (b.evaluate().equals(0.0)) return new Val(0.0);

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
