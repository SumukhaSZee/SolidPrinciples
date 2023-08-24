# SOLID PRINCIPLES - An Overview :

1. SINGLE RESPONSIBILITY PRINCIPLE :
   SRP means that a class has only one responsibility and can only have one reason to change.
   Make sure that all the methods of a class are serving for a single responsibility.

3. OPEN CLOSED PRINCIPLE :
   Class should be open for extension but closed for modification.
   If you want to bring any kind of modifications to the existing class then you should extend the parent class and then
   introduce the changes in the child class.

4. LISKOV SUBSTITUTION PRINCIPLE :
   A child class object can completely replace a superclass object without affecting the program.
   If a super class variable is assigned with a base class object still the superclass object
   should be able to access only its properties.
   If you use a child class object instead of the super class object then also the program functionality should
   remain the same if your code satisfies LSP.

5. INTERFACE SEGREGATION PRINCIPLE :
    When we extend an interface normally we have to implement all the methods of the interface.
    But some classes when they extend the interface need not implement all the methods of an interface and only require some methods.
    So instead of having a bulky interface with methods common to most of the classes, Segregate the interface
    into multiple interfaces to make the code cleaner to use.
    This is about ISP principle.

6. DEPENDANCY INVERSION PRINCIPLE :
   Write the code in such a way that classes or objects depend on general or abstract ideas,
   rather than the specific details.
   Dependancy if it exists in code should be dependable on abstract details and not specific details.

The Code Snippets for all the principles are given in this repository.
