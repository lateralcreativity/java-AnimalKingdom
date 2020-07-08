package kingdom;

abstract class AbstractAnimal
{
    // Initialize
    protected static int maxId = 0;
    protected int id;
    protected int year;
    protected int energy;
    protected String name;

    // Constructor
    public AbstractAnimal(String name, int year)
    {
        id = maxId;
        maxId++;
        this.name = name;
        this.year = year;
        energy = 0;
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();

    // All animals consume food the same way
    void eat(int food)
    {
        energy += food;
    }

    int getYear()
    {
        return year;
    }

    String getName()
    {
        return name;
    }
    
    @Override
    public String toString()
    {
        return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + year + "}\n";
    }
}