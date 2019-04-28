package pl.sda;

public class App 
{
    public static void main( String[] args )
    {
        String equation = "x+5=8";

        EquationUtil eqUtil = new EquationUtil();
        Double result = eqUtil.solveEquation(equation);

        System.out.println("Rozwiązaniem zadania " + equation +" jest liczba " + result);
    }
}
