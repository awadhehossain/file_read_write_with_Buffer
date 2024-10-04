import java.io.*;

public class CtoDOnlyLetter {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("src/c.text");
            BufferedReader reader=new BufferedReader(file);
            FileWriter file1=new FileWriter("src/d.text");
            BufferedWriter writer=new BufferedWriter(file1);

            int character;

            // Read each character one by one
            while ((character = reader.read()) != -1) {
                if (Character.isLetter(character)) {
                    writer.write(character);
                }
            }
            reader.close();
            writer.close();


        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
