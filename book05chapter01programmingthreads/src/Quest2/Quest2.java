package Quest2;


import java.io.IOException;

public class Quest2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        myThread t = new myThread();
        new Thread(()->{
            try {
                t.thread1();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=0;i<t.getList().size();i++){
                if(t.getList().get(i)%2==0){
//                    System.out.println(t.getList().get(i) + " La so Chan");
                    t.thread2(t.getList().get(i));
                }else{
//                    System.out.println(t.getList().get(i) + " La so Le");
                    t.thread3(t.getList().get(i));
                }
            }
        }).start();
    }
}
