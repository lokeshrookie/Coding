import java.util.*;

public class TillTen {

    /**
     *             For every string in the string array,
     *             check if sorted version of that string is present in hashmap,
     *             if yes, then add unsorted string to the hasmhap.
     *             else, add this add this string as value to the sorted string in the hashmap.
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String sortedString = new String(array);
            if(map.containsKey(sortedString)){
                // if the key is present, then we need to add this s to the list.
                // first get the list.then add s to it.
                List<String> list = map.get(sortedString);
                list.add(s);
                map.put(sortedString, list);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(sortedString, list);
            }
        }
        return new ArrayList<>(map.values());
    }

}
