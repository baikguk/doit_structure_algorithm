public class Ex6_1 {
    static void swap(int[] a, int idx1, int idx2){
        int box = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = box;
    }

    static void bubbleSort(int[] a,int n){
        for(int i =0;i<n;i++){
            for(int j = n-1;j>i;j--){
                if(a[j-1]>a[j]){
                    swap(a,j-1,j);
                }
            }
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
        System.out.println();

    }
}
