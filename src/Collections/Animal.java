package Collections;

import java.util.Arrays;
import java.util.Comparator;

public class Animal implements Comparable<Animal> {
    String bread;
    int price;
    int speed;
    int weight;

    public Animal(String bread, int price) {
        this.bread = bread;
        this.price = price;
    }

    public Animal(String bread, int price, int speed, int weight) {
        this.bread = bread;
        this.price = price;
        this.speed = speed;
        this.weight = weight;
    }

    public String getBread() {
        return bread;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.bread + " " + this.price + " " + this.speed + " " + this.weight;
    }



    @Override
    public int compareTo(Animal o) {
        int i = this.weight - o.weight;
        if (i == 0) {
            return this.speed - o.speed;
        } else return i;
    }


}

class ComparatorByPrice implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).price - ((Animal)o2).price;
    }
}

class ComparatorByBread implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {return ((Animal)o1).bread.compareTo(((Animal)o2).bread);
    }
}

class Main implements Comparator{
    public static void main(String[] args) {

        Animal cat = new Animal("RedCat", 7005550, 22, 500);
        Animal dog = new Animal("Corgi", 28800, 22, 29);
        Animal bird = new Animal("King Penguin", 17088800, 6, 50);
        Animal tiger = new Animal("Tiger", 555555, 60, 550);

        Animal[] animals = {cat,dog,bird,tiger};

        Arrays.sort(animals,new ComparatorByPrice());

        for (Animal i : animals){
            System.out.println(i);
        }
        System.out.println("************************************");
        Arrays.sort(animals,new ComparatorByBread());

        for (Animal i : animals){
            System.out.println(i);
        }
        System.out.println("************************************");
        Arrays.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.speed - o2.speed;
            }
        });
        for (Animal i : animals){
            System.out.println("�������� " + i.bread + " ����� " + i.speed);
        }

    }

    @Override
    public int compare(Object o1, Object o2) {
        String bread = ((Animal)o1).bread;
        String bread1 = ((Animal)o2).bread;
        return bread1.compareTo(bread);
    }
}