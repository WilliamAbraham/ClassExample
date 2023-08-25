import java.io.FileWriter; 
import java.io.IOException;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files



public class FileWriterReader{
    public static void write(String text){
        try{
            FileWriter myWriter = new FileWriter("newText.txt");
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void read(File txt){
        try {
            File myObj = txt;
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public static void main(String[] args){
        String Ari = "I Like Ari";
        write(Ari);
        File obj = new File("/Users/williamabraham/Desktop/ClassExample/randomText.txt");
        read(obj);
    }
}
