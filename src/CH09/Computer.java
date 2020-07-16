package CH09;
// 추상 클래스
public abstract class Computer {
    // 추상 메소드
    public abstract void display();
    public abstract void typing();
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}

class DeskTop extends Computer {

    @Override
    public void display() {
        System.out.println("데스크탑 디스플레이()");
    }

    @Override
    public void typing() {
        System.out.println("데스크탑 타이핑()");
    }
}

abstract class NoteBook extends Computer {

    @Override
    public void display() {
        System.out.println("노트북 디스플레이()");
    }

    //typing() 구현 안함
}

class MyNoteBook extends NoteBook {

    @Override
    public void typing() {
        System.out.println("마이노트북 타이핑()");
    }
}