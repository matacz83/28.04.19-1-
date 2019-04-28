package pl.sda.model;

import java.util.Objects;

public class Equation {
    private Double a;
    private Double b;
    private Double c;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equation equation = (Equation) o;
        return Objects.equals(a, equation.a) &&
                Objects.equals(b, equation.b) &&
                Objects.equals(c, equation.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
