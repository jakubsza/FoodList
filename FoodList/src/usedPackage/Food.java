package usedPackage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Food {
    private String id;
    private String name;
    private String scientificName;
    private Boolean tags[];
    
    public Food(){
    }
    
    public Food(String id, String name, String scientificName, Boolean tags[]){
        this.id=id;
        this.name=name;
        this.scientificName=scientificName;
        this.tags=tags;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setScientificName(String scientificName){
        this.scientificName=scientificName;
    }
    
    public String getScientificName(){
        return scientificName;
    }
    
    public void setTags(Boolean[] tags){
        this.tags=tags;
    }
    
    public Boolean[] getTags(){
        return tags;
    }
}
