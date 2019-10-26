package npm06926praktikumm3;

public class SequentialSearch extends ikiController {
    boolean temu = false;
    
    void searchSeuential(String it){
        for(i=0;i<baru.size();i++){
            if( baru.get(i).getName().equals(it)){
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
