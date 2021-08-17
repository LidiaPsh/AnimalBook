import java.util.Objects;

public class Cow implements Animal {

    private String name = "";
    private String type = getType();
    private int age = 0;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return type + ": " + name +
                ", " + age + " лет";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return age == cow.age &&
                Objects.equals(name, cow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    public int countOfLegs() {
        return 4;
    }
    public String voice() {
        return "Muuu";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getType(){
        return getClass().getName();
    }
}
