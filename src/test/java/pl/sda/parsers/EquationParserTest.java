package pl.sda.parsers;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.model.Equation;

import static org.junit.Assert.*;

public class EquationParserTest {

    private EquationParser equationParser = new EquationParser();

    @Test
    public void shouldReturn1And1And1() {
        //given
        final String equationToParse = "x+1=1";
        final Equation expectedEquation = new Equation();

        //TODO: wprowadzić builder
        expectedEquation.setA(1d);
        expectedEquation.setB(1d);
        expectedEquation.setC(1d);

        //when
        Equation result = equationParser.parse(equationToParse);

        //then
        Assert.assertEquals(expectedEquation, result);
    }

    @Test
    public void shouldReturnMinus1And1And1() {
        //given
        final String equationToParse = "-x+1=1";
        final Equation expectedEquation = new Equation();

        //TODO: wprowadzić builder
        expectedEquation.setA(-1d);
        expectedEquation.setB(1d);
        expectedEquation.setC(1d);

        //when
        Equation result = equationParser.parse(equationToParse);

        //then
        Assert.assertEquals(expectedEquation, result);

    }

    @Test
    public void shouldReturnMinus2And1And1() {
        //given
        final String equationToParse = "-2x+1=1";
        final Equation expectedEquation = new Equation();

        //TODO: wprowadzić builder
        expectedEquation.setA(-2d);
        expectedEquation.setB(1d);
        expectedEquation.setC(1d);

        //when
        Equation result = equationParser.parse(equationToParse);

        //then
        Assert.assertEquals(expectedEquation, result);
    }

    @Test
    public void shouldReturnMinus2And0And1() {
        //given
        final String equationToParse = "-2x=1";
        final Equation expectedEquation = new Equation();

        //TODO: wprowadzić builder
        expectedEquation.setA(-2d);
        expectedEquation.setB(0d);
        expectedEquation.setC(1d);

        //when
        Equation result = equationParser.parse(equationToParse);

        //then
        Assert.assertEquals(expectedEquation, result);
    }
}