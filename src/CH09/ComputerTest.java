package CH09;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer(); // 추상클래스는 객체생성 X
        Computer c2 = new DeskTop();
        c2.display();
        c2.typing();
        //Computer c3 = new NoteBook(); // 추상클래스는 객체생성 X
        Computer c4 = new MyNoteBook();
        c4.display();
        c4.typing();
    }
}
