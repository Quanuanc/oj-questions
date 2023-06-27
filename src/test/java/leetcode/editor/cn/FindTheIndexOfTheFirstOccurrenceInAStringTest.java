package leetcode.editor.cn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    FindTheIndexOfTheFirstOccurrenceInAString.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
    }

    @Test
    public void test1(){
        String hay = "leetcode", need = "leetco";
        int result = solution.strStr(hay, need);
        Assertions.assertEquals(0, result);
    }
}