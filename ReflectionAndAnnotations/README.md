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