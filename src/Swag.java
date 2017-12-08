import java.util.EnumSet;
import java.util.Set;

public class Swag {
	public enum STYLE {
		KIKOU {
			@Override
			public String applyStyle(String txt) {
				String motL = txt.toLowerCase();
				String motU = txt.toUpperCase();
				String mot="";

				for (int i = 0; i < txt.length(); i++) {
					if (i % 2 == 0) {

						mot = mot + motU.substring(i, i + 1);

					} else {
						mot = mot + motL.substring(i, i + 1);
					}
				}
				txt = mot;
				return txt;
				
			}
		}, 
		CROSS {
			@Override
			public String applyStyle(String txt) {
				String mot="";
				for (int i = 0; i < txt.length() - 1; i++) {
					mot = mot + txt.substring(i, i + 1) + "+";
				}
				mot = mot + txt.substring(txt.length() - 1, txt.length());
				
				txt = mot;
				return txt;
				
			}
		};
		
		public abstract String applyStyle(String txt);
	}
/*
	public static final int KIKOU = 1;

	public static final int CROSS = 2;
*/
	public static String swag(String txt, Set<STYLE> style2) {
		// TODO Auto-generated method stub
		//String mot = "";
		
		for (STYLE style : style2)
		txt=style.applyStyle(txt);
		return txt;
		
	}
	
	
	
	public static void main(String[] args) {
		Set<Swag.STYLE> monSet = EnumSet.of(Swag.STYLE.CROSS, Swag.STYLE.KIKOU);
		String s = swag("Miage", monSet);
		System.out.println(s);
	}
}


