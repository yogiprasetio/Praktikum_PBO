package npm06926so;

/**
 *
 * @author yogi-06926
 */
public class Npm06926SO extends Thread {
//@Override
    public void run(){
        System.out.println("Thread Berjalan.....");
    }
    public static void main(String[] args) {
        Npm06926SO tl= new Npm06926SO();
        tl.start();
    }
    
}
