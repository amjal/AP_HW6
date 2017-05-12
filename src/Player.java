import java.util.*;

/**
 * Created by Amir on 5/12/2017.
 */
public class Player {
    private Special nextSpecial;
    private int lifePoints;
    private CardDeck mainDeck;
    private SpecialDeck specialDeck;
    private Card [] hand = new Card[5];

    public Player(CardDeck mainDeck , SpecialDeck specialDeck , int lifePoints){
        this.mainDeck = mainDeck;
        this.specialDeck = specialDeck;
        this.lifePoints = lifePoints;
    }
    public Player(CardDeck mainDeck , SpecialDeck specialDeck){
        this(mainDeck , specialDeck , 5000);
    }

    boolean draw(int count){
        if (mainDeck.size() < count ) return false;
        for(int i =0 ; i < 5 ; i ++){
            if (count >0 && hand[i] == null) {
                hand[i] = mainDeck.deal();
                count--;
            }
        }
        return true;
    }
    void drawSpecialCard(){
        if (nextSpecial == null) nextSpecial = (Special)specialDeck.deal();
    }
    void nextTurnPrep(){
        if (!draw(1)) lifePoints -= 500;
        drawSpecialCard();
    }
    boolean playCardFromHand(int whichCard , Field myField){
        if(hand[whichCard] == null) return false;
        if (hand[whichCard].getClass().getName().equals(MonsterCard.class.getName())) {
            if (myField.addMosnterCard((MonsterCard) hand[whichCard]))
                return true;
            else return false;
        }
        else if (hand[whichCard].getClass().getName().equals(SpellCard.class.getName()))
        {
            if (myField.addSpellCard((SpellCard)hand[whichCard]))
                return true;
            else return false;
        }
        hand[whichCard] = null;
        return true;
    }
    boolean playSpecial(Field myField){
        if (nextSpecial == null) return false;
        nextSpecial.instantEffect(myField , null);
        return false;
    }
    void changeLifePoints(int change){
        lifePoints += change;
    }
    boolean isDefeated(){
        return lifePoints <= 0;
    }
    public CardDeck getMainDeck() {
        return mainDeck;
    }

    public SpecialDeck getSpecialDeck() {
        return specialDeck;
    }

    public Card[] getHand() {
        return hand;
    }

    public Special getNextSpecial() {
        return nextSpecial;
    }

    public int getLifePoints() {
        return lifePoints;
    }

}
