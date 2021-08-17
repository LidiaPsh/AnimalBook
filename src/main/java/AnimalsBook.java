import java.util.*;

public class AnimalsBook {

    private List<Animal> animalList = new ArrayList<Animal>();

    public AnimalsBook(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalsBook that = (AnimalsBook) o;
        return Objects.equals(animalList, that.animalList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalList);
    }

    @Override
    public String toString() {
        return "AnimalsBook{" +
                "animalList=" + animalList +
                '}';
    }

    public void addToBook(Animal someAnimal) {
        animalList.add(someAnimal);
    }

    public boolean deleteFromBook(Animal someAnimal) {
        animalList.remove(someAnimal);
        return true;
    }

    public boolean reAge(String name, int newAge) {
        boolean chek = false;
        for (Animal element : animalList) {
            if (element.getName().equals(name)) {
                element.setAge(newAge);
                chek = true;
                return true;
            }
        }
        if (!chek) {
            System.out.println("кот не найден имя не изменено");
            return false;
        }
        return true;
    }

    public void reName(String name, String newName) {
        for (Animal element : animalList) {
            if (element.getName().equals(name)) {
                element.setName(newName);
            }
        }
    }

    public String sumOfAges(String type) throws InterruptedException {
        int sumAge = 0;
        for (Animal element : animalList) {
            if (element.getType().equals(type)) {
                sumAge += element.getAge();
            }
        }
        if (sumAge == 0) {
            throw new InterruptedException("We have not this type in our program");
        }
        return type + " sum Age: " + sumAge;
    }

    public String sumOfAll() {
        int sum = 0;
        for (Animal element : animalList) {
            sum += element.getAge();
        }
        return sum + " of all Animals";
    }

    public String countSomeAnimals(){
        Map<String, Integer> animalMap = new HashMap<>();
        for (Animal element: animalList){
            if(animalMap.containsKey(element.getType())){
                int countSomeAnimal=animalMap.get(element.getType());
                animalMap.put(element.getType(),++countSomeAnimal);
            }else {
                animalMap.put(element.getType(),1);
            }
        }
        return animalMap.toString();
    }






}
