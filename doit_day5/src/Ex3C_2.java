import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex3C_2 {
    static  class PhysData{
        private String name;
        private int height;
        private double vision;

        public PhysData(String name, int height, double vision){
            this.name = name; this.height = height; this.vision= vision;
        }

        public String toString(){
            return name+" "+ height+ " "+ vision;
        }
        private static class HeightOrderComparator implements Comparator<PhysData>{
            public int compare(PhysData d1, PhysData d2){
                return (d1.height> d2.height) ? 1: (d1.height<d2.height)? -1:0;
            }
        }
        public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhysData[] info = {
                new PhysData("강민하",162,0.3),
                new PhysData("이수연",168,0.4),
                new PhysData("황지안",169,0.8),
                new PhysData("유서범",171,1.5),
                new PhysData("김찬우",173,0.7),
                new PhysData("장겨옹",174,1.2),
                new PhysData("박준서",175,2.0),
        };
        System.out.print("키가 몇 cm인 사람을 찾는교");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(info,new PhysData("",height,0.0),PhysData.HEIGHT_ORDER);

        if(idx<0){
            System.out.println("거 누구없소?");
        }else
            System.out.println("그값은 info["+idx+"] 에 있습니다.");
            System.out.println("찾는 데이터 : "+ info[idx]);
    }
}
