package collectionframework;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class IOTest {
	   public static void main(String[] args)
	   {
	      // Writing to a file
	      try 
	      {
	         FileWriter fw = new FileWriter("output.txt");
	         fw.write("Hello World!");
	         fw.close();
	         System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) 
	      {
	         System.out.println("An error occurred while writing to the file.");
	         e.printStackTrace();
	      }

	      // Reading from a file
	      try 
	      {
	         BufferedReader br = new BufferedReader(new FileReader("D:/newFile.txt"));
	         String line = br.readLine();
	         while (line != null) {
	            System.out.println(line);
	            line = br.readLine();
	       }
	         br.close();
	      } catch (IOException e) 
	      {
	         System.out.println("An error occurred while reading from the file.");
	         e.printStackTrace();
	      }

	   }


}
