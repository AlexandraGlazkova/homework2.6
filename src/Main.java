

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(nums);
//        List<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i);
            if (x % 2 == 0) {
                System.out.print(x+" ");
            }else{
                System.out.print(" ");
            }

        }
    }
}

