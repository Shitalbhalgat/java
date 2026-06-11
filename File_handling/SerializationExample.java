// serialization is the process of converting an object into a byte stream,which can be saved to a file or transmitted over a network.
//  In Java, we can achieve serialization using the `Serializable` interface and `ObjectOutputStream` class.
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationExample {

    public static void main(String[] args) throws Exception {

        Student s = new Student(101, "Rahul");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));

        oos.writeObject(s);

        oos.close();

        System.out.println("Object Serialized");
    }
}