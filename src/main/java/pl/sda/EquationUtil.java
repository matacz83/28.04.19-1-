package pl.sda;

import pl.sda.model.Equation;
import pl.sda.parsers.EquationParser;
import pl.sda.solver.EquationSolver;

public class EquationUtil {
    public Double solveEquation(String equation) {
        EquationParser parser = new EquationParser();
        Equation parsedEquation = parser.parse(equation);

        EquationSolver solver = new EquationSolver();
        Double solve = solver.solve(parsedEquation);

        return solve;
    }
}
