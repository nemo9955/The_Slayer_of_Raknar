package game;

import game.GamePlay.GameplayState;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Start extends StateBasedGame {

    private final static String titlu = "The Slayer of Raknar";
    private static int width = 500;
    private static int height = 500;

    //  aici o sa initializam stagiile ;
    //	public static final int MENUSTATE = 0 ;
    public static final int GAMEPLAYSTATE = 0;

    public Start(String titlu) {
        super(titlu);
    }

    @Override
    public void initStatesList(GameContainer arg0) throws SlickException {
        // aici o sa le adaugam in joc
        addState(new GameplayState(GAMEPLAYSTATE));
    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new Start(titlu));
        app.setDisplayMode(width, height, false);
        app.setResizable(true);
        app.setShowFPS(true);
        //        app.setTargetFrameRate(60);
        app.start();
    }

}
//Keylos was here !!!! MUHAHA
/// nemo was here beachhhhh

/*
    ca sa adaugi Slick la joc :
    - clk dr p proiec -> proprietati
    - selectezi tabul "Libraries"
    - add external jars
    - adaugi alea 4 jar-uri de sunt in folderul lib de il adaugai
    - te duci la lwjgl.jar , dai expand -> native library location -> dublu clik
    - dai pe "external folder" , selectezi lib -> natives -> windows 
    
    in momentul asta ar trebui sa poti rula jocul , daca nu suna-ma

*/