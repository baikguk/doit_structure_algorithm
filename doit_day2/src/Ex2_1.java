import java.util.Arrays;

public class Ex2_1 {
    /*
        자료구조 : 데이터 단위와 데이터 자체 사이의 물리적 또는 논리적관계
            ㄴ 자료를 효율적으로 사용하기 위해 컴퓨터에 저장하는 방법
    */

    // 배열 : 같은 형의 구성요소가 줄지어 있는 단순한 자료구조
    public static void main(String[] args) {
        int[] a = new int[5];// -> 배열 본체 생성 : 배열요소,클래스 필드는 기본값으로 자동 초기화
                                //                하지만 지역변수는 자동 초기화되지않음
        int[] b = {1,2,3,4,5};
        // ㄴ 자로형은 : int 배열
        System.out.println(a.getClass().getName());
        int max  = b[0];
        for(int i =1 ; i<b.length;i++){
            if(max<b[i])max=b[i];
        }
        System.out.println(max);
        //  배열 요소를 하나씩 조사함 -> 주사(traverse) or 스캔이라고 함
    }

}
