public class Ex6_1 {

    static int count_pass;
    static int count_compare;
    static int count_swap=count_compare=count_pass=0;
    static void swap(int a[],int idx1, int idx2){
        int box;
        box= a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=box;
    }

    static void bubbleSort(int a[]){
        int j=0;
        int last=j;
        while(j<a.length-1){
            System.out.println("패스 "+(count_pass+1)+":");
            int exchg = 0;
            for (int i = a.length - 1; i > j; i--) {
                for(int k=0;k<a.length;k++){
                    System.out.printf(" %c %d",(k!=i)?' ':a[i-1]>a[i]?'+':'-',a[k]);
                }
                System.out.println();
                if (a[i - 1] > a[i]) {
                    swap(a, i - 1, i);
                    exchg++;
                    last =  i;
                    count_swap++;
                }
                count_compare++;
            }
            for(int k=0;k<a.length;k++){
                System.out.printf("   %d",a[k]);
            }
            System.out.println();
            if(exchg==0)
                break;
            j=last;
            count_pass++;
        }

    }

    public static void main(String[] args) {
        int[] a= new int[]{1,3,9,4,7,8,6};
        bubbleSort(a);
        System.out.println("비교를"+count_compare+"번, 교환을"+count_swap+"번");
    }
}
