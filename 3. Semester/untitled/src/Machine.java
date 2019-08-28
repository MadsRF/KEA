public class Machine extends Object {

    private boolean isOn;


    public void turnOn(){
        this.isOn = true;
     }
    public void turnOff(){
        this.isOn = false;
     }


    @Override
    public String toString() {
        if (this.isOn) {
            return "machine is on";
        } else {
            return "machine is off";
        }
    }



}
