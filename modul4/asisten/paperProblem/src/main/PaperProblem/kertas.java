package main.PaperProblem;


public class kertas extends Gudang {
    
    private String ukuranKertas;
    Hoemaaan men;
    
    
    kertas(String ukuran,int saldo,int debet,String waktu){
        this.ukuranKertas=ukuran;
        this.debet=debet;
        Ambilbrg(debet,saldo);
        this.waktu=waktu;
    }
    
    kertas(int saldo,int debet,String nama,String waktu){
        this.debet=debet;
        Stockbrg(debet);
        this.waktu=waktu;
        men=new Hoemaaan(nama);
        System.out.println("Kertas Berhasil Di Re-Stock, Thanks...");
    }

    
    
    
    @Override
    public void Stockbrg(int debet) {
        this.saldo=saldo+debet;
    }

    @Override
    public void Ambilbrg(int debet,int saldo) {
     this.saldo=saldo-debet;   
    }
}
