/**
 * Created by Amir on 5/11/2017.
 */
public class CardDeck extends ObjectDeck{
    public CardDeck(Card cards[]){
        super(cards);
    }
    @Override
    public Card deal(){
        return (Card)super.deal();
    }
}
