import java.util.Scanner;

public class Ex6_11 {
    static void swap(int[] a, int idx1, int idx2){
        int box=a[idx1]; a[idx1] = a[idx2];a[idx2]=box;
    }

    static int sort3elem(int[] x, int a,int b, int c){
        if(x[a]>x[b]) swap(x,a,b);
        if(x[b]>x[c]) swap(x,b,c);
        if(x[a]>x[b]) swap(x,a,b);
        return b;
    }

    static void quickSort(int[] a, int left,int right){
        int pl = left;
        int pr = right;
        int m = sort3elem(a,pl,(pl+pr)/2,pr);
        int x = a[m];

        swap(a,m,right-1);
        pl++;
        pr-=2;

        do{
            while(a[pl]<a[x]) pl++;
            while(a[pr]>a[x]) pr--;
            if(pl<=pr)
                swap(a,pl++,pr--);
        }while(pl<=pr);

        if(left<pr) quickSort(a,left,pr);
        if(pl<right) quickSort(a,pl,right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{5,8,4,2,6,1,3,9,7};

        quickSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println("a["+i+"] :"+a[i]);
        }
    }
}
