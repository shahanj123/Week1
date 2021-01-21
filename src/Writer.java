import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        String filename= "Practice.txt";
        FileWriter filewriter = new FileWriter(filename);

        BufferedWriter bufferredwriter= new BufferedWriter(filename);
        
        bufferredwriter.write("Hello my name is Shahan\n I went to college at George Mason\n I am 24 years old\n");
        bufferredwriter.close();
    }
    
}
