import java.util.Scanner;

public class Ex7_1 {
    static int bfMatch(String txt, String pat){
        int pt =0; //원본 커서
        int pp =0; // 검색 커서

        while(pp != pat.length() && pt != txt.length()){
            if(txt.charAt(pt)==pat.charAt(pp)){
                pt++;
                pp++;
            }else{
                pt = pt-pp+1;
                pp=0;
            }
        }
        if(pp==pat.length())
            return pt-pp;
        return -1;
    }

    static int bfMatchLast(String txt, String pat){
        int pt = txt.length() - 1;		// txt 커서
        int pp = pat.length() - 1;		// pat 커서

        while (pt >= 0 && pp >= 0) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt--;
                pp--;
            } else {
                pt = pt + (pat.length() - pp) - 2;
                pp = pat.length() - 1;
            }
        }
        if (pp < 0)					// 검색 성공
            return pt + 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "ABC이지스DEF";
        String s2 ="DEF";

        int idx = bfMatch(s1,s2);

        if(idx==-1){
            System.out.println("텍스트에 일치하는 패턴이 없습니다");
        }else{
            int len=0;
            for(int i =0; i<idx;i++){
                len += s1.substring(i,i+1).getBytes().length;
            }
            len += s2.length();
            System.out.println((idx+1) + "번째 문자부터 일치합니다");
            System.out.println("텍스트:"+s1);
            System.out.printf(String.format("패  턴:%%%ds\n",len),s2);
            System.out.printf("패  턴:%3s\n",s2);
            System.out.printf("패  턴:%%%d%s\n",idx+s2.length(),s2);
            System.out.printf(String.format("패  턴:%%%ds\n",idx+s2.length()),s2);
        }
        System.out.println("-".repeat(20));
        int idx2 = bfMatchLast(s1,s2);
        System.out.printf(String.format("패  턴:%%%ds\n",idx2+s2.length()),s2);
    }
}
