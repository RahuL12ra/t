package mypack;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="HI BYEH WELCOME      RAHUL     ";
System.out.println(a.substring(3));
System.out.println(a.indexOf('H'));
System.out.println(a.indexOf('H',3));
System.out.println(a.indexOf("YE",3));
System.out.println(a.indexOf("YE"));
System.out.println(a.startsWith("WELCOME", 8));
System.out.println(a.indexOf('R'));
System.out.println(a.indexOf('H',3));
System.out.println(a.indexOf('H'));
System.out.println(a.lastIndexOf('E'));
System.out.println(a.lastIndexOf("RAHU"));
System.out.println(a.lastIndexOf('H',7));
System.out.println(a.replace('H', 'R'));
System.out.println(a.replaceAll("H" ,"E"));
System.out.println("NNN",true);

a.trim().toLowerCase();
System.out.println(a.trim());
	}

}
