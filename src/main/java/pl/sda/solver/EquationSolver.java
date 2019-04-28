package pl.sda.solver;

import pl.sda.model.Equation;

public class EquationSolver {
    public Double solve(Equation equation) {
        return (equation.getC() - equation.getB()) / equation.getA();
    }
}
