package eu.heili.mathsolver;

/**
 * General class should represent a Math expression
 */
public abstract class Expression {
    /**
     * simplify current expression
     *
     * @return itself.
     */
    public abstract Expression simplify();

    /**
     * evaluate value of current expression
     *
     * @return Double value
     * @throws NullPointerException on not defined Var
     */
    public abstract Double evaluate();

    /**
     * generate a String represenation of the expression
     *
     * @return Stringified expression
     */
    public abstract String toInfixString();

    /**
     * check if expression is evaluated as 0.0
     *
     * @return boolean
     */
    public Boolean isZero() {
        try {
            return (evaluate() == 0.0);
        } catch (NullPointerException e) {
            return false;
        }
    }

    /**
     * check if expression is evalueated as 1.0
     *
     * @return boolean
     */
    public Boolean isOne() {
        try {
            return (evaluate() == 1.0);
        } catch (NullPointerException e) {
            return false;
        }
    }
}
