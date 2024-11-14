package Task1;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");

        dogBobik.run(150);
        dogBobik.swim(5);

        catMurzik.run(100);
        catMurzik.swim(5);

        FoodBowl bowl = new FoodBowl(25);
        Cat[] cats = {
                new Cat("Мурзик"),
                new Cat("Васька"),
                new Cat("Рыжик")
        };
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт?: " + cat.isFull());
        }

        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Общее количество животных: " + Animal.getAnimalCount());
    }
}
