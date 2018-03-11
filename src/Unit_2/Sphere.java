package Unit_2;

public class Sphere extends Shapes3D
{
    int radius;
    int height;

    public Sphere(String name, int dimensions, int radius, int height)
    {
        super(name, dimensions);
        this.radius = radius;
        this.height = height;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
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
    public String toString()
    {
        return "Unit_2.Sphere{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
