package tugasaslabm2_arraylist;

/**
 *
 * @author yogi-06926
 */
class Data {
    String Namas;
    int Nikmat, Nipa;
    
   
    public String getNamas(){
        return Namas;
    }
    public int getNikmat(){
        return Nikmat;
    }
    public int getNipa(){
        return Nipa;
    }
     public Data(String name,int a,int b){
        this.Namas=name;
        this.Nikmat=a;
        this.Nipa=b;
    }
}
