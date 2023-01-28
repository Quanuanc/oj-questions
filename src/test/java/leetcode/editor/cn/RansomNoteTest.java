package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    RansomNote.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new RansomNote().new Solution();
    }

    @Test
    void test1() {
        String ransomNote = "aa";
        String magazine = "ab";
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }
}