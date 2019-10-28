package npm06926contoh;

/**
 *
 * @author yogi-06926
 */
public class Npm06926Contoh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable()){
            //@override
            public void run{
            System.out.println("Sedang Berjalan...");
        }
        }
    }
    t.start();
}
