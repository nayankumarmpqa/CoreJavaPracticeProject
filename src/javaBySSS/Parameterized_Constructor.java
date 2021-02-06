package javaBySSS;



class ConstructorResdingClass1 
{ 
    // data members of the class. 
    String name; 
    int id; 
  
    // constructor would initialize data members 
    // with the values of passed arguments while 
    // object of that class created. 
    ConstructorResdingClass1(String name, int id) 
    { 
        this.name = name; 
        this.id = id; 
    } 
} 
  



public class Parameterized_Constructor {

	 public static void main (String[] args) 
	    { 
	        // this would invoke the parameterized constructor. 
		 ConstructorResdingClass1 ConstructorResdingClass1Object = new ConstructorResdingClass1("adam", 1); 
	        System.out.println("ConstructorResdingClass1 Name :" + ConstructorResdingClass1Object.name + 
	                           " and ConstructorResdingClass1 Id :" + ConstructorResdingClass1Object.id); 
	    } 
	} 


/*
 * Output: 
 *
 *ConstructorResdingClass1 Name :adam and ConstructorResdingClass1 Id :1
 * 
 * 
 * /
 */