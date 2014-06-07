/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tk.gratelteam.chem;

import java.awt.Image;
import java.util.Collection;
import tk.gratelteam.chem.element.Feature;

/**
 *
 * @author 陈濯
 */
public abstract class AbstractElement {
    /**
     *
     * @return a texture of this element
     */
    public abstract Image getTexture();

    /**
     * 
     * @return The elements of this element
     */
    public abstract Elements getElements();

    /**
     *
     * @param language of the system
     * @return The features of this element
     */
    public abstract Collection<Feature> getFeatures(Language language);
}
