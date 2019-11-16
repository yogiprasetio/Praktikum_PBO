package gaji_karyawan;

import java.util.Scanner;

/**
 *
 * @author yogi-06926
 */
public class Gaji_Karyawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, jabatan, status;
        int anak, gaji = 0, menu, index = 0;
        char lanjut = 'y';
        operand data = new operand();

        do {
            System.out.println("================================================");
            System.out.println("============ Software Hitung Gaji ==============");
            System.out.println("Menu : ");
            System.out.println("1. Tambah karyawan");
            System.out.println("2. Hitung gaji");
            System.out.println("3. List pegawai");
            System.out.println("4. EXIT");
            System.out.println("================================================");
            System.out.print("Pilihan : ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("================================================");
                    System.out.println("============ Software Hitung Gaji ==============");
                    System.out.println("============ Tambah data karyawan ==============");
                    System.out.print("Nama      : ");
                    nama = in.next();
                    System.out.print("Jabatan   : ");
                    jabatan = in.next();
                    System.out.print("Status Pernikahan :\n    Menikah (sudah/belum) : ");
                    status = in.next();
                    System.out.print("    Anak                  : ");
                    anak = in.nextInt();
                    data.tambah(nama, jabatan, gaji, status, anak);
                    System.out.println("Karyawan new has been added...");
                    break;
                case 2:
                    System.out.println("================================================");
                    System.out.println("============ Software Hitung Gaji ==============");
                    System.out.println("============ Tambah gaji karyawan ==============");
                    System.out.println("=================== list =======================");
                    for (karyawan tampil : data.getALL()) {
                        System.out.println("index = " + index);
                        System.out.println("Nama    = " + tampil.getNama());
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        index++;
                    }
                    System.out.print("Masukkan index data Karyawan = ");
                    index = in.nextInt();
                    data.hitungGajian(index);
                    System.out.println("Gaji " + data.list.get(index).getNama() + " Sudah disimpan...");
                    break;

                case 3:
                    System.out.println("================================================");
                    System.out.println("============ Software Hitung Gaji ==============");
                    System.out.println("============= List data karyawan ==============");
                    for (karyawan tampil : data.getALL()) {
                        System.out.println("index = " + index);
                        System.out.println("Nama    = " + tampil.getNama());
                        System.out.println("Jabatan = " + tampil.getJabatan());
                        System.out.println("Status  = " + tampil.getStatus());
                        System.out.println("Anak    = " + tampil.getAnak());
                        System.out.println("Gaji    = " + tampil.getGaji());
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                    break;

                case 4:
                    System.out.print("bye.......");
                    int sure = 0;
                    System.exit(sure);
                    break;
            }
        } while (lanjut == 'y');
    }

}
