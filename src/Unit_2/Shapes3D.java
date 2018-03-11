package Unit_2;

public class Shapes3D
{
    String name;
    int dimensions;

    public Shapes3D()
    {

    }

    public Shapes3D(String name, int dimensions)
    {
        this.name = name;
        this.dimensions = dimensions;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getDimensions()
    {
        return dimensions;
    }

    public void setDimensions(int dimensions)
    {
        this.dimensions = dimensions;
    }

}
