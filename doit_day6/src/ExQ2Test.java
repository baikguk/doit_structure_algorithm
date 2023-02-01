import java.util.Scanner;

public class ExQ2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> s = new Stack<String>(64);

        while(true){
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n",s.size(),s.getCapacity());
            System.out.print("(1) 푸시  (2) 팝  (3) 피크  (4) 덤프  (5) 검색 (6) 비움 (7) 상태 (0) 종료 :");

            int menu = sc.nextInt();
            if(menu==0) break;

            String x;
            switch (menu){
                case 1:
                    System.out.print("데이터: ");
                    x = sc.next();
                    try{
                        s.push(x);
                    }catch (Stack.OverflowIntStackException e){
                        System.out.println("스텍이 가득 찼습니다");
                    }
                    break;
                case 2:
                    try{
                        x = s.pop();
                        System.out.println("팝한 데이터는 "+x+" 입니다");
                    }catch (Stack.EmptyIntStackExceptrion e){
                        System.out.println("스텍이 비어 있습니다");
                    }
                    break;
                case 3:
                    try{
                        x = s.peek();
                        System.out.println("피크한 데이터는"+x+"입니다");
                    }catch (Stack.EmptyIntStackExceptrion e){
                        System.out.println("스텍이 비어 있습니다");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
                case 5:
                    System.out.println("검색할 문자열 입력");
                    x = sc.next();
                    try{
                        if(s.indexOf(x)!=-1)
                            System.out.println("해당 문자열은 꼭대기에서 부터 검색 했으며 "+s.indexOf(x)+"에 위치 했습니다");
                        else
                            System.out.println("찾는 문자열은 없습니다");
                    }catch (Stack.EmptyIntStackExceptrion e){
                        System.out.println("스텍이 비어 있습니다");
                    }
                    break;
                case 6:
                    s.clear();
                    break;
                case 7:
                    System.out.println("스텍이 비어져 있는지에 대한 여부");
                    System.out.println(s.isEmpty());
                    System.out.println("스텍이 다 차 있는지에 대한 여부");
                    System.out.println(s.isFull());
                    break;
            }
        }
    }
}
