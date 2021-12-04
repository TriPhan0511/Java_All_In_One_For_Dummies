package Quest2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class myThread{
    static ArrayList<Integer> al = new ArrayList<>();

    public synchronized void thread1() throws IOException, InterruptedException {
        File file = new File("src/Quest1/number.txt");
        FileReader fr = new FileReader(file);
        int i;
        while((i=fr.read())!=-1){
            if(i==10)
                break;

        }
        int n=0;
        while ((i=fr.read())!=-1){
            if(i==10){
                al.add(n);
                n=0;
            }else {
                n = n*10 + Integer.parseInt(String.valueOf((char) i));
            }
        }

    }

    public synchronized void thread2(int n){
        System.out.print("Thread -2: " + n + " = ");
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+", ");
            }
        }
        System.out.print(n+ "\n");
        notify();
    }
    public synchronized void thread3(int n){
        System.out.println("Thread -3: "+n+" * " + n +" = " +(n*n));
        notify();
    }
    public ArrayList<Integer> getList(){
        return al;
    }

}
