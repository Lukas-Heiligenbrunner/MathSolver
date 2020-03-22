package eu.heili.mathsolver;

/**
 * General class should represent a Math expression
 */
public abstract class Expr {
    /**
     * simplify current expression
     *
     * @return itself.
     */
    public abstract Expr simplify();

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
        } catch (EvaluateException e) {
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
        } catch (EvaluateException e) {
            return false;
        }
    }

    /**
     * check if two expressions are the same
     * (same expression not same object)
     *
     * @param e expression to compare with
     * @return equality
     */
    public boolean isEquivto(Expr e) {
        return (this.toInfixString().equals(e.toInfixString()));
    }

    /**
     * check if two expressions are the same
     * (same expression and same object)
     *
     * @param e expression to compare with
     * @return equality
     */
    public boolean equals(Expr e) {
        return (this == e);
    }
}
