import java.util.Objects;

public class Dog implements Animal {

    private String name = "";
    private String type = "Dog";
    private int age = 0;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return  type + ": " + name+
                ", лет " + age;
    }

    public int countOfLegs() {
        return 4;
    }

    public String voice() {
        return "Gouyv";
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
