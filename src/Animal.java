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

//    @Override
//    public int compareTo(Object o) {
//        int i = this.speed - ((Animal)o).speed;
//        if(i == 0){
//            return  this.price - ((Animal) o).price;
//        }else {
//            return i;
//        }
//    }

    @Override
    public int compareTo(Animal o) {
        int i = this.weight - o.weight;
        if (i == 0) {
            return this.speed - o.speed;
        } else return i;
    }
}

