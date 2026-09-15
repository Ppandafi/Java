/**
*Tobb soros komment
Futtatas:
cmd -> megkeresni a mappat, ahol a file van: cd...
file fordítasa: javac *filenev*
java osztaly neve

itt:
javac helloworld.java
java HelloWorldApp
*/
class HelloWorldApp{
	public static void main(String[] args){
		System.out.println("Hello World!");
		
		//Változo dekalralasa és kiiratasa
		int gears = 5;
		System.out.print("Bicikli valtok szama: ");
		System.out.println(gears);
		
		//Numetikus valtozok abrazolasa
		int maxValue = Integer.MAX_VALUE;
		System.out.println("Integer maximum erteke: "+maxValue);
		
		float maxFloat = Float.MAX_VALUE;
		System.out.println("Float maximum erteke: "+maxFloat);
		
		double maxDouble = Double.MAX_VALUE;
		System.out.println("Double maximum erteke: "+maxDouble);
		
		int minValue = Integer.MIN_VALUE;
		System.out.println("Integer minimum erteke: "+minValue);
		
		float minFloat = Float.MIN_VALUE;
		System.out.println("Float minimum erteke: "+minFloat);
		
		double minDouble = Double.MIN_VALUE;
		System.out.println("Double minimum erteke: "+minDouble);
		
		//Valtozo konverziok
		//double -> int
		double pi = 3.14;
		System.out.println("Pi erteke: "+pi);
		int piInteger = (int) pi;
		System.out.println("Pi integer erteke: "+piInteger);
		
		//int -> double
		int myInt = 3;
		System.out.println("Int erteke: "+myInt);
		double myDouble = (double) myInt;
		System.out.println("Double erteke: "+myDouble);
		
		//Muveletek
		//modulo osztas
		int moduloOsztas = 12 % 5; //az osztas maradekat adja meg
		System.out.println("Modulo osztas erteke: "+moduloOsztas);
		
		//szorzas
		int szorzas = 56 * 65;
		System.out.println("A szorzas eredmenye: "+szorzas);
		
		//boolean
		boolean logikaiValtozo = true;
		boolean logikaiValtozoKetto = false;
		boolean esMuvelet = logikaiValtozo && logikaiValtozoKetto; //logikai ES kapu eredmenye
		System.out.println("Es muvelet erteke: "+esMuvelet);
		
		//for ciklus
		int eredmeny = 0;
		for (int i = 1; i <= 10; ++i) {
			eredmeny = eredmeny + i;
			if (i == 4) break; //MODOSITAS: a cilkus i=4nel kilep
		}
		System.out.println("For ciklus eredmenye: "+eredmeny);
		
		//Szamok osszeadasa 1-tol 10-ig, de csak a paros / paratlan szamokat adja ossze
		int eredmenyKetto = 0;
		for (int i = 1; i <= 10; ++i) {
			if (i % 2 ==0) eredmenyKetto = eredmenyKetto + i;
		}
		System.out.println("For ciklus eredmenye (if-fel bovitve): "+eredmenyKetto);
		
		//while ciklus
		int i = 1;
		int eredmenyHarom = 0;
		while(i <= 10) {
			eredmenyHarom = eredmenyHarom + i;
			i++;
			if (i == 4) break; //MODOSITAS: a cilkus i=4nel kilep
		}
		System.out.println("While ciklus eredmenye: "+eredmenyHarom);
		
		//switch - case -> ha egy break lemarad akkor a kovetkezo breakig fut
		int hetNapja = 1;
		switch (hetNapja) {
			case 1: System.out.println("Hetfo"); break;
			case 2: System.out.println("Kedd"); break;
			case 3: System.out.println("Szerda"); break;
			case 4: System.out.println("Csutortok"); break;
			case 5: System.out.println("Pentek"); break;
			case 6: System.out.println("Szombat"); break;
			case 7: System.out.println("Vasarnap"); break;
			default: System.out.println("Ez nem a het napja"); break;
		}
		
		//switch beagyazasa egy for ciklusba
		System.out.println("Switch for ciklusba agyazva:");
		int hetNapjai = 1;
		for (int j =1; j <= 7; j++) {
			hetNapjai = j;
			switch (hetNapjai) {
				case 1: System.out.println("Hetfo"); break;
				case 2: System.out.println("Kedd"); break;
				case 3: System.out.println("Szerda"); break;
				case 4: System.out.println("Csutortok"); break;
				case 5: System.out.println("Pentek"); break;
				case 6: System.out.println("Szombat"); break;
				case 7: System.out.println("Vasarnap"); break;
				default: System.out.println("Ez nem a het napja"); break;
			}
		}
		
		//print es println kulonbsegei
		System.out.print("Mondat elso resze "+hetNapjai+" ");
		System.out.println("Mondat masodik resze");
		
		//double valtozo kiiratasa
		double kiirat = 3.14156;
		System.out.printf("%.3f%n", kiirat); //3 tizedes jegyre kerekitve irja ki
		
		//tombok
		int[] tomb = new int[10]; //10 hosszusagu tomb inicializalasa
		System.out.println("A tomb elemei:");
		for (int k = 0; k < tomb.length; k++) {
			tomb[k] = k;
			System.out.print(tomb[k]+" ");
		}
		
		//A tomb elemeinek kiirasa visszafele
		System.out.println("\nA tomb elemei visszafele:");
		for (int l = tomb.length -1; l >= 0; l--) {
			System.out.print(tomb[l]+" ");
		}
	}
}
