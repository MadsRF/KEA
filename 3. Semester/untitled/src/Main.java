import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Machine m = new Machine();
        m.turnOn();
        System.out.println(m);
        m.turnOff();
        System.out.println(m);

/*
        Printer p = new Printer();

        p.turnOn();
        p.print("hej dat18b", 5);
        p.turnOff();
*/
        //Machine p = new Printer();
        Machine r = new Radio();

        List<Machine> machineList = new ArrayList<>();
        machineList.add(new Printer());
        machineList.add(new Radio());
        machineList.add(new Machine());

        for (Machine ma : machineList) {
            ma.turnOn();

            if (ma instanceof Printer) {
                ((Printer) ma).print("hej", 4);
            }
        }
    }


}
