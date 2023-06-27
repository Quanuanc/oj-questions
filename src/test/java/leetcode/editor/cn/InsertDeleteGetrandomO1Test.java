package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertDeleteGetrandomO1Test {

    InsertDeleteGetrandomO1.RandomizedSet randomizedSet;

    @BeforeEach
    void setUp() {
        randomizedSet = new InsertDeleteGetrandomO1().new RandomizedSet();
    }

    @Test
    public void test1() {
        randomizedSet.insert(0);
        randomizedSet.insert(1);
        randomizedSet.remove(0);
        randomizedSet.insert(2);
        randomizedSet.remove(1);
        int random = randomizedSet.getRandom();
        assertEquals(2, random);
    }

    @Test
    public void test2() {
        boolean status;
        int random;
        status = randomizedSet.remove(0);
        assertFalse(status);
        status = randomizedSet.remove(0);
        assertFalse(status);
        status = randomizedSet.insert(0);
        assertTrue(status);
        random = randomizedSet.getRandom();
        assertEquals(0, random);
        status = randomizedSet.remove(0);
        assertTrue(status);
        status = randomizedSet.insert(0);
        assertTrue(status);
    }
}