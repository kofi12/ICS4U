package Unit_2;

public class Pyramid extends Shapes3D implements Inter
{
    int sides;
    int base;
    int height;

    public Pyramid(String name, int dimensions, int sides, int base, int height)
    {
        super(name, dimensions);
        this.sides = sides;
        this.base = base;
        this.height = height;
    }

    public int getSides()
    {
        return sides;
    }

    public void setSides(int sides)
    {
        this.sides = sides;
    }

    public int getBase()
    {
        return base;
    }

    public void setBase(int base)
    {
        this.base = base;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
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
