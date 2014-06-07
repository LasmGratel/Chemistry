/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tk.gratelteam.chem.element;

import com.google.common.collect.Lists;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.ImageIcon;
import tk.gratelteam.chem.AbstractElement;
import tk.gratelteam.chem.Element;
import tk.gratelteam.chem.Elements;
import tk.gratelteam.chem.Language;

/**
 *
 * @author 陈濯
 */
@Element(name="H",elements=Elements.H)
public class H extends AbstractElement{
    
    @Override
    public Image getTexture() {
        return new ImageIcon(getClass().getResource("/assets/chemistry/element/H.png")).getImage();
    }

    @Override
    public Elements getElements() {
        return Elements.H;
    }

    @Override
    public Collection<Feature> getFeatures(Language language) {
        if(language.equals(Language.en)){
            ArrayList<Feature> f=Lists.newArrayList(); 
            Feature f1=new Feature();
            f1.setContent("Air");
            f1.setDescription("It is a Air in normal.");
            f1.setName("Air");
            f.add(f1);
            return f;
        }else if(language.equals(Language.zh)){
            ArrayList<Feature> f=Lists.newArrayList(); 
            Feature f1=new Feature();
            f1.setContent("气体");
            f1.setDescription("在常温状态下他是气体。");
            f1.setName("气体");
            f.add(f1);
            return f;
        }return null;
    }
    
}
