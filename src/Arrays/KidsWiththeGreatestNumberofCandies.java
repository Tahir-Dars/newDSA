package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    //Q_link  https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
    static void main() {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> ansArray = calculatingfucntion(candies, extraCandies);
        for (boolean x: ansArray){
            System.out.print(x+" ");
        }
    }

    private static List<Boolean> calculatingfucntion(int[] candies, int extraCandies) {
        boolean[] booleans = new boolean[candies.length];
        int max = candies[0];
        for (int x : candies) {
            if (x > max) {
                max = x;
            }
        }
        for (int x = 0; x < candies.length; x++) {
            if (candies[x] + extraCandies >= max) {
                booleans[x] = true;
            }
        }
        List<Boolean> result = new ArrayList<>(candies.length);
        for (boolean b : booleans) {
            result.add(b);
        }
        return result;
    }
}
