package npm06926sorunnable;

/**
 *
 * @author yogi-06926
 */
public class Npm06926SORunnable implements Runnable {
//@ override
    public void run(){
        System.out.println("Sedadng Berjalan...");
    }
    public static void main(String[] args) {
        Npm06926SORunnable mlbb=new Npm06926SORunnable();
        Thread tl = new Thread(mlbb);
        tl.start();
    }
    
}
