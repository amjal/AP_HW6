/**
 * Created by Amir on 5/11/2017.
 */
public abstract class ObjectDeck {
    protected Object array[];
    protected int dealIndex;
    public ObjectDeck(Object... object){
        this.array = new Object[object.length];
        for(int i =0 ; i < array.length ; i ++){
            this.array[i] = object[i];
        }
        dealIndex = array.length -1;
    }
    public Object deal(){
        if (this.isEmpty()) return null;
        dealIndex --;
        return array[dealIndex];
    }
    public int size(){
        return dealIndex +1;
    }
    public boolean isEmpty(){
        if (dealIndex == -1)
            return true;
        return false;
    }
}
