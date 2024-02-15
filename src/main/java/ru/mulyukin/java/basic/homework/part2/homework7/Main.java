package ru.mulyukin.java.basic.homework.part2.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Ivan");
        Bicycle bicycle = new Bicycle(50);
        Horse horse = new Horse(100);
        Car car = new Car(150);
        AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle(150);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите транспорт: 1) велосипед , 2) лошадь , 3) машина, 4) вездеход ");
        int choise = scanner.nextInt();
        if(choise == 1){
            System.out.println("Вы выбрали велосипед ");
            bicycle.drive(300, Terrain.PLAIN);
        }else if (choise == 2) {
            System.out.println("Вы выбрали лошадь ");
            horse.drive(3000, Terrain.FOREST);
        }else if (choise == 3){
            System.out.println("Вы выбрали машина ");
            car.drive(3000, Terrain.SWAMP);
        } else if (choise == 4) {
            System.out.println("Вы выбрали вездеход ");
            allTerrainVehicle.drive(3000, Terrain.PLAIN);
        }else{
            man.drive(3000, Terrain.PLAIN);
        }

    }
}
