public class Printer extends Machine {


    public void print(String text, int amount){

        for (int i = 0; i < amount; i++){
            System.out.println(text);
        }
    }


}
