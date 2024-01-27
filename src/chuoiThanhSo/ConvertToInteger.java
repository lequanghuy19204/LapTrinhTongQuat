package chuoiThanhSo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Viết chương trình Java để chuyển đổi một danh sách các chuỗi thành một danh sách các số nguyên.
// Nếu chuỗi không phải là số nguyên, bỏ qua chuỗi đó và tiếp tục với các chuỗi khác.
public class ConvertToInteger {
    public static List<Integer> StringToIntConvert(List<String> stringList){
        List<Integer> integerList = new ArrayList<>();
        for (String str : stringList){
            try {
                int number = Integer.parseInt(str);
                integerList.add(number);
            }catch (NumberFormatException n){
                System.out.println(str + " chuoi khong phai la so.");
            }
        }
        return integerList;
    }
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        System.out.println("Muốn dừng nhập: d ");
        int i = 1;
        while (true){
            System.out.print("Str["+i+"] : ");
            String stringNew = sc.next();
            if (stringNew.equals("d")){
                break;
            }else {
                stringList.add(stringNew);
                i++;
            }
        }
        List<Integer> integerList = StringToIntConvert(stringList);
        System.out.print("Cac chuoi chuyen ve so nguyen:" );
        for (int n : integerList){
            System.out.print(n + ", ");
        }
    }
}
