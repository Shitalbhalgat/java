import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois =
            new ObjectInputStream(
                new FileInputStream("student.dat"));

        Student s =
            (Student) ois.readObject();

        System.out.println(s.id);
        System.out.println(s.name);

        ois.close();
    }
}