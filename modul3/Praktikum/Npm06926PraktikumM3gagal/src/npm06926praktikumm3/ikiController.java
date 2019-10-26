package npm06926praktikumm3;
import java.util.ArrayList;
//import java.util.Collections;


public class ikiController {
    int i=1;
    String it;
    private ArrayList<Data> baru;

public ikiController(){
    baru = new ArrayList<>();
}

void entri(String a,String b,int c){

Data data=new Data(a, b, c);
baru.add(data);

}

public ArrayList<Data> getList(){

//    System.out.println(baru.size());
    return baru; //return arraylist
}

}

