public class Angle implements Comparable<Angle>{

    private int degrees;
    private int minutes;

    public Angle(int degrees, int minutes){
        this.degrees = degrees;
        this.minutes = minutes;
    }

    public int getDegrees(){
        return degrees;
    }

    public int getMinutes(){
        return minutes;
    }

    public String toString(){
        return degrees + "d " + minutes + "m ";

    }

    public int compareTo(Angle other){
        if (degrees != other.degrees){
            return degrees - other.degrees;
        }else
            return minutes - other.minutes;
    }

}