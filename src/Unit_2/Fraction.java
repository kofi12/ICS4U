package Unit_2;

import java.util.Objects;
import java.util.Scanner;

public class Fraction
{
    int numerator;
    int denominator;

    public Fraction()
    {
        this.numerator = 1;
        this.denominator = 2;
    }

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public int getNumerator()
    {
        return numerator;
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    public Fraction multi(Fraction a)
    {
        return a;
    }


    public Fraction div(Fraction a)
    {
        return a;
    }

    public Fraction add(Fraction a)
    {
        return a;
    }

    public Fraction subtract(Fraction a)
    {
        return a;
    }

    @Override
    public String toString()
    {
        return "Unit_2.Fraction = " + this.numerator + " / " + this.denominator;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof Fraction))
        {
            return false;
        }
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator &&
                denominator == fraction.denominator;
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(numerator, denominator);
    }










    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Fraction f = new Fraction();

        Fraction g = new Fraction(5,6);
        g.setNumerator(3);
        g.setDenominator(5);

        f.setNumerator(g.getNumerator());
        f.setDenominator(g.getDenominator());
        System.out.println(f);
    }
}
