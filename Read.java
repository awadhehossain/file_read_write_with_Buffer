import java.io.*;

public class Read {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/Input.txt");
            BufferedReader reader = new BufferedReader(file);
            /*
            Method 1
            String line ;
            while((line=reader.readLine())!=null){
               System.out.println(line);
           }
           */
             //Method 2
            while(true)
            {
                String line= reader.readLine();
                if(line!=null)
                {
                    System.out.println(line);
                }
                else
                    break;

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}


