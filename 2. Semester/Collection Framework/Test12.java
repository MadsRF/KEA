import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Cay on 21-02-2016.
 */
public class Test12 {
    public static void main(String[] args){

        String[] things = {"Bus", "Shark", "Ball", "Car", "Superman", "Phone", "Monkey"};
        //ArrayList<String> list = new ArrayList<String>();

        /*for(String x: things){
            list.add(x);
        }*/

        List<String> list = Arrays.asList(things);


        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}