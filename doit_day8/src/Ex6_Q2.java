public class Ex6_Q2 {
    static int count_compare;
    static int count_swap;
    static void swap(int[] a, int idx1, int idx2){
        int box = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = box;

    }

    static void bubbleSort(int[] a,int n){
        for(int i =0;i<n;i++){
            System.out.println("패스 "+(int)(i+1)+":\n");
            for(int j = n-1;j>i;j--){
                for (int k =0;k<n;k++) {
                    System.out.printf("%3d %c", a[k],(k==j-1)?(a[j-1]>a[j])?'+':'-':' ');
                }
                if(a[j-1]>a[j]){
                    swap(a,j-1,j);
                    count_swap++;
                }
                System.out.println();
                count_compare++;
            }
            for (int k =0;k<n;k++) {
                System.out.printf("%3d  ", a[k]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{6,4,3,7,1,9,8};

        System.out.println("정렬 전 : " );
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        bubbleSort(a,a.length);
        System.out.println("정렬 후 : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("비교 횟수 : "+count_compare+"     교환 횟수 : "+count_swap);

    }
}
