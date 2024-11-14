package Task1;

class FoodBowl {
    private int food;

    public FoodBowl(int food) {
        this.food = food;
    }

    public boolean removeFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        } else {
            System.out.println("Недостаточно еды в миске.");
            return false;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }

    public int getFoodAmount() {
        return food;
    }
}
