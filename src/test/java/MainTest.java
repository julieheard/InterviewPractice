import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void Example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] answer = Main.twoSum(nums, target);

        assertAll("answer",
                () -> assertEquals(answer[0], 0),
                () -> assertEquals(answer[1], 1)
        );
    }

    @Test
    void Example2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] answer = Main.twoSum(nums, target);

        assertAll("answer",
                () -> assertEquals(answer[0], 1),
                () -> assertEquals(answer[1], 2)
        );
    }

    @Test
    void Example3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] answer = Main.twoSum(nums, target);

        assertAll("answer",
                () -> assertEquals(answer[0], 0),
                () -> assertEquals(answer[1], 1)
        );
    }

    @Test
    void testForNoMatch() {
        int[] nums = {3, 5};
        int target = 6;
        int[] answer = Main.twoSum(nums, target);

        assertAll("answer",
                () -> assertEquals(answer[0], 0),
                () -> assertEquals(answer[1], 0)
        );
    }

}
