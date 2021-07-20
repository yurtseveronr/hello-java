package _08_io;

import java.io.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        /*
        * System.out
        * System.in
        * System.err
         */

        System.out.println("Hello I/O classes!");
        System.err.println("An error occurred!");

        /*
        int read = System.in.read(); // -> read byte
        System.out.println(read);
        char read_char = (char) read;
        System.out.println(read_char);

        // Scanner
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);
        scanner.close();

        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println(name);
        scanner1.close();

        Scanner scanner2 = new Scanner(System.in);
        float float_number = scanner2.nextFloat();
        System.out.println(float_number);

         */

        // File class
        File file = new File("C:\\Users\\yurts\\Desktop","deneme.txt");
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isHidden());
        System.out.println(file.isAbsolute());

        // seri
        Person person = new Person("Onur Yurtsever","deneme",'M');
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("output.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
            fileOutputStream.close();
            objectOutputStream.close();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }

        //
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("output.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Person personDeserialized = (Person) objectInputStream.readObject();
            System.out.println(personDeserialized.getFullName());
            fileInputStream.close();
            objectInputStream.close();
        }
        catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }



    }
}
