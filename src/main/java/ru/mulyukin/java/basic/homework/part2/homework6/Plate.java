package ru.mulyukin.java.basic.homework.part2.homework6;

public class Plate {
    private int currentFood;
    private boolean food;
    private int volume;
    private int maxFood;

    public int getMaxFood() {

        return maxFood;
    }

    public int getCurrentFood() {
        currentFood = maxFood;
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


    public int getVolume() {
        return volume;

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public Plate(int maxFood) {
        this.maxFood = maxFood;

    }

    public void addFood(FoodPaket foodPaket) {
        if (currentFood + foodPaket.getFood() > maxFood) {
            currentFood = maxFood;
            System.out.println(" Еда " + foodPaket.getFood());
            foodPaket.clear();
        }
    }

    public boolean isPlate(Cat[] cats) {
        if (maxFood >= 50) {
            currentFood = maxFood;
            maxFood -= howMuchFoodIsLeft(30);
            System.out.println("Тарелка " + maxFood);
            return true;
        } else {
            System.out.println("Тарелка пустая " + currentFood);
            return false;
        }
    }

    public int howMuchFoodIsLeft(int amount) {
        currentFood -= amount;
        return amount;
    }

    public void info() {
        System.out.println("Тарелка " + currentFood);
    }


}





