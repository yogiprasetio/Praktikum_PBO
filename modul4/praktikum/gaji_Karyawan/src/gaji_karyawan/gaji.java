package gaji_karyawan;

/**
 *
 * @author yogi-06926
 */
abstract class gaji {
    private int gajian=4250000;
    int  gajifix;
    
//    gaji(){
//        this.gajian=4250000;
//    }
    
   public void Gajian(int tunjanganf, int pajakf) {
        this.gajifix = (gajian+tunjanganf)-pajakf;
        
        System.out.println(gajian+tunjanganf);
        
    }

    public int getGajian() {
        return gajian;
    }
    
    
    
}
