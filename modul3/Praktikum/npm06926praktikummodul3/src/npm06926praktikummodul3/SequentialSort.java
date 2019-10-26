package npm06926praktikummodul3;

import java.util.ArrayList;

public class SequentialSort {
  int i,f,l,m;
  boolean temu;
        public void Ssort(String it, ArrayList<Orang>orang){
//            System.out.println(orang.size());
    for(i=0;i < orang.size();i++){
    
            if( orang.get(i).getNama().equals(it)){
                temu = true;
                break;
            }
            else{
                System.out.println("Sorry, Data Not Found...!!!");
            }
        }
        System.out.println(it + " found at location " + (i + 1) + ".");
        }
  
  
}
