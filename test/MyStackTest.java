import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    private MyStack<Integer> listInteger;

    @BeforeEach
    void newList(){
        listInteger = new MyStack<>();
    }

    @DisplayName("Push phần tử vào stack")
    @Test
    void testPush() {
        listInteger.push(1);
        listInteger.push(2);
        listInteger.push(3);
        int actualHead = listInteger.getHead().getData();
        assertEquals(1,actualHead);
        int actualTail = listInteger.getTail().getData();
        assertEquals(3,actualTail);
    }

    @DisplayName("Pop phần tử ra khỏi stack")
    @Test
    void testPop() {
        listInteger.push(1);
        listInteger.push(2);
        listInteger.push(3);
        int actualData = listInteger.pop().getData();
        assertEquals(3,actualData);
    }

    @DisplayName("Kiểm tra tail sau khi pop")
    @Test
    void testPopTail() {
        listInteger.push(1);
        listInteger.push(2);
        listInteger.push(3);
        listInteger.pop();
        int actualTail = listInteger.getTail().getData();
        assertEquals(2,actualTail);
    }

    @DisplayName("Lấy ra head của stack khi chưa có data")
    @Test
    void testGetHead() {
        assertNull(listInteger.getHead());
    }

    @DisplayName("Lấy ra tail của stack khi chưa có data")
    @Test
    void testGetTail() {
        assertNull(listInteger.getTail());
    }

    @DisplayName("Lấy ra tail với head khi có 1 node")
    @Test
    void testPush1Node(){
        listInteger.push(1);
        int actualHead = listInteger.getHead().getData();
        int actualTail = listInteger.getTail().getData();
        assertEquals(actualHead,actualTail);
    }
}