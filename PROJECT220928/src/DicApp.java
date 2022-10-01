// 실습 4-10
import java.util.Scanner;

class Dictionary {
    public Dictionary () {

    }
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String [] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word) {
        int num = 0, cnt = 0;
        for(int i = 0; i < 5; i++){
            if(word.equals(kor[i])){
                num = i;
            }
            else {
                cnt++;
            }
        }
        if(cnt == 5){
            return "0";
        }
        else {
            return eng[num];
        }
    }
}

public class DicApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dictionary d = new Dictionary();
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어? ");
            String word = sc.next();
            if(word.equals("그만")){
                break;
            }
            else {
                String e_name = d.kor2Eng(word);
                if(e_name == "0"){
                    System.out.println(word + "는 저의 사전에 없습니다.");
                }else {
                    System.out.println(word + "은 " + e_name);
                }
            }
        }
        sc.close();
    }
}
