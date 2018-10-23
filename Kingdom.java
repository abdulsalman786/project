//Package Importing
package Animal;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
//Class Declaration
class Kingdom {
	//Static variable declaration
	static int count=0,c=0;
	int deer=0,wolf=0,lion=0,tiger=0;
	String[] l=new String[10];
	//Default constructor
Kingdom()
{
	deer=5;
	count+=5;
}	
//Parameterized Constructor 
Kingdom(int lion,int wolf)
{
	this.lion=lion;
	this.wolf=wolf;
	count=count+wolf+lion;
}
Kingdom(int a)
{
	tiger=a;
	count+=a;
}
//Copy Constructor
Kingdom(Kingdom obj)
{
	lion=obj.lion;
	wolf=obj.wolf;
	count+=lion+wolf;
}
//Static method
static 
{
	System.out.println("Humans are noted for their intelligence\n");	
}
void dis()
{
System.out.println("Enter 5 animals:");	
}
void display1()
{
	System.out.println("Total animals:"+count);
}
//Non-access specifier
final void display2()
{
	System.out.println("\nLion:"+lion+"\nTiger:"+tiger+"\nWolf:"+wolf+"\nDeer:"+deer+"\n");	
}
//Access specifier
private void display3()
{
	System.out.println("They are at ultimate level of intelligence\n");
}
	public static void main(String[] args)
	{
		int a,b,l,i,c,k;
		//Object Declaration
		Kingdom objects=new Kingdom();
		objects.display3();
		Organism pack=new Organism();
		pack.disp();
		Scanner object=new Scanner(System.in);
		System.out.println("Enter no. of animals:");
		//Get value
		k=object.nextInt();
		System.out.println("Name "+k+" animals:");
		//Array Declaration22
		String[] array=new String[20];
		for(i=0;i<k;i++)
		{
			array[i]=object.next();
		}
		for(i=0;i<k;i++)
		{
			l=i+1;
			System.out.println("\nAnimal "+l+":"+array[i]);
		}
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of tigers:");
		a=s.nextInt();
		System.out.println("Enter number of lions and wolves:");
		b=s.nextInt();
		c=s.nextInt();
		//Object Declaration
		Kingdom obj=new Kingdom();
		Kingdom obj1=new Kingdom(a);
		Kingdom obj2=new Kingdom(b,c);
		Kingdom obj3=new Kingdom(obj2);	
		System.out.println("\nIn first habitat:");
		obj.display2();
		System.out.println("\nIn Second habitat:");
		obj1.display2();
		System.out.println("\nIn third habitat:");
		obj2.display2();
		System.out.println("\nIn fourth habitat:");
		obj3.display2();
		Phyllum d=new Phyllum();
		d.play();
		Fauna n=new Fauna();
		n.dis();
		Canis c1=Canis.Dog;
		System.out.println(c1);
		Two t=new Two();
		//t.displ();
		t.twoSpecies();
		t.twoSpecies("Dog family is Canidae");
		Str p=new Str();
		p.stringclass();
		Animals an=new Animals();
		an.getanimal();
		plants pq=new plants();
		pq.getp();
//Arrays of objects
		Kind objt[]=new Kind[3];
		for(i=0;i<3;i++)
		objt[i]=new Kind();
		objt[0].getl("plants");
		objt[1].getl("animals");
		objt[2].getl("birds");
		objt[0].put("plants");
		objt[1].put("animals");		
		objt[2].put("birds");
	}
}
class Phyllum
{  
void play()
{  
	System.out.println("Phyllum is a level of classification or taxanomic rank below Kingdom and above Class");					
}
}
//Override and Inheritance
class Fauna extends Kingdom
{
void dis(){
	super.dis();
	Scanner o=new Scanner(System.in);
		for(int i=0;i<5;i++)
		l[i]=o.next();
for(int i=0;i<5;i++)
{int p=i+1;
System.out.println("Animal "+p+':'+l[i]);	
}
}
}
//String class
class Str
{
	String s=new String("Dog");
	String s1=new String("dog");
	void stringclass()
	{
	if(s.equalsIgnoreCase(s1))
		{
		System.out.println("Dog and dog are equal");	
		}
	else
	{
	System.out.println("s1 and string'tiger' are equal");	
    }
	int k=s.length();
	System.out.println("Length of dog is "+k);	
	}
	}
//Enumeration
enum Canis
	{
		Dog,Wolf;	
	}
//Interface
interface Flora
{
	void get();
	void print();
}
class Flora1 implements Flora
{
	String k[]=new String[5];
public void get()
{
	Scanner f=new Scanner(System.in);
	for(int i=0;i<5;i++)
		k[i]=f.next();
}
public void print()
{
	for(int i=0;i<5;i++)
	System.out.println("Plant"+i);
}
}
//abstract class and method
abstract class Sum
{
abstract void twoSpecies();
abstract void twoSpecies(String name);
}
//Method overloading and final class
final class Two extends Sum
{
	void twoSpecies()
	{
	System.out.println("Dog class is Mammalia");
	}	
	void twoSpecies(String name)
	{
		
		System.out.println(name);
	}
}
//ArrayClass and enhanced for loop
class Animals
{
int[] a=new int[10];
void getanimal() {	
	System.out.println("Enter the animals' height:");
	Scanner oh=new Scanner(System.in);
	for(int i=0;i<10;i++) 
	{
		a[i]=oh.nextInt();
    }
    Arrays.sort(a);
    for(int i:a)
    {
    	System.out.println(i);
    }
}
}
//Arrays List
class plants
{
	ArrayList<String>p=new ArrayList<String>(5);
void getp()
{
	p.add("Cotton");
	p.add("Neem");
	p.add("Coconut");
	p.add("Banyan");
	p.remove("Coconut");
	System.out.println(p);
}
}
class Kind
{
	String[] a=new String[10];
	void getl(String n)
	{
		System.out.println("Enter 5 "+n);
		Scanner l=new Scanner(System.in);
		for(int i=0;i<5;i++)
		a[i]=l.next();
}
	void put(String n)
	{
		System.out.println("Entered 5 "+n);
		for(int i=0;i<5;i++)
		{
			int p;
			p=i+1;
			System.out.println(p+":"+a[i]);
		}
		System.out.println("");
	}
}