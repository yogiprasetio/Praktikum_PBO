/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_dosen_modul1;

import java.util.Scanner;

/**
 *
 * @author yogi-06926
 */
public class TugasOvereading {
    Scanner input = new Scanner(System.in);
    int[]c = new int[10];
    int s=0,z;
    int i,j,k,a,l;
    TugasOvereading( int[] c,int i, int j, int k,int a, int d){
        this.c = c;
        this.s=s ;
        this.i=i;
        this.j=j;
        this.k=k;
        this.a=a;
        this.l=d;
    }

    TugasOvereading() {
       
    }
    
    int[] Masuk(){
        
        for (i=0; i<c.length; i++)
        {
            System.out.print(" ,");
            j=input.nextInt();
            c[i]=j;
        }
        return c;
                
    }
    
   int[] Ascending(){
   
        
        for(i=0;i<c.length;i++){
            for(l=0;l<(c.length-1);l++){
                if(c[l]>c[l+1]){
                    k=c[l];
                    c[l]=c[l+1];
                    c[l+1]=k;
                }
            }
        }
        return c;
    }
    int[] Descending(){
        
        for(i=0;i<c.length;i++){
            for(l=0;l<(c.length-1);l++){
                if(c[l]<c[l+1]){
                    k=c[l];
                    c[l]=c[l+1];
                    c[l+1]=k;
                }
            }
        }
      return c;  
    }
    
    void Cetak(){
        
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+", ");
        
     }
    }
}
