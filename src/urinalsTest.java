import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @org.junit.jupiter.api.Test
    void goodString() {
        System.out.println("Lalith Kumar Kathula - Test 2 Implemented");
        String s1="011";
        String s2="00010";
        assertAll(() -> assertEquals(false, urinals.goodString(s1.toCharArray())),
                () -> assertEquals(false,urinals.goodString(s2.toCharArray())));
    }

    @org.junit.jupiter.api.Test
    void countUrinals() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}