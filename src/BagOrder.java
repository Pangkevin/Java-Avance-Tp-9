import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public enum BagOrder{
		NATURAL {
			@Override
			public <T> Map<T, Integer> specifiqueorder() {

				return new TreeMap<T, Integer>();
			}
		},
		INSERT {
			@Override
			public <T> Map<T, Integer> specifiqueorder() {

				return new LinkedHashMap<T, Integer>();

			}
		},
		NONE {
			@Override
			public <T> Map<T, Integer> specifiqueorder() {
				// TODO Auto-generated method stub

				return new HashMap<T, Integer>();
			}
		};
	
		/**
		 *  Specifiqueorder permet de gérer "3 constructeurs" grace au trick de l'implementation
		 *  Le <T> ca permet de declarer le fait qu'on va utiliser un <T>
		 *  Le paramètre, c'est Map<T,Integer> (comme demandé initialement dans le TD)
		 */
		public abstract <T> Map<T, Integer> specifiqueorder();

	}