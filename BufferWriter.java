import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) {
        try{
            FileWriter file=new FileWriter("src/output.txt");
            BufferedWriter writer=new BufferedWriter(file);
            writer.write("My name is Awadhe Hossain.\n am a running student of Computer Science Department.\nMy university name is United  International University.\nIt is a popular university in Dhaka city.");

           writer.close();
        }catch (IOException e){
            e.printStackTrace();


        }
    }
}
