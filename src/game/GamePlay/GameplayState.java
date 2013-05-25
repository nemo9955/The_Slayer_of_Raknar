package game.GamePlay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameplayState extends BasicGameState {
    
    
    /* TODO
     * adauga un alt patrat albastru controlat din sageti
     * fa ca unu din patrate sa-si schimbe marimea de pe + si -
     * HINT : o sa-ti trebuiasca 3 variabile noi , 2 de coordonate si una de marime
     * 
     */
    
    

    private final int ID;

    private float x = 100;
    private float y = 100;
    
    private Input input ;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        // ascultatorul pentru input , e universal
        input=gc.getInput();
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        
        // daca sunt apasate butoanele valoarea lui x si y se modifica
        
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
        // un partar rosu de 50X50 px va fi desenat la coordonatele x , y
        g.setColor(Color.red);
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
