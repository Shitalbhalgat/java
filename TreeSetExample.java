import java.util.Comparator;
import java.util.TreeSet;

class Person
{
    int id;
    int age;
    String name;
    public Person(int id, int age, String name) 
    {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
class AgeComparator implements Comparator<Person>
{  
    
    public int compare(Person person1, Person person2) 
    {
        if(person1.age == person2.age)  
        return 0;  
        else if(person1.age > person2.age)  
        return 1;  
        else  
        return -1;  
    }  
}  
class IdComparator implements Comparator<Person>
{  
    @Override
    public int compare(Person person1, Person person2) 
    {
        if(person1.id == person2.id)  
        return 0;  
        else if(person1.id > person2.id)  
        return 1;  
        else  
        return -1;  
    }  
}  

public class TreeSetExample
{
    
    public static void main(String arg[])
    {
        TreeSet<Person> personid = new TreeSet<Person>(new IdComparator());
        personid.add(new Person(10, 25, "Ram"));
        personid.add(new Person(5, 22, "John"));
        personid.add(new Person(1, 23, "Krishna"));
        personid.add(new Person(15, 24, "Alley"));
        personid.add(new Person(8, 25, "Jack"));
        
        System.out.println("Sorted by Id from TreeSet: "+ personid);
        
    
        // for(Person person : personid)
        // {
        //     System.out.println("Person Id: "+ person.id);
        //     System.out.println("Person Age: "+ person.age);
        //     System.out.println("Person Name: "+ person.name);
        // }
        
        TreeSet<Person> personSortByAge = new TreeSet<Person>(new AgeComparator());
        personSortByAge.add(new Person(10, 25, "Ram"));
        personSortByAge.add(new Person(5, 22, "John"));
        personSortByAge.add(new Person(1, 23, "Krishna"));
        personSortByAge.add(new Person(15, 24, "Alley"));
        personSortByAge.add(new Person(8, 25, "Jack"));
        
        System.out.println("Sorted by Age from TreeSet: ");
        for(Person person : personSortByAge)
        {
            System.out.println("Person Id: "+ person.id);
            System.out.println("Person Age: "+ person.age);
            System.out.println("Person Name: "+ person.name);
        }
        
    }    
}