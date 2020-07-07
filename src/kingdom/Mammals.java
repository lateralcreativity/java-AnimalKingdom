package kingdom;

public class Mammals extends AbstractAnimal
{
    // Initialize
    private String name;
    private int year;

    // Constructor
    public Mammals(String name, int year)
    {
        super(name, year);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}