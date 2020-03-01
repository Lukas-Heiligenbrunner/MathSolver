package eu.heili.mathsolver;

public class Main {
    public static void main(String[] args) {
        Expression e = new Addition(new Val(3.0), new Val(3.0));
        System.out.println(e.toInfixString());
        System.out.println(e.simplify().toInfixString());
    }
}
