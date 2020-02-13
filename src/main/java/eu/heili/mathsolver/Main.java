package eu.heili.mathsolver;

public class Main {
    public static void main(String[] args) {
        Expression e =new Multiplication(new Val(0.0),new Var("x",5.0)).simplify();
        Expression en = new Addition(new Addition(new Val(0.0),new Val(3.0)),new Addition(new Val(0.0),new Val(0.0))).simplify();
        System.out.println(en.toInfixString());
    }
}
