public class Ex6_10 { // 스텍으로 재귀 퀵정렬 비재귀 화
    static void swap(int[] a, int idx1, int idx2) {
        int box = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = box;
    }

    static void quickSort(int[] a, int left, int right) {
        IntStack lstack = new IntStack(right - left - 1);
        IntStack rstack = new IntStack(right - left - 1);
        lstack.push(left);
        rstack.push(right);

        while (!lstack.isEmpty()) {
            int pl = left = lstack.pop();
            int pr = right = rstack.pop();
            int x = a[(left + right) / 2];
            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr) {
                    swap(a, pl++, pr--);
                }
            } while (pl <= pr);

            if(left<pr){
                lstack.push(left);
                rstack.push(pr);
            }
            if(pl<right){
                lstack.push(pl);
                rstack.push(right);
            }
        }
    }
    public static void main (String[]args){
        int[] a = new int[]{5, 8, 4, 2, 6, 1, 3, 9, 7};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


