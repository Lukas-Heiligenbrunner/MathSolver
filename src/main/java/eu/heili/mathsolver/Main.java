package eu.heili.mathsolver;

public class Main {
    public static void main(String[] args) {
        Expression e = new Subtraction(new Subtraction(new Val(5.0),new Val(6.0)),new Val(0.0));
        System.out.println(e.toInfixString());
        System.out.println(e.simplify().toInfixString());
    }
}
