package Java11;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ReadAndWriteUsingFileAPI {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Prachi.Jain\\IdeaProjects\\java 11\\src\\TextFile";
        try{
            // write
            Files.writeString(Path.of(path), "Testing the code" , StandardOpenOption.APPEND);
            // read
            String data = Files.readString(Path.of(path));
            System.out.println(data);
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
