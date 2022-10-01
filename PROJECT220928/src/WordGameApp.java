// OpenChallenge
import java.util.Scanner;
class Player {
    String name;

    public Player() {

    }

    String getWordFromUser() {
        Scanner sc = new Scanner(System.in);
        String n_word = sc.nextLine();
        return n_word;
    }

    boolean checkSuccess(String word, String n_word) {
        int lastIndex = word.length() - 1;
        char lastChar = word.charAt(lastIndex);
        char firstChar = n_word.charAt(0);
        if(lastChar == firstChar){
            return true;
        }
        else {
            return false;
        }
    }
}

public class WordGameApp {
    static int run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        String word = "아버지";
        int num = sc.nextInt();
        sc.nextLine();
        Player [] p = new Player [num];

        for(int i = 0; i < num; i++){
            p[i] = new Player();
            System.out.print("참가자의 이름을 입력하세요>>");
            p[i].name = sc.nextLine();
        }

        System.out.println("시작하는 단어는 아버지입니다");

        while(true){
            for(int i = 0; i < num; i++) {
                System.out.print(p[i].name + ">>");
                String n_word = p[i].getWordFromUser();
                if(p[i].checkSuccess(word, n_word)){
                    word = n_word;
                }
                else{
                    System.out.println(p[i].name + "이 졌습니다.");
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
