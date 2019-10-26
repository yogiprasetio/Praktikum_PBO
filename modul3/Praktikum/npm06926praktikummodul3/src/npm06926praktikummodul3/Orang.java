package npm06926praktikummodul3;

/**
 *
 * @author yogi-06926
 */
public class Orang {
  private String nama,nik;
  int antri;
  
  Orang(String a,String b,int c){
      this.nama=a;
      this.nik=b;
      this.antri=c;
  }
  
  public String getNama(){
      return nama;
  }
  public String getNIK(){
      return nik;
  }
  public int getAntri(){
      return antri;
  }
}
