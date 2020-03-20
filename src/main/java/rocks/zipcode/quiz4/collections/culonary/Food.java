package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food  <SpiceType extends Class<? extends Spice>>{

    ArrayList<Spice> spices = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        HashMap<SpiceType, Integer> ans = new HashMap<>();
        for (Spice element: spices) {
            if(!ans.containsKey((SpiceType)element.getClass())){
                ans.put((SpiceType) element.getClass(),1);
            }else{
                ans.replace((SpiceType) element.getClass(),ans.get((SpiceType) element.getClass())+1);
            }
        }
        return  ans;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
