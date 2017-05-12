/**
 * Created by Amir on 5/12/2017.
 */
public class BlueEyesWhiteDragon extends MonsterCard implements Special {
    public BlueEyesWhiteDragon(){
        super("Blue Eyes White Dragon" , "The best card" , 3000 , true);
    }
    @Override
    public void instantEffect(Field owner , Field enemy){
        owner.addMosnterCard(new BlueEyesWhiteDragon());
        owner.addMosnterCard(new BlueEyesWhiteDragon());
    }
}
