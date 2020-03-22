package eu.heili.mathsolver;

public class Const extends Expr {
    private Double val;

    public Const(Double val) {
        this.val = val;
    }

    /**
     * second constructor to allow passing integers.
     * @param val
     */
    public Const(int val) {
        this.val = (double) val;
    }

    @Override
    public Expr simplify() {
        return this;
    }

    @Override
    public Double evaluate() {
        return val;
    }

    @Override
    public String toInfixString() {
        return val.toString();
    }
}
