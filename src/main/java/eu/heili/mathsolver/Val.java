package eu.heili.mathsolver;

public class Val implements Expression {
    private Double val;
    public Val(Double val) {
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
        // TODO: 13.02.20  
    }
}
