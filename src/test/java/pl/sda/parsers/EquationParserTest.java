package pl.sda.parsers;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.model.Equation;
import pl.sda.model.EquationBuilder;

import static org.junit.Assert.*;

public class EquationParserTest {

    private EquationParser equationParser = new EquationParser();

    @Test
    public void shouldReturn1And1And1() {
        //given
        final String equationToParse = "x+1=1";

        //TODO: wprowadzić builder
        EquationBuilder builder = new EquationBuilder();
        final Equation expectedEquation = builder.withA(1d).withB(1d).withC(1d).build();

        //when
        Equation result = equationParser.parse(equationToParse);

        //then
        Assert.assertEquals(expectedEquation, result);
    }

    @Test
    public void shouldReturnMinus1And1And1() {
        //given
        final String equationToParse = "-x+1=1";

        //TODO: wprowadzić builder
        EquationBuilder builder = new EquationBuilder();
        final Equation expectedEquation = builder.withA(-1d).withB(1d).withC(1d).build();

        //when
        Equation result = equationParser.parse(equationToParse);

        //then
        Assert.assertEquals(expectedEquation, result);

    }

    @Test
    public void shouldReturnMinus2And1And1() {
        //given
        final String equationToParse = "-2x+1=1";

        //TODO: wprowadzić builder
        EquationBuilder builder = new EquationBuilder();
        final Equation expectedEquation = builder.withA(-2d).withB(1d).withC(1d).build();

        //when
        Equation result = equationParser.parse(equationToParse);

        //then
        Assert.assertEquals(expectedEquation, result);
    }

    @Test
    public void shouldReturnMinus2And0And1() {
        //given
        final String equationToParse = "-2x=1";

        //TODO: wprowadzić builder
        EquationBuilder builder = new EquationBuilder();
        final Equation expectedEquation = builder.withA(-2d).withB(0d).withC(1d).build();

        //when
        Equation result = equationParser.parse(equationToParse);

        //then
        Assert.assertEquals(expectedEquation, result);
    }
}