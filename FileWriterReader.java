import java.io.FileWriter; 
import java.io.IOException;


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

    public static void main(String[] args){
        String Ari = "I Like Ari";
        write(Ari);
    }
}
