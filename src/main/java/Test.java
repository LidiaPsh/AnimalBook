import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        AnimalsBook animalsBook=new AnimalsBook(new ArrayList<Animal>());

        System.out.println(animalsBook.toString());
        animalsBook.addToBook(new Cat("Влад", 56));
        animalsBook.addToBook(new Cat("Вася", 46));
        animalsBook.addToBook(new Cow("Ромашка", 9));
        animalsBook.addToBook(new Cow("Милка", 12));
        System.out.println(animalsBook.toString());


        AnimalsBook animalsBook1=new AnimalsBook(new ArrayList<Animal>());
        animalsBook1.addToBook(new Cat("Влад", 56));
        animalsBook1.addToBook(new Dog("Вася", 46));
        animalsBook1.addToBook(new Cow("Ромашка", 9));
        animalsBook1.addToBook(new Cow("Милка", 12));
        animalsBook1.addToBook(new Dog("Вася", 46));
        animalsBook1.addToBook(new Dog("Вася", 46));
        animalsBook1.addToBook(new Cat("Влад", 56));

        animalsBook1.reAge("Вася", 20);
        animalsBook1.reName("Ромашка", "Бурая");
        animalsBook1.reName("Милка", "Лу");

        try {
            System.out.println(animalsBook1.sumOfAges("Cow"));
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(animalsBook1.sumOfAll());


        System.out.println(animalsBook1);
        System.out.println(animalsBook1.countSomeAnimals());




    }
}
