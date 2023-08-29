import java.io.File;
import java.io.IOException;
public class FileWriterReaderTester 
{

    public static void main(String[] args) throws IOException 
    {
        FileWriterReader tester = new FileWriterReader();
        tester.write("OutputFileName", "Hello! I want to write this into a file");
        File obj = new File("randomText.txt");
       tester.read(obj);
       System.out.print(tester.countCharacters("randomText.txt"));
    }
}
