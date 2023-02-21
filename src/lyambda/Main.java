package lyambda;


interface Executable{
    int execute(int x,int y);
}

class Runner{
    public void run(Executable e){
        int a = e.execute(10,15);
        System.out.println(a);
    }
}


public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        int b = 2;// scope!!!
        runner.run(new Executable() { // 2
            @Override
            public int execute(int x,int y) {
                int b = 2; // scope!!!
                return x + y;
            }
        });
        int a = 1;
//        a = 2; òàê íåëüçÿ, final required ó ëÿìáäû íåò îáëàñòè âèäèìîñòè

        runner.run( (x,y) -> {
            int v = 1;
            return x + y + a;
        }); // 3
        runner.run(Integer::sum); // 3
    }
}
