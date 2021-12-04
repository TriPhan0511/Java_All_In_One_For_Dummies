package Quest1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Quest1 {
    public static void main(String[] args) throws IOException {
        Random rd = new Random();
//        int n = rd.nextInt(10,101);
        int n = rd.nextInt(100);
        File file = new File("src/Quest1/number.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(String.valueOf(n));
        for(int  i=0;i<n;i++){
            fw.write("\n");
           fw.write(String.valueOf(rd.nextInt(500)));
        }
        fw.close();

    }
}
