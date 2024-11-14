package Task1;

class Cat extends Animal{
    private static int catCount = 0;
    private String name;
    private boolean isFull = false;

    public Cat(String name) {
        super();
        this.name = name;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
    public void eat(FoodBowl foodBowl, int amount) {
        if (foodBowl.removeFood(amount)) {
            isFull = true;
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }
}