public class Ex6_8 {
    static void swap(int[] a,int idx1,int idx2){
        int box = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = box;
    }

    static void partition(int[] a, int n){
        int pl=0;
        int pr=n-1;
        int x = a[n/2];

        do{
            while(a[pl]<x) pl++;
            while(a[pr]>x) pr--;
            if(pl<=pr){
                swap(a,pl++,pr--);
            }
        }while(pl<=pr);

        System.out.println("피버값은"+x+"입니다");

        System.out.println("피버값 이하의 그룹");
        for(int i =0;i<=pl-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println("피버값과 동일한 그룹");
        if(pl-1>=pr+1) {
            for (int i = pr + 1; i <= pl-1; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }


        System.out.println("피버값 이상의 그룹");
        for(int i =pr+1;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,8,7,4,5,2,6,3,9};
        partition(a,a.length);
    }
}
