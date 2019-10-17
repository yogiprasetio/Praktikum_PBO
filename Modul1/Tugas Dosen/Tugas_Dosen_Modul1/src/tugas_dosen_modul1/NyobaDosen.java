package tugas_dosen_modul1;

/**
 *
 * @author yogi-06926
 */
public class NyobaDosen extends TugasOvereading {
    int amaxx;
    
    void ascending(int i,int[]a){
        for(j=0;j<i;j++){
           amaxx=j;
            for(k=(j+1);k<=i;k++){
                if(a[k]<a[amaxx]){
                    amaxx=k;
                    l=a[(i-1)];
                    a[(i-1)]=a[amaxx];
                    a[amaxx]=l;
                    i--;
                }
            }
        }
    }
    
    void ascending(int i,double[]d, double f){
        for(j=0;j<i;j++){
           amaxx=j;
            for(k=(j+1);k<=i;k++){
                if(d[k]<d[amaxx]){
                    amaxx=k;
                    f=d[(i-1)];
                    d[(i-1)]=d[amaxx];
                    d[amaxx]=f;
                    i--;
                }
            }
        }
    }
    void descending(int i,double[]d,double f){
        for(j=0;j<i;j++){
           amaxx=j;
            for(k=(j+1);k<=i;k++){
                if(d[k]>d[amaxx]){
                    amaxx=k;
                    f=d[(i-1)];
                    d[(i-1)]=d[amaxx];
                    d[amaxx]=f;
                    i--;
                }
            }
        }
    }
    
    void descending(int i,int[]a){
        for(j=0;j<i;j++){
           amaxx=j;
            for(k=(j+1);k<=i;k++){
                if(a[k]>a[amaxx]){
                    amaxx=k;
                    l=a[(i-1)];
                    a[(i-1)]=a[amaxx];
                    a[amaxx]=l;
                    i--;
                }
            }
        }
    }
}
