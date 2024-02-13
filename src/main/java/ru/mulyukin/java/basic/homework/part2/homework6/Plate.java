package ru.mulyukin.java.basic.homework.part2.homework6;

public class Plate {
    private int currentFood;
    private boolean food;
    private Cat cat;
    private int volume;
    private int maxFood;

    public int getMaxFood() {
        return maxFood;
    }

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



    public Plate(boolean food, int maxFood) {
        this.maxFood = maxFood;
        this.food = food;
    }

    public void addFood(FoodPaket foodPaket) {
        if (currentFood + foodPaket.getFood() > maxFood) {
            currentFood = maxFood;
            System.out.println(maxFood);
            foodPaket.clear();
        }
    }

    public void isPlate(FoodPaket foodPaket) {
        if (currentFood <= 50) {
            System.out.println("Тарелка пустая " + currentFood);
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


