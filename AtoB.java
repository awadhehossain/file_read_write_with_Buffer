import java.io.*;

public class AtoB {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("src/A.text");
            BufferedReader reader=new BufferedReader(file);
            FileWriter file1=new FileWriter("src/B.text");
            BufferedWriter writer=new BufferedWriter(file1);
            String line ;
            while((line=reader.readLine())!=null)
            {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();


        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
