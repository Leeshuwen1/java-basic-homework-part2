package ru.mulyukin.java.basic.homework.part2.homework6;

public class Plate {
    private int currentFood;
    private boolean food;
    private Cat cat;
    private int volume;

    public int getCurrentFood() {
        return currentFood;
    }

    public void setCurrentFood(int currentFood) {
        this.currentFood = currentFood;
    }

    public boolean getFood() {
        return food;
    }

    public boolean setFood(boolean food) {
        return true;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public int getVolume() {
        volume = 70;
        System.out.println(volume);
        return volume;

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public Plate(boolean food, int currentFood) {
        this.currentFood = currentFood;
        this.food = food;
        this.cat = cat;
        this.volume = volume;

    }

    public void addFood(FoodPaket foodPaket) {
        if (currentFood <= 50) {
            currentFood += foodPaket.getFood();
                System.out.println(currentFood);
                foodPaket.clear();
        }
    }

    public void isPlate(FoodPaket foodPaket) {
        if (this.currentFood <= 50) {
            System.out.println("Тарелка пустая " + currentFood);
            addFood(foodPaket);
        } else {
            System.out.println("Тарелка полная");
        }
    }

    public void decreaseFood(int amount) {
        currentFood -= amount;
    }

    public void info() {
        System.out.println("Тарелка " + this.currentFood);
    }


}


