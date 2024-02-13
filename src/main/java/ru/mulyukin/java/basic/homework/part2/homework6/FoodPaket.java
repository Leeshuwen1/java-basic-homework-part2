package ru.mulyukin.java.basic.homework.part2.homework6;

public class FoodPaket {

    private int food;
    private Plate plate;

    public int getFood() {
        return food;
    }

    public FoodPaket(int food) {
        this.food = food;
    }

    public void clear(){
        food = 0;
    }

    public void info(){
        System.out.println("В пакете " + food);
    }

//    public void compasion(Plate plate){
//        this.food = plate.getVolume();
//        System.out.println(food);
//    }

}
