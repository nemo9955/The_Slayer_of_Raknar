package game.GamePlay;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameplayState extends BasicGameState {

    private final int ID;

    private float x = 100;
    private float y = 100;
    
    private Input input ;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        input=gc.getInput();
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        
        if (input.isKeyDown(Input.KEY_W))
            y -= 0.5f * delta;
 
        if (input.isKeyDown(Input.KEY_S))
            y += 0.5f * delta;
 
        if (input.isKeyDown(Input.KEY_D))
            x += 0.5f * delta;
 
        if (input.isKeyDown(Input.KEY_A))
            x -= 0.5f * delta;
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.fillRect(x, y, 50, 50);

    }

    public GameplayState(int ID) {
        this.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }
}
