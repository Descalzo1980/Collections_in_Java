package lyambda;

class ExecutableImplementation implements Executable{

    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

class Runner{
    public void run(Executable e){
        e.execute();
    }
}

interface Executable{
    void execute();
}

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new ExecutableImplementation()); // 1

        runner.run(new Executable() { // 2
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });

        runner.run( () -> System.out.println("Hello")); // 3
    }
}
