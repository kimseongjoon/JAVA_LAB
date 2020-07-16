package CH09;

public abstract class PlayerLevel {
    // 추상 메소드(하위클래스에서 구현)
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    //템플릿 메소드(오버라이드 X)
    final public void go(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}

class BeginnerLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("Jump 할줄 모르지롱");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할줄 모르지롱");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***초보자 레벨입니다.***");
    }
}


class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 Jump합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할줄 모르지롱");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***중급자 레입니다.***");
    }
}

class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("엄청 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 Jump합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한바튀 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***고급자 레입니다.***");
    }
}