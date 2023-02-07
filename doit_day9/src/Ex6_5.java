public class Ex6_5 {
    static void insertSort(int[] a){
        for(int i=1;i<a.length;i++){
            int box = a[i];
            for(int j=i;j>0;j--){
                if(box<a[j-1]){
                    a[j]=a[j-1];
                    a[j-1]=box;
                }
            }
            for(int k =0;k<a.length;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{6,4,1,7,3,9,8};
        insertSort(a);

    }
}