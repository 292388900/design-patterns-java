import java.util.HashMap;
import java.util.Map;

class Menu {
    public Map<String, CoffeeFlavour> coffeeFlavours = new HashMap<String, CoffeeFlavour>();

    public CoffeeFlavour lookup(String flavorName) {
        if (!coffeeFlavours.containsKey(flavorName)) {
            coffeeFlavours.put(flavorName, new CoffeeFlavour(flavorName));
        }

        return coffeeFlavours.get(flavorName);
    }
}
