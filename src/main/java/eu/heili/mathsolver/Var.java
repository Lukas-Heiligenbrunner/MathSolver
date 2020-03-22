package eu.heili.mathsolver;

public class Var extends Expr {
    private String varname;
    private Double val = null;

    public Var(String varname, Double val) {
        this(varname);
        this.val = val;
    }

    public Var(String varname, int val) {
        this(varname);
        this.val = (double) val;
    }

    public Var(String varname) {
        this.varname = varname;
    }

    public void setValue(Double val) {
        this.val = val;
    }

    public void setValue(int val) {
        this.val = (double) val;
    }

    public Double getValue() {
        return val;
    }

    public String getName() {
        return varname;
    }

    @Override
    public Expr simplify() {
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
