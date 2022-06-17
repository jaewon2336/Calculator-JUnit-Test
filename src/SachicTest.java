import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SachicTest {

    private Sachic sachic = new Sachic();

    @Test
    public void add_테스트() {
        // given
        int num1 = 5;
        int num2 = 3;

        // when
        int result = sachic.add(num1, num2);
        System.out.println(result);

        // then
        assertEquals(8, result);
    }

    @Test
    public void sub_테스트() {
        // given
        int num1 = 5;
        int num2 = 3;

        // when
        int result = sachic.sub(num1, num2);
        System.out.println(result);

        // then
        assertEquals(2, result);
    }

    @Test
    public void mul_테스트() {
        // given
        int num1 = 5;
        int num2 = 3;

        // when
        int result = sachic.mul(num1, num2);
        System.out.println(result);

        // then
        assertEquals(15, result);
    }

    @Test
    public void div_테스트() {
        // given
        int num1 = 5;
        int num2 = 3;

        // when
        int result = sachic.div(num1, num2);
        System.out.println(result);

        // then
        assertEquals(1, result);
    }
}
