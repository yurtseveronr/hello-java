package _08_io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteStream {
    /*
     * InputStream for input (abstract class)
     * OutputStream for output (abstract class)
     */

    public static void main(String[] args) {

        /*
        * FileInputStream
        * ByteArrayInputStream
        * FilterInputStream (DataInputStream, BufferedInputStream, PushBackInputStream)
        * PipedInputStream
        * SequenceInputStream
        * AudioInputStream
        * ObjectInputStream
         */

        File file = new File("C:\\Users\\yurts\\Desktop", "deneme.txt");
        System.out.println(file.exists());

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            int c;
            while ((c = fileInputStream.read()) != -1) { // or readAllBytes, read(byte[])
                System.out.println((char) c);
            }

            fileInputStream.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // try-with-resources and read all bytes

        FileOutputStream fileOutputStream = null;
        String textFile = "this is to write to text file!";
        byte[] array = textFile.getBytes(StandardCharsets.UTF_8);


        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(array);
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }


        // copying file
        File sourceFile = new File("C:\\Users\\yurts\\Desktop", "deneme.txt");
        File destinationFile = new File("C:\\Users\\yurts\\Desktop", "file.txt");
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            int c;
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile);
            while((c = fis.read())!=-1) {
                fos.write(c);
            }
        }

        catch (IOException ioException) {
            ioException.printStackTrace();
        }






    }
}