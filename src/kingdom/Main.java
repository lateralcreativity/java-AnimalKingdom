package kingdom;

import java.util.List;
import java.util.ArrayList;

public class Main 
{
    private static List<AbstractAnimal> filteredList = new ArrayList<>();
    private static void filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester)
    {
        filteredList.clear();
        for (AbstractAnimal a : animals)
        {
            if(tester.test(a))
            {
                filteredList.add(a);
            }
        }
    }
    public static void main(String[] args)
    {
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<AbstractAnimal> myList = new ArrayList<>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println("*** List all of the animals in descending order by year named ***");
        System.out.println(myList.toString() + "\n");

        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println("*** List all of the animals alphabetically ***");
        System.out.println(myList.toString() + "\n");

        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println("*** List all of the animals ordered by how they move ***");
        System.out.println(myList.toString() + "\n");

        filterAnimal(myList, a -> (a.breath().compareToIgnoreCase("lungs") == 0));
        System.out.println("*** List only the animals that breathe with lungs ***");
        filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));
        System.out.println();

        filterAnimal(myList, a -> (a.breath().compareToIgnoreCase("lungs") == 0) && (a.getYear() == 1758));
        System.out.println("*** List only the animals that breathe with lungs and were named in 1758 ***");
        filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));
        System.out.println();

        filterAnimal(myList, a -> (a.breath().compareToIgnoreCase("lungs") == 0) && (a.reproduce().compareToIgnoreCase("eggs") == 0));
        System.out.println("*** List only the animals that lay eggs and breathe with lungs ***");
        filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));
        System.out.println();

        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filterAnimal(myList, a -> (a.getYear() == 1758));
        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));
        System.out.println();
    }
}