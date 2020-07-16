package CH10.bookshelf;

public class BookShelf extends Shelf implements Queue {
    @Override
    public void enQueue(String title) {
        shelf.add(title); // shelf 어레이리스트에 입력한 문자열을 추가(가장 뒤에 추가)
    }

    @Override
    public String deQueue() {
        return shelf.remove(0); //0번 인덱스 요소를 제거하고 리턴
    }

    @Override
    public int getSize() {
        return getCount(); // 어레이리스트의 사이즈 리턴 size()
    }
}
