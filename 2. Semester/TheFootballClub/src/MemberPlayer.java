public class MemberPlayer {

    private String firstName;
    private String lastName;
    private int age;
    private int team;

    public MemberPlayer(String first, String last, int age, int team){
        this.firstName = first;
        this.lastName = last;
        this.age = age;
        this.team = team;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public int getTeam() {
        return team;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTeam(int team) {
        this.team = team;
    }
}
