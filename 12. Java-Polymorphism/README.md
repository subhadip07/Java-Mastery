<!DOCTYPE html>
<html>
<body>

<h2>Java Heap Memory</h2>
<p>Java Heap space is used by java runtime to allocate memory to Objects and JRE classes. Whenever we create an object, it's always created in the Heap space.</p>
<p>Any object created in the heap space has global access and can be referenced from anywhere of the application.</p>

<h2>Java Stack Memory</h2>
<p>Java Stack memory contains method-specific values that are short-lived and references to other objects in the heap that is getting referred from the method.</p>
<p>Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method. As soon as the method ends, the block becomes unused and becomes available for the next method. Stack memory size is very less compared to Heap memory.</p>

<h2>Java Object Class</h2>
<p>Object class is present in java.lang package. Every class is Java is directly or indirectly derived from the Object class. If a class does not extend any other class then it is a direct child class of Object and if extends another class then it is indirectly derived. Therefore the Object class methods are available to all Java classes. Hence Object class acts as a root of the inheritance hierarchy in any Java Program.</p>

<h2>Java Polymorphism</h2>
<p>Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations. The word "poly" means many and "morphs" means forms, So it means many forms. There are two types of Polymorphisms.</p>
<ul>
	<li>Compile-time Polymorphism</li>
    <li>Runtime Polymorphism</li>
</ul>

</body>
</html>
