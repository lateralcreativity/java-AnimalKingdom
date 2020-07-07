package kingdom;

abstract class AbstractAnimal
{
    // Initialize
    protected static int maxId = 0;
    protected int id;
    protected int year;
    protected String name;
    protected String moveMethod;

    // Constructor
    public AbstractAnimal(String name, int year)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();

    public int getYear()
    {
        return year;
    }

    public String getName()
    {
        return name;
    }
    
    @Override
    public String toString()
    {
        return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + year + "}\n";
    }
}