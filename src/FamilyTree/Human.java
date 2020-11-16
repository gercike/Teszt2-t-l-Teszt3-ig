package FamilyTree;

public class Human {
    private String name;
    private Mother mother;
    private boolean hasMother;
    private Father father;
    private boolean hasFather;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHasMother() {
        return hasMother;
    }

    public void setHasMother(boolean hasMother) {
        this.hasMother = hasMother;
    }

    public boolean isHasFather() {
        return hasFather;
    }

    public void setHasFather(boolean hasFather) {
        this.hasFather = hasFather;
    }

    @Override
    public String toString() {
        return name;
    }
}
