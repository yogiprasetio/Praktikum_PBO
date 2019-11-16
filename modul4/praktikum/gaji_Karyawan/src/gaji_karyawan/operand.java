package gaji_karyawan;

import java.util.ArrayList;

/**
 *
 * @author yogi-06926
 */
public class operand {

    ArrayList<karyawan> list = new ArrayList<>();

    operand() {
        
    }

    public void tambah(String nama, String jabatan, int gaji, String status, int anak) {
        karyawan kar = new karyawan(nama, jabatan, gaji, status, anak);
        list.add(kar);
    }

    public void hitungGajian(int index) {
       potongan pot = new potongan();
//        System.out.println("SIZE LIST = "+list.size());
//        System.out.println("STATUS GET FROM LIST = "+list.get(0).getStatus());
//        System.out.println("Gaji kotor = " + pot.getGajian());
        String jabatan = list.get(index).getJabatan();
        pot.setPajak(jabatan);
        System.out.println("pajak       = " + pot.getPajak());
        int pajakf = pot.getPajak();
        String status = list.get(index).getStatus();
        int anak = list.get(index).getAnak();
        pot.setTunjangan(status, anak);
        System.out.println("Tunjangan   = " + pot.getTunjangan());
        int tunjanganf = pot.getTunjangan();
        pot.gaji(tunjanganf, pajakf);
        System.out.println("Gaji Bersih = " + pot.gajifix);//ini nanti dibuat get method untuk overload
        String nama = list.get(index).getNama();

        int gaji = pot.getGajian();
        list.set(index, new karyawan(nama, jabatan, gaji, status, anak));
    }

    public ArrayList<karyawan> getALL() {
        return list;
    }
}
