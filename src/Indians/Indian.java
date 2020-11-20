package Indians;

import java.util.ArrayList;

public class Indian {
    private String name;
    private String tribe;
    private Gender gender;
    private int age;
    private ArrayList<String> equipment;

    public Indian(String name, String tribe, Gender gender, int age, ArrayList<String> equipment) {
        this.name = name;
        this.tribe = tribe;
        this.gender = gender;
        this.age = age;
        this.equipment = equipment;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
