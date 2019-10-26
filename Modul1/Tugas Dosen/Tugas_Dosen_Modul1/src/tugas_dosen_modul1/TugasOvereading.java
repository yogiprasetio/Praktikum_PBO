package tugas_dosen_modul1;

public class TugasOvereading {
    int[] a= new int[20];
    double[] d=new double[20];
    int j,k,l;
    
    void input(int v,int b){
        a[v]=b;
    }
    
    void input(int v,double db){
        d[v]=db;
    }
    
    void ascending(int i){
        for(j=0;j<i;j++){
            for(k=0;k<(i-1);k++){
                if(a[k]<a[k+1]){
                    l=a[k];
                    a[k]=a[k+1];
                    a[k+1]=l;
                }
            }
        }
    }
    
    void ascending(int i, double f){
        for(j=0;j<i;j++){
            for(k=0;k<(i-1);k++){
                if(d[k]<d[k+1]){
                    f=d[k];
                    d[k]=d[k+1];
                    d[k+1]=f;
                }
            }
        }
    }
    
    void descending(int i){
        for(j=0;j<i;j++){
            for(k=0;k<(i-1);k++){
                if(a[k]>a[k+1]){
                    l=a[k];
                    a[k]=a[k+1];
                    a[k+1]=l;
                }
            }
        }
    }
    
    void descending(int i, double f){
        for(j=0;j<i;j++){
            for(k=0;k<(i-1);k++){
                if(d[k]<d[k+1]){
                    f=d[k];
                    d[k]=d[k+1];
                    d[k+1]=f;
                }
            }
        }
    }
    
    int[] Cetak(){
    return a;
    }
    double[] petak(){
        return d;
    }
    
}