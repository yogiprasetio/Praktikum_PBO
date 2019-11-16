package gaji_karyawan;

/**
 *
 * @author yogi-06926
 */
public class potongan extends gaji {

    private int pajak = 0;
    private int tunjangan=0;

    public void setPajak(String jabatan) {
        if (jabatan.equals("CEO") || jabatan.equals("ceo")) {
            System.out.println("1");
            System.out.println("ceo= "+jabatan);
            this.pajak = (getGajian() * 10) / 100;
            System.out.println("gajian = "+getGajian());
        } else if (jabatan.equals("CTO") || jabatan.equals("cto")) {
            System.out.println("2");
            System.out.println("ceo= "+jabatan);
            this.pajak = (getGajian() * 5) / 100;
            System.out.println("gajian = "+getGajian());
        } else if (jabatan.equals("CFO")|| jabatan.equals("cfo")) {
            System.out.println("3");
            System.out.println("ceo= "+jabatan);
            this.pajak = (getGajian() * 3) / 100;
            System.out.println("gajian = "+getGajian());
        } else {
            System.out.println("");
        }
    }

    public void setTunjangan(String status, int anak) {
        System.out.println("STATUS = "+status +"  | ANAK = "+anak);
        if (status.equals("SUDAH") || status.equals("sudah")) {
                   System.out.println("TOTOK KENE");
            if (anak > 0) {
                System.out.println("  > 1");
                this.tunjangan = (getGajian() * 20) / 100;
            } else {
                System.out.println("  < 1");
                this.tunjangan = (getGajian() * 10) / 100;
            }
        } else {
            this.tunjangan = 100;
        }
    }

//    @Override
//    public int getGajian() {
//        return ;
//    }
    void gaji(int tunjanganf, int pajakf) {
//         super.gajian=(4250000+tunjanganf)-pajakf;
        super.Gajian(pajakf, tunjanganf);
    }

    public int getPajak() {
        return pajak;
    }

    public int getTunjangan() {
        return tunjangan;
    }

}
