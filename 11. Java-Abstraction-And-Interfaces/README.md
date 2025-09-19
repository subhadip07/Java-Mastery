<!DOCTYPE html>
<html>
<body>

<h2>In This Lecture</h2>
<ul>
	<li>The abstract keyword</li>
    <li>Abstraction</li>
    <li>Java Interfaces</li>
    <li>Inner class And Nested static classes</li>
    <li>Anonymous Classes</li>
    <li>Functional Interfaces</li>
    <li>Lambda expressions</li>
</ul>

<h2>Java Abstract Class</h2>
<p>The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes). We use the abstract keyword to declare an abstract class.</p>
<ul>
	<li>An abstract class can have both the regular methods and abstract methods.</li>
    <li>A method that doesn't have its body is known as an abstract method.</li>
    <li>Though abstract classes cannot be instantiated, we can create subclasses from it. We can then access members of the abstract class using the object of the subclass.</li>
    <li>If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation in the abstract method.</li>
</ul>

<h2>Java Abstraction</h2>
<p>Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information. This allows us to manage complexity by omitting or hiding details with a simpler, higher-level idea.</p>

<h2>Java Interfaces</h2>
<p>An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).</p>
<p>We use the interface keyword to create an interface in Java.</p>
<p>Like abstract classes, we cannot create objects of interfaces.</p>
<p>To use an interface, other classes must implement it. We use the implements keyword to implement an interface.</p>
<pre>
<code>
interface Language
{
   public void getType();
   
   public void getVerison();
}
</code>
</pre>
<h2>Advantages of Java Interfaces</h2>
<ul>
	<li>Similar to abstract classes, interfaces help us to achieve abstraction in Java.</li>
    <li>Interfaces are also used to achieve multiple inheritance in Java.</li>
    <li>Note: All the methods inside an interface are implicitly public and all fields are implicitly public and all fields are implicitly public static final.</li>
</ul>
<pre>
<code>
interface Line
{
  -
}
</code>
<code>
interface Polygon
{
  -
}
</code>
<code>
class Rectangle implements Line, Polygon
{
  -
}
</code>
</pre>

<h2>Inner classes and Nested Static Class in Java</h2>
<p>A non-static nested class is a class within another class. It has access to members of the enclosing class (outer class). It is commonly known as inner class.</p>
<p>Since the inner class exists within the outer class, you must exists within the outer class, you must instantiate the outer class first, in order to instantiate the inner class.</p>
<p>Unlike inner class, a static nested class cannot access the member variables of the outer class. It is because the static nested class doen't require you to create an instance of the outer class.</p>
<p>Using the nested class makes your code more readable and provide better encapsulation.</p>

<h2>Anonymous Classes in Java</h2>
<p>In Java, a class can contain another class known as nested class. It's possible to create a nested class without giving any name.</p>
<p>A nested class that doesn't have any name is known as an anonymous class.</p>
<p>Anonymous classes usually extend subclasses or implement interfaces. Here, Type can be</p>
<ol>
	<li>A superclass that an anonymous class extends</li>
    <li>An interface that an anonymous class implements</li>
</ol>

<h2>Functional Interfaces</h2>
<p>An interface that contains exactly one abstract method is known as a functional interface.</p>

<p>Functional Interfaces introduced in Java 8 allow us to use a lambda expression to initiate the interface's method and avoid using lengthy codes for the anonymous class implementation.</p>
<pre>
<code>
// interface
@FunctionalInterface
interface Sample{
 // abstract method
 int calculate(int val);
}
</code>
</pre>

<h2>Lambda Expression</h2>
<p>(int x) &rarr; x+1 // Single declared-type argument<br>(int x) &rarr; {return x+1;} // Same as Above<br>(x) &rarr; x+1 // Single inferred-type argument, same as below<br>x &rarr; x+1 // Parenthesis optional for single inferred-type case</p>

<p>(String s) &rarr; s.length() // Single declared-type argument<br>(Thread t) &rarr; {t.start();} // Single declared-type argument<br>s &rarr; s.length() // Single inferred-type argument<br>t &rarr; {t.start();} // Single inferred-type argument</p>

<p>(int x, int y) &rarr; x+y // Multiple declared-type parameters<br>(x, y) &rarr; x+y // Multiple inferred-type parameters</p>

</body>
</html>
