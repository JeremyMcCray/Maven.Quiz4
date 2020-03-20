package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    String[] words ;

    public WordCounter(String... strings) {
        this.words=strings;
    }

    public Map<String, Integer> getWordCountMap() {
        HashMap<String,Integer> ans = new HashMap<>();
        for (String elem: this.words) {
            if(!ans.containsKey(elem)){
                ans.put(elem,1);
            } else{
                ans.replace(elem,ans.get(elem)+1);
            }
        }
        return ans;
    }
}
