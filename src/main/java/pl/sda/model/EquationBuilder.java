package pl.sda.model;

public class EquationBuilder {

    private Equation equation;

    public EquationBuilder() {
        equation = new Equation();
    }

    public EquationBuilder withA(Double a) {
        equation.setA(a);
        return this;
    }

    public EquationBuilder withB(Double b) {
        equation.setB(b);
        return this;
    }

    public EquationBuilder withC(Double c) {
        equation.setC(c);
        return this;
    }

    public Equation build() {
        return equation;
    }
}
