public class Ex6_9 {
    static void swap(int[] a,int idx1,int idx2){
        int box = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = box;
    }

    static void quickSort(int[] a, int left,int right){
        int pl=left;
        int pr=right;
        int x = a[(pl+pr)/2];

        System.out.printf("a[%d] ~ a[%d]: {",left,right);
        for(int i=left;i<right;i++){
            System.out.printf("%d, ",a[i]);
        }
        System.out.printf("%d} \n",a[right]);
        do{
            while(a[pl]<x) pl++;
            while(a[pr]>x) pr--;
            if(pl<=pr){
                swap(a,pl++,pr--);
            }
        }while(pl<=pr);

        if(pr>left)
            quickSort(a,left,pr);
        if(pl<right)
            quickSort(a,pl,right);
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,8,4,2,6,1,3,9,7 };
        quickSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
