package kingdom;

public class Fish extends AbstractAnimal
{
    // Initialize
    private String name;
    private int year;

    // Constructor
    public Fish(String name, int year)
    {
        super(name, year);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breath()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}