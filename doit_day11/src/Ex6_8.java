public class Ex6_8 {
    static void swap(int[] a,int idx1,int idx2){ // swapping
        int box = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = box;
    }

    static void partition(int[] a, int n){ // 퀵정렬 알고리즘 적용을 위해 피벗값을 기준으로 배열을 그룹화
        int pl=0; //그룹 별 시작 포인터
        int pr=n-1; // 그룹 별 끝 포인터
        int x = a[n/2]; // 피버값

        do{
            while(a[pl]<x) pl++; // 그룹 시작 포인터에서 오른쪽으로 피버값보다 큰 값을 찾음 (찾을 때까지 시작 포인터를 이동 시킴)
            while(a[pr]>x) pr--; // 그룹 끝 포인터에서 왼쪽으로 피버값보다 작은 값을 찾음( 찾을 때까지 끝 포인터를 이동)
            if(pl<=pr){ // pl과 pr이 교차되지 않았을 때 스왑해줌
                swap(a,pl++,pr--);
            }
        }while(pl<=pr);

        System.out.println("피버값은"+x+"입니다");

        System.out.println("피버값 이하의 그룹");
        for(int i =0;i<=pl-1;i++){ // pl이 가르키는 것은 피버값보다 큰값임으로 -1전의 인덱스까지
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println("피버값과 동일한 그룹");
        if(pl-1>=pr+1) { //피벗값과 중복한 값이 없다면 pr과 pl의 차이가 1, 있다면 중복값 갯수 n +1
            for (int i = pr + 1; i <= pl-1; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }


        System.out.println("피버값 이상의 그룹");
        for(int i =pr+1;i<n;i++){ //pr 이 가르키는 값은 피버값보다 작은 값임으로 +1 인덱스 부터 끝까지
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,8,7,4,5,2,6,3,9};
        partition(a,a.length);
    }
}
