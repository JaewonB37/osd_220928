// 실습 4-2
import java.util.Scanner;
class Grade {
    private int math, science, english;
    public Grade(int a, int b, int c){
        this.math = a;
        this.science = b;
        this.english = c;
    }
    int average() {
        return (int)((math + science + english) / 3);
    }
}

public class Practice_4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());

        sc.close();
    }
}
