/**
 * Created by Amir on 5/11/2017.
 */
public abstract class Card {
    private String name;
    private String description;
    public Card(String name , String description){
        this.name = name;
        this.description = description;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public boolean equals(Card card){
        if( card.getName().equals(name) && card.getDescription().equals(description)) return true;
        return false;
    }
    public String toString(){
        return "name: "+name+"\n"+description;
    }
}
