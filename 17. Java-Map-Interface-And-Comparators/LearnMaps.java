import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

class LearnMaps
{
    public static void main(String[] args) 
    {
        Map<String, String> map = new HashMap<>();

        map.put("us", "United States");
        map.put("in", "india");
        map.putIfAbsent("in", "india2");
        map.put("en", "England");

        map.remove("us", "USA");

        System.out.println(map.containsKey("pn"));
        System.out.println("contains value: " + map.containsValue("Indian"));

        System.out.println(map);

        System.out.println(map.get("pn"));
        System.out.println(map.getOrDefault("pn", "Others"));

        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<String> values = map.values();
        System.out.println(values);

        System.out.println("\nMap entiries: ");
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(Map.Entry<String, String> entry: entries)
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}