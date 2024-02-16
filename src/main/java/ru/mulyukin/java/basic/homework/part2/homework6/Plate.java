package ru.mulyukin.java.basic.homework.part2.homework6;

public class Plate {

    private int maxFood;
    private int currentFood;

    public Plate(int maxFood, int currentFood) {
        this.maxFood = maxFood;
        this.currentFood = currentFood;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public void setMaxFood(int maxFood) {
        this.maxFood = maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void setCurrentFood(int currentFood) {
        this.currentFood = currentFood;
    }

    public void addFood(FoodPaket foodPaket) {
        if (currentFood + foodPaket.getFood() > maxFood) {
            currentFood = maxFood;
            System.out.println("Тарелка полная ");
            return;
        } else {
            System.out.println("Тарелку нельзя пополнить ");
        }
    }

    public void amountOfFoodLeft() {
        currentFood -= 30;
    }

    public boolean returnFood(){
        if(currentFood != maxFood && currentFood != 0){
            System.out.println("В тарелке еда есть ");
            return true;
        }
        return false;
    }
}





