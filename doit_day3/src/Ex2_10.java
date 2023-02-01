public class Ex2_10 {



    static double avgheight(Info[] h_info){
        double sum=0;
        for(int i =0; i< h_info.length;i++){
            sum += h_info[i].height;
        }

        return sum/h_info.length;
    }

    static int[] dist_v(Info[] info,int[] dist){

        int num = (int)(max_h-min_h)*100;
        d

    }

    public static void main(String[] args) {
        Info[] info = {
                new Info("강민하",162,0.3),
                new Info("김찬우",173,0.7),
                new Info("박준서",175,2.0),
                new Info("유서범",171,1.5),
                new Info("이수연",168,0.4),
                new Info("장경오",174,1.2),
                new Info("황지안",169,0.8),
        };

        System.out.println("■ 신체 검사 리스트 ■");
        System.out.printf("%-5s%3s%5s\n","이름","키","시력");
        System.out.println("------------------");
        for(int i =0;i< info.length;i++){
            System.out.printf("%-6s%3d%5.1f\n",info[i].name,info[i].height,info[i].vision);
        }
        System.out.printf("\n평균 키 : %.1fcm\n",Ex2_10.avgheight(info));
    }
}
class Info{

    String name;
    int height;
    double vision;

    Info(String name, int height, double vision){
        this.name = name;
        this.vision = vision;
        this.height = height;
    }

}
