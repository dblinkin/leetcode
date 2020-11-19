package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution38 {

    public String[] permutation(String s) {
        if (s == null || s.length() == 0) {
            return new String[0];
        }

        List<char[]> result = new ArrayList<>();
        permutation0(s.toCharArray(), 0, result);
        Set<String> r = result.stream().map(String::new).collect(Collectors.toSet());
        return r.toArray(new String[r.size()]);

    }

    private void permutation0(char[] chars, int begin, List<char[]> result) {
        if (begin >= chars.length - 1) {
            result.add(java.util.Arrays.copyOf(chars, chars.length));
            return;
        }

        for (int i = begin; i < chars.length; i++) {
            if (begin != i) {
                swap(chars, begin, i);
            }
            permutation0(chars, begin + 1, result);
            if (begin != i) {
                swap(chars, i, begin);
            }
        }
    }

    public static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
