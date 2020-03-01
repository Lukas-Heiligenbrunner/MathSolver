package eu.heili.mathsolver;


public abstract class Expression {
    public abstract Expression simplify();

    public abstract Double evaluate();

    public abstract String toInfixString();

    public Boolean isZero() {
        try {
            return (evaluate() == 0.0);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public Boolean isOne() {
        try {
            return (evaluate() == 1.0);
        } catch (NullPointerException e) {
            return false;
        }
    }
}
