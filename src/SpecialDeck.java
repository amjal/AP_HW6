/**
 * Created by Amir on 5/12/2017.
 */
public class SpecialDeck extends ObjectDeck{
    public SpecialDeck(Card... cards){
        super(cards);
    }
    @Override
    public Card deal(){
        return (Card)super.deal();
    }
}
