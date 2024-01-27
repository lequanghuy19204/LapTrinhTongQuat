package timCacSoLapLai;


import java.util.*;

//Cho một danh sách các số, hãy hiển thị ra những số nào bị lặp lại nhiều hơn 1 lần trong danh sách đó
public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập các phần tử vào ArrayList (Nhập -1 để dừng):");
        while (true) {
            System.out.print("Nhập số: ");
            int input = scanner.nextInt();
            if (input == -1) {
                break; // Dừng lại nếu người dùng nhập -1
            }
            numbers.add(input);
        }

        Map<Integer, Integer> countNumbers = new HashMap<>();

        // Phương thức getOrDefault(key, defaultValue) là một phương thức trong Java giúp bạn
        // tránh được việc kiểm tra null khi bạn muốn lấy giá trị của một key từ một Map.
        // Nếu key có tồn tại trong Map, nó sẽ trả về giá trị tương ứng với key đó.
        // Nếu key không tồn tại, nó sẽ trả về giá trị mặc định bạn đã chỉ định
        for (int number : numbers){
            countNumbers.put(number, countNumbers.getOrDefault(number,0)+1);
        }
        for (Map.Entry<Integer,Integer> item : countNumbers.entrySet()){
            if (item.getValue() >= 2){
                System.out.println("So " + item.getKey() + " xuat hien " + item.getValue());
            }
        }
    }
}
