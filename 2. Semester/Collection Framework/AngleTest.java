import java.util.*;

public class AngleTest{
    public static void main(String[] args){
        ArrayList<Angle> list = new ArrayList<Angle>();
        list.add(new Angle(34, 19));
        list.add(new Angle(34, 2));
        list.add(new Angle(34, 54));
        list.add(new Angle(34, 30));
        list.add(new Angle(14, 59));
        list.add(new Angle(47, 3));
        list.add(new Angle(4, 55));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}