import java.util.Scanner;

public class Ex7_3 { // KMP 법
    static int bmMatch(String txt, String pat) {
        int pt;
        int pp;
        int txtLen = txt.length();
        int patLen = pat.length();
        int[] skip  = new int[Character.MAX_VALUE+1];

        for(pt =0; pt<= Character.MAX_VALUE; pt++){
            skip[pt] = patLen;
        }
        for(pt = 0;pt<patLen;pt++){
            skip[pat.charAt(pt)] = patLen-pt-1;
        }
        while(pt<txtLen){
            pp = patLen-1;

            while(txt.charAt(pt)== pat.charAt(pp)){
                if(pp==0)
                    return pt;
                pp--;
                pt--;
            }
        pt += (skip[txt.charAt(pt)]>patLen-pp)?skip[txt.charAt(pt)] : patLen-pp;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "ABABCDEFGHA";
        String s2 ="ABC";

        int idx = bmMatch(s1,s2);

        if(idx==-1){
            System.out.println("텍스트에 일치하는 패턴이 없습니다");
        }else{
            int len=0;
            for(int i =0; i<idx;i++){
                len += s1.substring(i,i+1).getBytes().length;
            }
            len += s2.length();

            System.out.println("텍스트:"+s1);
            System.out.printf("패  턴:%3s\n",s2);
            System.out.println((idx+1) + "번째 문자부터 일치합니다");
            System.out.println("텍스트:"+s1);
            System.out.printf(String.format("패  턴:%%%ds\n",len),s2);
            System.out.printf("패  턴:%%%d%s\n",idx+s2.length(),s2);
            System.out.printf(String.format("패  턴:%%%ds\n",idx+s2.length()),s2);
        }
        System.out.println("-".repeat(20));
    }
}
