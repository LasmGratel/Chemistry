/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tk.gratelteam.chem.element;

import tk.gratelteam.chem.crafting.Crafting;

/**
 *
 * @author 陈濯
 */
public class Feature {
    private String name;
    private String description;
    private String content;
    private Crafting[] toCraft;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Crafting[] getToCraft() {
        return toCraft;
    }

    public void setToCraft(Crafting[] toCraft) {
        this.toCraft = toCraft;
    }
    
}
