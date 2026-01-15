package Library;

public class Person {
    protected String name;
    protected int Level;
    protected String type;

    public Person(String name,int level, String type) {
        this.name = name;
        this.Level = level;
        this.type = type;

    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return Level;
    }
    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Level='" + Level + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
