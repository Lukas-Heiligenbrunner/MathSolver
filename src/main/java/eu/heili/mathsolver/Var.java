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

    public void setVal(Double val) {
        this.val = val;
    }

    public Double getVal() {
        return val;
    }

    @Override
    public Expression simplify() {
        return this;
    }

    @Override
    public Double evaluate() throws EvaluateException {
        if (val == null) throw new EvaluateException("Var is not defined");
        return val;
    }

    @Override
    public String toInfixString() {
        return varname;
    }
}
