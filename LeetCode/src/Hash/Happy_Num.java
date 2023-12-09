package Hash;

import java.util.HashSet;

public class Happy_Num {
    public boolean isHappy(int n) {
        HashSet<Integer> resultSet = new HashSet<>();
        int result = n;

        while (result != 1) {
            if (!resultSet.add(result)) {
                return false; // 如果无法添加到集合中，意味着出现了循环
            }

            result = getSquareSum(result);
        }

        return true;
    }
    private int getSquareSum(int num) {
        int squareSum = 0;
        while (num > 0) {
            int digit = num % 10;
            squareSum += digit * digit;
            num /= 10;
        }
        return squareSum;
    }
}
