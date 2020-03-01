package eu.heili.mathsolver;

public class Var extends Expression {
    String varname;
    Double val = null;

    public Var(String varname, Double val) {
        this.varname = varname;
        this.val = val;
    }

    public Var(String varname) {
        this.varname = varname;
    }

    @Override
    public Expression simplify() {
        return this;
    }

    @Override
    public Double evaluate() throws NullPointerException {
        if (val == null) throw new NullPointerException("Var is not defined");
        return val;
    }

    @Override
    public String toInfixString() {
        return varname;
    }
}
