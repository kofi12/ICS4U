package Unit_2;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Cube extends Shapes3D implements Inter
{
    private int length;
    private int numOfSides;

    public Cube(String name, int dimensions, int length, int numOfSides)
    {
        super(name, dimensions);
        this.length = length;
        this.numOfSides = numOfSides;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getNumOfSides()
    {
        return numOfSides;
    }

    public void setNumOfSides(int numOfSides)
    {
        this.numOfSides = numOfSides;
    }




    @Override
    public int surfaceArea()
    {
        return 0;
    }

    @Override
    public int volume()
    {
        return 0;
    }

}
