import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Bag<T> {

	private final Map<T, Integer> mapMap;

	
	/**
	 * Constructeur par defaut, de base on appelle avec BagOrder = NONE
	 * @param bagOrder
	 */
	public Bag() {
		this(BagOrder.NONE);

	}
	
	/**
	 * Constructeur avec le choix de l'ordre grace à ENUM
	 * C'est l'enum BagOrder qui gère les types paramétrés !!!
	 * @param bagOrder
	 */
	public Bag(BagOrder bagOrder) { 
		this.mapMap = bagOrder.specifiqueorder();
	}


	/**
	 * 
	 * @param unT
	 */
	public void add(T unT) {
		if (mapMap.containsKey(unT)) {
			mapMap.put(unT, mapMap.get(unT) + 1);
		} else {
			mapMap.put(unT, 1);
		}
	}
	
	/**
	 * 
	 * @param unT
	 * @return
	 */
	public int count(T unT) {
		// trick du aux test et à la méthode get (de base,si on ne trouve aps, on renvoie null)
		// Dans notre cas, on renvoie 0
		if(mapMap.get(unT) == null) {
			return 0;
		}
		return mapMap.get(unT);
	}
	
	/**
	 * remove permet de supprimer unT
	 * @param unT
	 */
	public void remove(T unT) {
		if (!(mapMap.containsKey(unT)))
			throw new IllegalArgumentException("On ne peut pas supprimer un objet qui n'existe pas");

		// SI on a plusieurs occurences, alors on décremente, sinon, on retire de la map
		if (mapMap.get(unT) > 1) {
			mapMap.replace(unT, mapMap.get(unT) - 1);
		} else {
			mapMap.remove(unT);

		}

	}
	/**
	 * Création de l'iterator,
	 * Iterator<Map.Entry<T,Integer>> iterator() donné par le prof
	 * 
	 * @return
	 */
	public Iterator<Map.Entry<T, Integer>> iterator() {
		Iterator<Entry<T, Integer>> iter = this.mapMap.entrySet().iterator();
		return iter;
	};

}
