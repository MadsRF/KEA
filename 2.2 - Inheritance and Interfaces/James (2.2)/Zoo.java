import java.util.Random;
public class Zoo{
  public static void main(String args[]){
    final int maxX = 25;//banest�rrelsen s�ttes her!
    final int maxY = 25;
    int level = 7;//afstand mellem slange og kanin f�r jagten bliver m�lrettet!! level for�ges med een for hvert spil
    char input;
    int[] playerPos = new int[2];
    int[] newKoord = new int[2];
    boolean endGame=false;
    Snake snake1 = new Snake(maxX,maxY,"Cobra");//kalder sin egen konstrukt�r - der bare kalder super
    Snake snake2 = new Snake(maxX,maxY,"Mamba");
    Rabbit rabbit = new Rabbit(maxX,maxY,"RogerRabbit");//kalder Animals konstrukt�r - ligeson snake...
    char[] quitKeys =  {'q','Q','s','S'};//angiver tegn der skal afslutte spillet
    Keyboard keyboard = new Keyboard(quitKeys);
    Random dropKoord = new Random();
    
    do {
      System.out.println("Du er en vildfaren kanin der vil hjem i hulen. Korrdinaterne ("+maxX+","+maxY+") er kaninhullet");
      System.out.println("Slangerne vil spise dig - pas p� de jager dig hvis de ser dig");
      System.out.println("Er du i knibe? saa hop random i to felters afstand med [5] eller et andet tegn der ikke er et move...");

     //ops�t slangerne
      newKoord[0]=dropKoord.nextInt(maxX/2)+maxX/2;//slange1 s�ttes i nedre h�jre kvadrant
      newKoord[1]=dropKoord.nextInt(maxY/2);
      snake1.setPos(newKoord);
      newKoord[0]=dropKoord.nextInt(maxX/2);//slange2 s�ttes i �vre venstre kvadrant
      newKoord[1]=dropKoord.nextInt(maxY/2)+maxY/2;
      snake2.setPos(newKoord);
     //ops�t kanin (player)
      newKoord[0]=dropKoord.nextInt(maxX/2);//kaninen s�ttes i nedre venstre kvadrant
      newKoord[1]=dropKoord.nextInt(maxY/2);
      rabbit.setPos(newKoord);
     //banen er sat - spillet kan begynde!
     do {
          endGame=false;
          System.out.println(snake1.getName()+" er i pkt ("+snake1.getPos()[0]+","+snake1.getPos()[1]+")");
          System.out.println(snake2.getName()+" er i pkt ("+snake2.getPos()[0]+","+snake2.getPos()[1]+") \n");
          System.out.println(rabbit.getName()+", Du er i pkt ("+rabbit.getPos()[0]+","+rabbit.getPos()[1]+") \n");
          if (!rabbit.isEqual(snake1.getPos()) && !rabbit.isEqual(snake2.getPos())){
            if (rabbit.isWithinRange(1,snake1.getPos())||rabbit.isWithinRange(1,snake2.getPos())){//er kaninen bange =t�t p� slanger d�r vi n�ste gang og flytter ikke
              System.out.println("Ups en slange lige ved siden af - sidder helt stille!");
            }else{ //ellers flytter vi...
              newKoord = rabbit.getPos();
              System.out.println("Hop nu: [7] = tv+op  [8] = op   [9] = th+op ");
              System.out.println("        [4] = tv     [5] = JUMP [6] = th     ");
              System.out.print  ("        [1] = tv+ned [2] = ned  [3] = th+ned -->:");
              if (keyboard.readMoveSetXYPos(newKoord,true)) {
                rabbit.setPos(newKoord);
              } else {//der er ikke trykket et move s� vi JUMP'er :-)
                rabbit.jump();
                System.out.println("HOPPER");
              }
              System.out.println();
            }
          } else {
             if (rabbit.isEqual(snake1.getPos())){
                 System.out.println("Du er blevt spist af "+snake1.getName()+" i punktet ("+snake1.getPos()[0]+","+snake1.getPos()[1]+")");
                 endGame=true;
             } else {
                 System.out.println("Du er blevt spist af "+snake2.getName()+" i punktet ("+snake2.getPos()[0]+","+snake2.getPos()[1]+")");
                 endGame=true;
             }     
          }
          if (rabbit.getPos()[0]==maxX && rabbit.getPos()[1]==maxY){//er vi i m�l ? check om du er i m�l = udskriv sejr + endgame=true
            System.out.println("Pyhh endelig i sikkerhed - Spillet er vundet :-)!!!!!");
            endGame=true;
          }else{
            snake1.hunt(level,rabbit.getPos());//flyt slangerne (angrib)
            snake2.hunt(level,rabbit.getPos());
          }                                
      } while(!keyboard.isStop() && !endGame);
        endGame = true;
        keyboard.resetStop();//vi stoppede m�ske spillet med stop-taster men m�ske vil vi spille igen
        System.out.print("Vil du spille igen? (J/N):");
        input = keyboard.nextChar();
        if (input=='J' || input=='j'){//Quittasterne slutter ogs� spillet!
          endGame=false;
          level++; //spillet bliver nu sv�rere :-)
        }
    } while(!keyboard.isStop() && !endGame);//s� l�nge keyboard-seninel ikke er sat  
  }
}