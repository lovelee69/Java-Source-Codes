import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String args[]) throws InterruptedException {


        for (int i=60; i>0; i--){
            Thread thread =  new Thread();
            thread.sleep(1000);
            System.out.println(i);
        }


    }
}
