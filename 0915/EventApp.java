//1. Feladat - osztaly letrehozasa
class Event {
	private String name;
	private String description;
	private String day;
	private int hour;
	
	//2. Feladat - konstuktorok
	public Event(String name, String day) {
		this.name = name;
		this.day = day;
	}
	
	public Event(String name, String description, String day) {
	this.name = name;
	this.description = description;
	this.day = day;
	}
	
	public Event(String name, String description, String day, int hour) {
		this.name = name;
		this.description = description;
		this.day = day;
		this.hour = hour;
	}
	
	//3. Feladat - getterek / setterek
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getDay() {
		return day;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	//7. Feladat - kiiratas egyszerusitese a toString segitsegevel
	@Override
	public String toString() {
		return "Esemeny neve: " + name + " | Leiras: " + (description != null ? description : "Nincs megadva") + " | Idopont: " + day + " " + hour + ":00";
	}
}

//5. Feladat - EventApp osztaly main metodussal
public class EventApp {
	public static void main(String[] args) {
		//4. Feladat - esemenyek letrehozasa es kiiratasa
		Event event1 = new Event("Vacsora", "Csaladi osszejovetel", "Csutortok", 18);
		Event event2 = new Event("Asztalitenisz", "Edzomeccs", "Kedd", 14);
		
		System.out.println("4. Feladat - nehany esemeny letrehozasa:");
		System.out.println("1. " + event1.getName() + " - " + event1.getDescription() + " - " + event1.getDay() + " - " + event1.getHour() + ":00");
		System.out.println("2. " + event2.getName() + " - " + event2.getDescription() + " - " + event2.getDay() + " - " + event2.getHour() + ":00");
		System.out.println("\n");
		
		//6. Feladat - peldanyositas a megirt konstruktorokkal
		//2 parameteres konstruktor
		Event event3 = new Event("Java ZH", "Kedd");
		System.out.println("6. Feladat - konstruktorok hasznalata:");
		System.out.println("2 elemu konstruktorral: " + event3.getName() + " - " + event3.getDay());
		
		//3 parameteres konstruktor
		Event event4 = new Event("Mozi est", "Horror", "Szerda");
		System.out.println("3 elemu konstruktorral: " + event4.getName() + " - " + event4.getDescription() + " - " + event4.getDay());
		System.out.println("\n");
		
		//7. Feladat - egyszerubb kiiras
		System.out.println("7. Feladat - egyszerubb kiiras:");
		System.out.println(event1);
		System.out.println(event2);
		System.out.println(event3);
		System.out.println(event4);
	}
}
