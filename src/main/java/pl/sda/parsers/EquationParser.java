package pl.sda.parsers;

import pl.sda.model.Equation;
import pl.sda.model.EquationBuilder;

public class EquationParser {
    public Equation parse(String equationString) {

        String[] split = equationString.split("=");

        Double c = Double.parseDouble(split[1]);

        String[] leftSide = split[0].split("x");
        /*
        Double a1;
        if ("".equals(leftSide[0]) {
            a1 = 1d;
        } else{
            a1 = Double.parseDouble(leftSide[0]);

            poniżej to samo, ale z użyciem tzw. operatora trójargumentowego:*/
        Double a = "".equals(leftSide[0]) ? 1d : parseNonEmptyA(leftSide[0]);

        Double b = leftSide.length == 1 ? 0 : Double.parseDouble(leftSide[1]);

        EquationBuilder builder = new EquationBuilder();
        Equation equation = builder.withA(a).withB(b).withC(c).build();
       /* Equation equation = new Equation();
        equation.setA(a);
        equation.setB(b);
        equation.setC(c);*/
        return equation;
    }

    private Double parseNonEmptyA(String nonEmptyA) {
        return "-".equals(nonEmptyA) ? -1d : Double.parseDouble(nonEmptyA);
    }
}
