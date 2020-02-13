package eu.heili.mathsolver;

public class Var implements Expression{
    String varname;
    Double val;

    public Var(String varname, Double val) {
        this.varname=varname;
        this.val=val;
    }

    @Override
    public Expression simplify() {
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
