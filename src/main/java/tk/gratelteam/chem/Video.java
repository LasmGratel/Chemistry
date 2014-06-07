

package tk.gratelteam.chem;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

/**
 *
 * @author 陈濯
 */
public class Video {
    public Video(){}
    public Video(String file,boolean nowPlay){
        try {
            if(nowPlay){
                Display.create();
                Display.setFullscreen(true);
                Display.update();
                GL11.glColor3d(0xFFF, 0xF94, 0xAFB);
                
            }
        } catch (LWJGLException ex) {
            Logger.getLogger(Video.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
