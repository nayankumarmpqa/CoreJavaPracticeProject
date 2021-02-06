package javaBySSS;

class ConstructorResdingClass 
{ 
    int num; 
    String name; 
  
    // this would be invoked while an object 
    // of that class is created. 
    ConstructorResdingClass() 
    { 
        System.out.println("Constructor called"); 
    } 
} 


public class No_argument_constructor {

	  public static void main (String[] args) 
	    { 
	        // this would invoke default constructor. 
		  ConstructorResdingClass ObjectofConstructorResdingClass = new ConstructorResdingClass(); 
	  
	        // Default constructor provides the default 
	        // values to the object like 0, null 
	        System.out.println(ObjectofConstructorResdingClass.name); 
	        System.out.println(ObjectofConstructorResdingClass.num); 
	    } 
	} 


/*
	Output :

Constructor called
null
0

*/