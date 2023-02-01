import java.util.Scanner;

public class Ex3_4 {

    static int Search_binary(int[] a, int num, int key){
        int pl = 0;
        int pr = num -1;


        do{
            int pc = (pr+pl)/2;
            if(a[pc]==key) return pc;
            else if (a[pc]>key) {
                pr=pc-1;
            }else{
                pl=pc+1;
            }
        }while(pl<=pr);
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : " );
        int num =  sc.nextInt();

        int[] a = new int[num];

        System.out.print("a[0] 값을 입력해주세요 :" );
        a[0]= sc.nextInt();
        System.out.println("오름차순으로 입력해주세요");
        for(int i = 1; i<num;i++){
            do{
                System.out.printf("a["+i+"] : ");
                a[i] = sc.nextInt();
            }while(a[i]<a[i-1]); // do-while false시 종료 -> a[i]에 값을 잘 넣었을때
                            // do-while true시 반복 -> a[i]에 값을 재할당 이자나 병ㅅ니아
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int result = Search_binary(a,num,key);

        if(result==-1){
            System.out.println("찾는 값이 없습니다");
        }else{
            System.out.println("찾는 값은 a["+result+"] 에 있습니다"); // index 0 부터 시작하여 처음 찾는것을 반환함
        }

    }
}
