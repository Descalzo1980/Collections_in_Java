package lyambda;


interface Executable{
    int execute(int x);
}

class Runner{
    public void run(Executable e){
        int a = e.execute(10);
        System.out.println(a);
    }
}


public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() { // 2
            @Override
            public int execute(int x) {
                return x + 10;
            }
        });
        runner.run( x -> x + 10); // 3
    }
}
