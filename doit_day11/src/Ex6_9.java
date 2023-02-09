public class Ex6_9 { // 재귀 알고리즘을 통해 그룹화 된 배열의 길이가 2이하 일때까지 계속 분할 반복 -> 길이가 1이면 정렬이 된 상태임으로
    static void swap(int[] a,int idx1,int idx2){
        int box = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = box;
    }

    static void quickSort(int[] a, int left,int right){ // 그룹별 왼끝과 오른끝을 파라미터로
        int pl=left; // 각각의 끝 값을 포인터에도 할당
        int pr=right;
        int x = a[(pl+pr)/2]; // 피버값은 단순하게 중간값

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

        // pl> pr인 상태임
        // 재귀를 통해 계속 분할함
        if(pr>left) // 그룹 개수가 1이면 pr=left가 됨 따라서 >= 조건은 무의미함
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
