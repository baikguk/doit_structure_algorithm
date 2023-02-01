import java.util.Arrays;
import java.util.Scanner;

class Convertnum{

    static int convert(int num, int convert_num, char[] d){
        int digits = 0;
        String dchar = "01234456789ABCDEF";
        System.out.printf("%d | %6d\n", convert_num, num);
        do{

            if(num!=0) {
                System.out.printf("  +-------\n%d | %6d  ... %d\n", convert_num, num, num % convert_num);
            }else
                System.out.printf("  +-------\n%d | %6d\n", convert_num, num);
            d[digits++] = dchar.charAt(num%convert_num);
            num /= convert_num;
        }while(num!=0);

        for(int i =0;i<digits/2;i++){
            char x = d[i];
            d[i] = d[digits-1-i];
            d[digits-1-i] = x;
        }
        return digits;
    }

}

public class Ex_2_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int covert_n;
        int d;
        char[] result = new char[36];
        do {
            System.out.print("음이 아닌 10진수 입력 : ");
            num = sc.nextInt();
        }while(num<0);

        do{
            System.out.print("변환 진수 입력 : ");
            covert_n = sc.nextInt();
        }while(covert_n<2||covert_n>36);

        d = Convertnum.convert(num,covert_n,result);

        System.out.print(num+"을"+covert_n+"진수로 변환 시 : ");
        for(int i=0; i<d;i++){
            System.out.print(result[i]);
        }
        System.out.println("입니다");

    }
}
