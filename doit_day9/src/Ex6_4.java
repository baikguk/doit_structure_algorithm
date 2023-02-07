public class Ex6_4 {
    static void swap(int[] a,int idx1,int idx2){
        int box= a[idx1];
        a[idx1]=a[idx2];
        a[idx2] = box;
    }
    static void selectionSort(int a[]){
        for(int i =0;i<a.length-1;i++){
            int min_idx =i;
            for(int j =i+1;j<a.length;j++){
                if(a[j]<a[min_idx]){
                    min_idx=j;
                }
            }
            swap(a,i,min_idx);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{6,4,8,3,1,9,7};
        selectionSort(a);
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
