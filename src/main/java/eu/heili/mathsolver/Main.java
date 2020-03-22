package eu.heili.mathsolver;

public class Main {
    public static void main(String[] args) {
        Expr e = new Add(new Add(new Const(3.0), new Const(3.0)),new Add(new Const(3.0), new Const(3.0)));
        System.out.println(e.toInfixString());
        System.out.println(e.simplify().toInfixString());

        Expr en = new Add(new Const(4.0),new Add(new Const(3.0), new Var("x",3.0)));
        System.out.println(en.toInfixString());
        System.out.println(en.simplify().toInfixString());
    }
}
