package timPhanTuMaxTrongSet;

import java.util.HashSet;
import java.util.Set;

//Viết phương thức findMax để tìm phần tử lớn nhất trong một Set.
// Nếu Set rỗng, phương thức sẽ trả về null.
public class FindMaxInSet {
    public static Integer findMax(Set<Integer> set){
        if (set.isEmpty()){
            return null;
        }else {
            int max = 0;
            for(int i : set){
                if (max < i){
                    max = i;
                }
            }
            return max;
        }
    }
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(6);
        numbers.add(23);
        numbers.add(14);
        System.out.println("Gia tri lon nhat trong Set la: " + findMax(numbers));
    }
}
