package mypack;

public class A {
int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=new String("java");

s1=s1.concat("selenium");
String s2="java";
String s3=s2;
String s4=s3+"selenium";
String s5="javaselenium";
String s6=s5;
System.out.println(s4==s5);
System.out.println(s5==s6);
System.out.println(s4==s5);
System.out.println(s5);
System.out.println(s1);

String a="appleof ";
a=a.trim().toLowerCase();
System.out.println(a.lastIndexOf("leof"));
	}

}
