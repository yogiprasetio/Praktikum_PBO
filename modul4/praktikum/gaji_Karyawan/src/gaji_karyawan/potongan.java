package gaji_karyawan;

/**
 *
 * @author yogi-06926
 */
public class potongan extends gaji {

    private int pajak = 0;
    private int tunjangan=0;
    
    public void gaji(){
     gajian=4250000;   
    }

    public void setPajak(String jabatan) {
        gaji();
        if (jabatan.equals("CEO") || jabatan.equals("ceo")) {
            System.out.println("1");
            System.out.println("ceo= "+jabatan);
            this.pajak = (gajian * 10) / 100;
            System.out.println("gajian = "+gajian);
        } else if (jabatan.equals("CTO") || jabatan.equals("cto")) {
            System.out.println("2");
            System.out.println("ceo= "+jabatan);
            this.pajak = (gajian * 5) / 100;
            System.out.println("gajian = "+gajian);
        } else if (jabatan.equals("CFO")|| jabatan.equals("cfo")) {
            System.out.println("3");
            System.out.println("ceo= "+jabatan);
            this.pajak = (gajian * 3) / 100;
            System.out.println("gajian = "+gajian);
        } else {
            System.out.println("");
        }
    }

    public void setTunjangan(String status, int anak) {
        gaji();
        System.out.println("STATUS = "+status +"  | ANAK = "+anak);
        if (status.equals("SUDAH") || status.equals("sudah")) {
                   System.out.println("TOTOK KENE");
            if (anak > 0) {
                System.out.println("  > 1");
                this.tunjangan = (gajian * 20) / 100;
            } else {
                System.out.println("  < 1");
                this.tunjangan = (gajian * 10) / 100;
            }
        } else {
            this.tunjangan = 0;
        }
    }
public void Gajian(int tunjangan, int pajak) {
        int gajifx = gajian + tunjangan;
        gajifix=gajifx - pajak;
        
        System.out.println(gajifix);
        
    }
//    @Override
//    public int getGajian() {
//        return ;
//    }
//    void gaji(int tunjangan, int pajak) {
//
//        Gajian(pajak, tunjangan);
//    }

    public int getPajak() {
        return pajak;
    }

    public int getTunjangan() {
        return tunjangan;
    }

}
