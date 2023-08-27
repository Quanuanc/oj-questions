package leetcode.editor.cn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    GroupAnagrams.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new GroupAnagrams().new Solution();
    }

    @Test
    void test1() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("eat", "tea", "ate"));
        expected.add(List.of("bat"));
        expected.add(List.of("tan", "nat"));
        Assertions.assertEquals(expected, solution.groupAnagrams(strs));
    }
}