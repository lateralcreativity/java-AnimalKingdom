package kingdom;

public class Mammals extends AbstractAnimal
{
    // Constructor
    public Mammals(String name, int year)
    {
        super(name, year);
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