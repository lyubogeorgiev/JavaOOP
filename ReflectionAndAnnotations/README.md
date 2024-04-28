Lab 01 - Reflection
-

Reflection is used to print the this Class name and the super Class name. Object is created by using reflection and the 
instance is printed on the console.

Lab 02 - Getters and Setters
-

Extracted all the Methods in the class in an Array of Method. Then checked which method name starts with "set" and "get". 
Created 2 Maps (TreeMap) with key names and value Method. Printed on the console according to the requirements. 

Lab 03 - High Quality Mistakes
-

Reflection was used to determine if Fields, Getters, and Setters have the right modifiers. If they don't 
have the right access modifier, a message is printed to the console according to the requirements. 

Lab 04 - Create Annotations
-

Created annotation called Subject. Annotated it with @Target(ElementType.TYPE) to specify it can be used only on Class type. 
Also added another annotation @Retention(RetentionPolicy.RUNTIME) which indicates that the annotation we created will be 
available at Runtime. 

Lab 05 - Coding Tracker
-

Created Annotation Author with a String element called name. The annotation can be used only on methods and also is available 
at Runtime. Created a class Tracker which have methods with Author annotation and print methods by author according to the 
requirements. 

Exercise 01 - Harvesting Fields
-

A Map with String as a key and List<Field> as value was created to store all the required fields by access modifier. Once 
all the fields are stored, when a condition was received from the console, the requested fields by access modifier are 
printed on the console according to the requirements. 

Exercise 02 - Black Box Integer 
-

Constructor is extracted from the class and is used to create a new Instance as the Constructor is private. Private methods 
and fields are also extracted from the class and are used with reflection on the object to change values and print field values.