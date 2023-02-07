import java.util.Scanner;

public class Ex6_6 {
    static int count;
    static void shellSort(int[] a, int n){
        for(int h = n/2;h>0;h/=2){
            for(int i=h;i<n;i++) {
                int j;
                int tmp = a[i];
                for(j= i-h;j>=0&&a[j]>tmp;j-=h)
                    a[j+h] = a[j];
                    count++;
                a[j+h] = tmp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("셀 정렬 버젼1");
        System.out.print("요솟수 : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i =0;i<n;i++){
            System.out.print("["+i+"} : ");
            a[i] = sc.nextInt();
        }

        shellSort(a,n);

        System.out.println("오름차순으로 정렬했습니다");
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"} : "+a[i]);
        }
        System.out.println("이동 횟수 : "+count);
    }
}
