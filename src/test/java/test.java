import methode.isHidingAnOption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test {
    isHidingAnOption hidingChecker = new isHidingAnOption();

    @Test
    public void Test1() {
        String input = "X.C...A";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertTrue(isHiding);
    }

    @Test
    public void test2() {
        String input = "X...C...A";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertFalse(isHiding);
    }
    @Test
    public void test3() {
        String input = "X..c...A";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertTrue(isHiding);
    }

@Test
    public void test4() {
        String input = "x..c...a";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertTrue(isHiding);
    }
    @Test
    public void test5() {
        String input = "x...C...a";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertFalse(isHiding);
    }
    @Test
    public void test6() {
        String input = "x...c...a";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertFalse(isHiding);
    }
    @Test
    public void test7() {
        String input = "x....c...a";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertFalse(isHiding);
    }
    @Test
    public void test8() {
        String input = "x....c...a";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertFalse(isHiding);
    }
    @Test
    public void test9() {
        String input = "XCA";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertFalse(isHiding);
    }
    @Test
    public void test10(){
        String input = "A...C..X";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertTrue(isHiding);

    }
    @Test
    public void test11(){
        String input = "A...C...X";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertFalse(isHiding);

    }
    @Test
    public void test12(){
        String input = "a..C...X";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertFalse(isHiding);
    }
    @Test
    public void test13(){
        String input = "acX";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertFalse(isHiding);
    }
    @Test
    public void test14(){
        String input = "X....A.C.....C.C";
        boolean isHiding = hidingChecker.isHidingAnOption(input);
        Assertions.assertFalse(isHiding);
    }




}
