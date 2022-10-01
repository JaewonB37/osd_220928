// 실습 4-8
import java.util.Scanner;
class Phone{
    public String name;
    public String tel;

    public Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
}

public class PhoneBook {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int num = sc.nextInt();
        Phone p[] = new Phone[num];

        for(int i = 0; i < num; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = sc.next();
            String tel = sc.next();
            p[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true) {
            System.out.print("검색할 이름>>");
            String name = sc.next();
            int cnt = 0;
            if(name.equals("그만")){
                break;
            }
            else {
                for(int i = 0; i < num; i++){
                    if(name.equals(p[i].name)){
                        System.out.println(p[i].name + "의 번호는 " + p[i].tel + "입니다.");
                        break;
                    }
                    else{
                        cnt++;
                    }
                }
                if(cnt == num){
                    System.out.println(name + "이 없습니다.");
                }
            }
        }
        sc.close();
    }
}
