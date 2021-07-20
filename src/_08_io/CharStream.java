package _08_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharStream {
    /*
    * Reader for input (abstract class)
    * Writer for output (abstract class)
     */

    public static void main(String[] args) {
        /*
        * StringReader
        * BufferedReader
        * InputStreamReader (FileReader)
        * PipedReader
        * CharArrayReader
         */

        /*
        * StringWriter
        * BufferedWriter
        * OutputStreamWriter (FileWriter
        * PipedWriter
        * CharArrayWriter
         */

        File file = new File("C:\\Users\\yurts\\Desktop", "deneme.txt");
        FileReader fileReader = null;

        try {
            int c;
            fileReader = new FileReader(file);
            while((c=fileReader.read()) != -1) {
                System.out.println((char) c);
            }
            fileReader.close();

        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }

       

    }



}
