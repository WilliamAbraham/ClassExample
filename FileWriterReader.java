import java.io.FileWriter; 
import java.io.IOException;
import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class FileWriterReader{
    public static void write(String path, String text){
        try{
            FileWriter myWriter = new FileWriter(path);
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
        write("arilover12.txt", Ari);
        File obj = new File("randomText.txt");
        read(obj);
    }
}
