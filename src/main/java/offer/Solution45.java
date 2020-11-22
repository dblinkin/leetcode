package offer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution45 {

    public String minNumber(int[] nums) {

        if (nums == null || nums.length < 1) {
            return "";
        }

        List<Integer> ns = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .sorted(comparator)
                .collect(Collectors.toList());
        StringBuilder result = new StringBuilder();
        for (Integer i : ns) {
            result.append(i);
        }
        return result.toString();

    }

    private Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            String n1 = String.valueOf(o1);
            String n2 = String.valueOf(o2);
            String s1 = n1 + n2;
            String s2 = n2 + n1;
            return s1.compareTo(s2);
        }
    };
}
