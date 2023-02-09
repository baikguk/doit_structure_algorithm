public class Ex6_13 {
    static int buff[];

    static void __mergeSort(int[] a,int left, int right){
        if(left<right){
            int i;
            int center= (left+right)/2;
            int p =0; // 버퍼 포인터 및 뒷배열 포인터
            int j =0;  // 앞배열 커서
            int k = left; // 저장하려는 배열의 커서

            __mergeSort(a,left,center);
            __mergeSort(a,center+1,right);

            for(i=left;i<=center;i++){
                buff[p++] = a[i];
            }
            while(i<=right&&j<p){
                a[k++] = (buff[j]<=a[i])?buff[j++] : a[i++];
            }
            while(j<p){
                a[k++] = buff[j++];
            }
            while(i<right){
                a[k++] = a[i++];
            }
        }
    }
    static void mergeSort(int[] a){
        buff = new int[a.length];

        __mergeSort(a,0,a.length-1);

        buff=null;
    }

    public static void main(String[] args) {
        int[] a= new int[]{6,4,3,7,1,9,8};
        System.out.println("정렬 전");
        System.out.print("a : ");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        mergeSort(a);

        System.out.println("정렬 후");
        System.out.print("a : ");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }
}
