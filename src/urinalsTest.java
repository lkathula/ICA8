import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @org.junit.jupiter.api.Test
    void goodString() {
        System.out.println("Lalith Kumar Kathula - Test 2 Implemented");
        String s1="011";
        String s2="00010";
        assertAll(() -> assertEquals(false, urinals.goodString(s1.toCharArray())),
                () -> assertEquals(true,urinals.goodString(s2.toCharArray())));
    }

    @org.junit.jupiter.api.Test
    void countUrinals() {
        System.out.println("Lalith Kumar Kathula - 4 Tests  Implemented");
        String s1="010";
        String s2="00010";
        String s3="00000";
        String s4="0000";
        assertAll(() -> assertEquals(0, urinals.countUrinals(s1.toCharArray())),
                () -> assertEquals(1,urinals.countUrinals(s2.toCharArray())),
                    () -> assertEquals(3,urinals.countUrinals(s3.toCharArray())),
        () -> assertEquals(2,urinals.countUrinals(s4.toCharArray())));
    }
}