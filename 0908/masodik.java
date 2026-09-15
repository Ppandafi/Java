class StringArrayTest {
	static String word = new String("apple");
	static String day = "Monday";
	
	public static void main(String [] args) {
		
		System.out.println(word);
		System.out.println(day);
		
		String dayTwo = new String("Monday");
	
		//stringek osszehasonlitasa
		boolean egyenlo = day.equals(dayTwo);
		System.out.println(egyenlo);
		
		//abc sorrend Negativ elobb van az abc-ben, pozitiv kesobb
		int sorrend = day.compareTo(word);
		int sorrendKetto = word.compareTo(day);
		System.out.println(sorrend);
		System.out.println(sorrendKetto);
		
		//hozzaadas stringhez + hashcode kiirasa
		System.out.println("Day hashCode: "+day.hashCode());
		day = day + " Tuesday";
		System.out.println("Day hashCode: "+day.hashCode());
		
		//kisbetu nagybetu konverzio
		String kisBetus = word.toLowerCase();
		System.out.println(kisBetus);
		
		String nagyBetus = word.toUpperCase();
		System.out.println(nagyBetus);
		
		//Milyen karakter van a 4. helyen (0-tól indexelődik)
		System.out.println("Char at: "+word.charAt(3));
		
		//Karakter helyének megkeresése
		System.out.println("Index of: "+word.indexOf("a"));
		
		//teljes szó (string) keresese
		System.out.println("Index of string:"+word.indexOf("pple"));
		
		//valueOf string
		double pi = 3.14;
		System.out.println(String.valueOf(pi));
		
		//objektum
		String[] napok = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for (int i = 0; i <napok.length; i++) {
			System.out.println(napok[i]);
		}
		
		//nagybetus kiiratas
		for (int j = 0; j< napok.length; j++) {
			System.out.println(napok[j].toUpperCase());
		}
		
	}
}