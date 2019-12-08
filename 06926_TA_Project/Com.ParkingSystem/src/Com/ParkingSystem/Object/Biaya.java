package Com.ParkingSystem.Object;

/**
 *
 * @author yogi-06926
 */
public class Biaya {
    private int biaya;
    
    public Biaya(int biaya){
        setBiaya(biaya);
    }

    private void setBiaya(int biaya) {
    this.biaya=biaya;    
    }
    
    public int getBiaya(){
        return biaya;
    }
}
