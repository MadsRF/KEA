public class MemberPlayer implements Comparable<MemberPlayer>{

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

    // Bruger ikke settere
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

    public int compareTo(MemberPlayer o1) {
        int compareInt = o1.getFirstName().compareTo(firstName);
        if (compareInt < 0) return 1;
        if (compareInt > 0) return -1;
        return 0;
    }

}
