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
        if (a.isOne()) return b;
        if (b.isOne()) return a;

        // if a or b is 0 whole term is 0
        if (a.isZero()) return new Val(0.0);
        if (b.isZero()) return new Val(0.0);

        if(a instanceof Multiplication){
            if(((Multiplication) a).getParent().geta().toInfixString().equals(a.toInfixString())){
                return(new Multiplication(new Val(a.evaluate() * ((Multiplication) a).getParent().evaluate()), this));
                // todo s
            }
        }

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

    public Operator getParent(){
        return this;
    }
}
