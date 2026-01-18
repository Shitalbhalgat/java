// Encapsulation  :1)means combining data and the functions that work on that data into a single unit, 
//                 like a class. 
//                2)This mechanism is also known as data hiding because it restricts direct access 
//                  to the internal state of an object from outside the class,
//                  protecting data integrity and promoting modularity. 
//                3)In Object-Oriented Programming, it helps keep things organized and secure
// 
// How to Achieve Encapsulation in Java:The primary way to implement encapsulation is through
//                                       the use of access modifiers and special methods
//                                       known as "getters" and "setters". 
// 
// Declare variables as private: This makes the class's data inaccessible directly from any other class,
//                               ensuring   that the internal state can only be accessed 
//                               or modified within its own class.
// Provide public getter and setter methods: These public methods are the controlled access points 
//                                           to the private variables.
// Getter methods (get...) retrieve the value of a private variable.
// Setter methods (set...) allow controlled modification of the variable's value, 
// often with validation logic to ensure the data remains valid (e.g., ensuring an age is a positive number). 