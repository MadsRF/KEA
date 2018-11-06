
import java.util.Random;

public class Rabbit extends Animal{//arver fra den abstrakte klasse

Random r = new Random();

public Rabbit (int x, int y,String name){
  super(x,y,name);
}
public void jump(){
  //en metode der lader kaninen hoppe forskrækket 2x2 felter i en tilfældig retning fx ved tryk på 5 :-)
  int[] xy=new int[2];
  if (r.nextBoolean()){
    xy[0]=xy[0]+2;
  }else{
     xy[0]=xy[0]-2;
  }
   if (r.nextBoolean()){
    xy[1]=xy[1]+2;
  }else{
     xy[1]=xy[1]-2;
  }
  setPos(xy); //SetPos korrigerer hvis vi er sprunget ud af banen :-)
}
}