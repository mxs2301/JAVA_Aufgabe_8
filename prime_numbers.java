import java.util.ArrayList;
public class prime_numbers {


    public static void Aufgabe_3_4(){

        ArrayList<Integer> Prime = new ArrayList<>();

        for(int i = 2; i<=1000; i++){
            Prime.add(i);
        }

        int i = 2;
        while(i<=1000){

            for(int j = i; j< Prime.size(); j++){
                if(Prime.get(j)%i == 0){
                    Prime.remove(j);
                }
            }

            i++;

        }

        for(Integer j : Prime){
            System.out.println(j);
        }


        for(int j = 0; j < Prime.size()-1; j++){
            if(Prime.get(j+1) - Prime.get(j)<=2){
                System.out.println("(" + Prime.get(j) + "," + Prime.get(j+1) + ")");
            }
        }


    }


}
