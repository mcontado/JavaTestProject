package test;

/*
 In [1], there is a clear definition of Hiding Fields:

Within a class, a field that has the same name as a field in the superclass 
hides the superclass's field, even if their types are different. 
Within the subclass, the field in the superclass cannot be referenced by its simple name. 
Instead, the field must be accessed through super. Generally speaking, 
we don't recommend hiding fields as it makes code difficult to read.

From this definition, member fields can not be overridden like methods. 
When a subclass defines a field with the same name, the subclass just declares a new field. 
The field in the superclass is hidden. It is NOT overridden, so it can not be 
accessed polymorphically.

Source: http://www.programcreek.com/2012/11/java-field-overriding/
 * */

class Super {
	String s = "Super";
}
 
class Sub extends Super {
	String s = "Sub";
}
 
public class FieldOverriding {
	public static void main(String[] args) {
		Sub c1 = new Sub();
		System.out.println(c1.s);
		System.out.println(((Super)c1).s);
 
		Super c2 = new Sub();
		System.out.println(c2.s);
		
	}
}