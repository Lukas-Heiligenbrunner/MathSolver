package eu.heili.mathsolver;

/**
 * should represent a general expression
 */
public interface Expression {
    Expression simplify();

    Double evaluate();


    String toInfixString();
}
