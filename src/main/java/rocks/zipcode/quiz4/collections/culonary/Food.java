package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    ArrayList<Spice> spices = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
//        HashMap<SpiceType,Integer> ans = new HashMap<>();
//        for (Spice element: spices) {
//            if(!ans.containsKey(element)){
//                ans.put(  element,1);
//            }else{
//                ans.replace(element,ans.get(element)+1);
//            }
//        }
        return null;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
