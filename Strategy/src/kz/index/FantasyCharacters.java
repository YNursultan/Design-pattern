package kz.index;

public class FantasyCharacters {

    private String name;
    private int age;
    private int level;

    public Flys flyingType;
    public Walks walkingType;

    public FantasyCharacters(String name, int age, int level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public String tryToFly(){
        return flyingType.fly();
    }

    public String tryToWalk(){
        return walkingType.walk();
    }
}
