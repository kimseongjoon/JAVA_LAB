package example;

public abstract class Car {
    String name;

    final public void run() {
        start();
        drive();
        stop();
        turnoff();
        washCar();
    }

    abstract protected void start();

    abstract protected void drive();

    abstract protected void stop();

    abstract protected void turnoff();

    protected void washCar() {
        System.out.println("세차를 합니다.");
    }
}


class Sonata extends Car {
    public Sonata() {
        name = "Sonata";
    }

    @Override
    protected void start() {
        System.out.println("Sonata 시동을 켭니다.");
    }

    @Override
    protected void drive() {
        System.out.println("Sonata 달립니다");
    }

    @Override
    protected void stop() {
        System.out.println("Sonata 멈춥니다.");
    }

    @Override
    protected void turnoff() {
        System.out.println("Sonata 시동을 끕니다.");
    }
}

class Grandeur extends Car {
    public Grandeur() {
        name = "Grandeur";
    }

    @Override
    protected void start() {
        System.out.println("Grandeur 시동을 켭니다.");
    }

    @Override
    protected void drive() {
        System.out.println("Grandeur 달립니다");
    }

    @Override
    protected void stop() {
        System.out.println("Grandeur 멈춥니다.");
    }

    @Override
    protected void turnoff() {
        System.out.println("Grandeur 시동을 끕니다.");
    }
}

class Avante extends Car {
    public Avante() {
        name = "Avante";
    }

    @Override
    protected void start() {
        System.out.println("Avante 시동을 켭니다.");
    }

    @Override
    protected void drive() {
        System.out.println("Avante 달립니다");
    }

    @Override
    protected void stop() {
        System.out.println("Avante 멈춥니다.");
    }

    @Override
    protected void turnoff() {
        System.out.println("Avante 시동을 끕니다.");
    }
}

class Genesis extends Car {
    public Genesis() {
        name = "Genesis";
    }

    @Override
    protected void start() {
        System.out.println("Genesis 시동을 켭니다.");
    }

    @Override
    protected void drive() {
        System.out.println("Genesis 달립니다");
    }

    @Override
    protected void stop() {
        System.out.println("Genesis 멈춥니다.");
    }

    @Override
    protected void turnoff() {
        System.out.println("Genesis 시동을 끕니다.");
    }
}