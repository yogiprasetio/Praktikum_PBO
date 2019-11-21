package main.PaperProblem;

/**
 *
 * @author yogi-06926
 */
public class Departement {
private String namaDepartment;
private String tujuan;
Hoemaaan man;
kertas ppr;

    Departement(String nama,String jabatan,String Departemen,String tujuan,String ukuran,int saldo,int debet,String waktu) {
        this.namaDepartment = Departemen;
        this.tujuan = tujuan;
        man =new Hoemaaan(nama,jabatan);
        ppr=new kertas(ukuran,saldo,debet,waktu);
    }

    

    public String getNamaDepartment() {
        return namaDepartment;
    }

    public String getTujuan() {
        return tujuan;
    }


}
