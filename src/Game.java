public class Game {
    int[] rolls=new int[21];
    int roll=0;




    public int rolls(int pinsdown) {
        return rolls[roll++]+=pinsdown;
    }

    public int score() {
        int score=0;
        int frame=10;
        int cursor=0;
        for(int i=0;i<frame;i++){
            score+=rolls[cursor]+rolls[cursor+1];
            cursor+=2;
        }
        return score;
    }
}

