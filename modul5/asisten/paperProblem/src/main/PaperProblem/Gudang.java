package main.PaperProblem;


abstract class Gudang {
    String waktu;
    int debet=0;
    int saldo=0;
    
        public int getSaldo() {
        return saldo;
    }

    public int getDebet() {
        return debet;
    }
    
    public abstract void Stockbrg(int debet);
    
    public abstract void Ambilbrg(int debet,int saldo);
}
