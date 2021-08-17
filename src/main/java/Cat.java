import java.util.Objects;

public class Cat implements Animal {

    private String name = "";
    private String type = "Cat";
    private int age = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return  type + ": " + name+
                ", лет " + age ;
    }

    public int countOfLegs() {
        return 4;
    }

    public String voice() {
        return "Meouw";
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
        return type;
    }
}
