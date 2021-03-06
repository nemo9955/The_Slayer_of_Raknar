package game;

import game.GamePlay.GameplayState;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Start extends StateBasedGame {

    private final static String titlu = "The Slayer of Raknar";
    private static int WIDTH = 500;
    private static int HEIGHT = 500;

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
    /**
     * 
     * @param args
     * @throws SlickException
     */
    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new Start(titlu));
        app.setDisplayMode(WIDTH, HEIGHT, false);
        app.setResizable(true);
        app.setShowFPS(true);
        //        app.setTargetFrameRate(60);
        app.start();
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static void setWIDTH(int wIDTH) {
        WIDTH = wIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static void setHEIGHT(int hEIGHT) {
        HEIGHT = hEIGHT;
    }
    
}