import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {


    @Test
    public void canThrowaBall(){
        Game game=new Game();
        for(int i=0;i<20;i++){
           game.rolls(1);
        }

        assertEquals(game.score(),20);

    }




}