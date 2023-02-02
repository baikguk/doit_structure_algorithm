public class Ex6_Q1 {
    static void swap(int[] a, int idx1, int idx2){
        int box = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = box;
    }

    static void bubbleSort(int[] a,int n){
        for(int i =0;i<n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
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
