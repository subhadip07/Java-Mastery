<!DOCTYPE html>
<html>
<head>
<title>Java-Encapsulation</title>
</head>
<body>

<h2>In This Module</h2>
<ol>
	<li>Java Packages</li>
    <li>Access modifiers</li>
    <li>Java Encapsulation</li>
    <li>Data Hiding</li>
    <li>The static keyword</li>
</ol>

<h2>Java Packages</h2>
<p>A package is simply a container that groups related types (Java classes, interfaces, enumerations, and annotations).</p>

<p>To define a package in Java, you use the keyword package. Java uses file system directories to store packages.</p>
<p>For example:</p>
<pre>
<code>
package com.test;
class Test
{
  public static void main(String[] args)
  {
    System.out.println("Hello World!");
  }
}
</code>
</pre>

<h2>Importing a Package</h2>
<ul>
	<li>Java has an import statement that allows you to import an entire package (as in earlier example), or use only certain classes and interfaces defined in the package.</li>
<pre>
<code>
import java.util.Date;  // imports only Date class
import java.io.*;  // imports everything inside java.io package
</code>
</pre>

	<li>In Java, the import statement is written directly after the package statement (if it exists) and before the class definition.</li>
<pre>
<code>
package package.name;
import package.ClassName;  // only import a Class
class MyClass
{
  // body
}
</code>
</pre>
</ul>

<h2>Java Access Modifiers</h2>
<p>In Java, access modifiers are used to set the accessibility (visibility) of classes, interfaces, variables, methods, constructors, data members, and the setter methods. For example,</p>
<pre>
<code>
class Animal
{
  public void method1() {...}
  
  private void method2() {...}
}
</code>
</pre>

<h2>Types of Access Modifiers</h2>
<table>
	<tr>
    	<th>Access Modifier</th>
    	<th>Same class</th>
    	<th>Same package subclass</th>
        <th>Same package non-subclass</th>
        <th>Different Package subclass</th>
        <th>Different package non-subclass</th>
    </tr>
    
    <tr>
    	<td>Default</td>
    	<td>Yes</td>
    	<td>Yes</td>
        <td>Yes</td>
    	<td>No</td>
    	<td>No</td>
  	</tr>
    
    <tr>
    	<td>Private</td>
    	<td>Yes</td>
    	<td>No</td>
        <td>No</td>
    	<td>No</td>
    	<td>No</td>
  	</tr>
    
    <tr>
    	<td>Protected</td>
    	<td>Yes</td>
    	<td>Yes</td>
        <td>Yes</td>
    	<td>Yes</td>
    	<td>No</td>
  	</tr>
    
    <tr>
    	<td>Public</td>
    	<td>Yes</td>
    	<td>Yes</td>
        <td>Yes</td>
    	<td>Yes</td>
    	<td>Yes</td>
  	</tr>
</table>

<h2>Java Encapsulation</h2>
<p>Encapsulation refers to the bundling of fields and methods inside a single class. It prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.</p>

<h2>Data Hiding</h2>
<p>Data hiding is a way of restricting the access of our data members by hiding the implementation details. Encapsulation also provides a way for data hiding.</p>
<p>We can use access modifiers to achieve data hiding.</p>
<p><b>Note:</b> People often consider encapsulation as data hiding, but that's not entirely true. Encapsulation refers to the bundling of related fields and methods together. This can be used to achieve data hiding. Encapsulation in itself is not data hiding.</p>

<h2>The static keyword</h2>
<p><b>Static Variables</b></p>
<ul>
	<li>Only a single copy of the static variable is created and shared among all the instances of the class.</li>
    <li>Because it is a class-level variable, memory allocation of such variables only happens once when the class is loaded in the memory.</li>
    <li>If an object modifies the value of a static variable, the change is reflected across all objects.</li>
    <li>Static variables can be used in any type of method: static or non-static.</li>
    <li>Non-static variables cannot be used inside static methods. It will throw a compile-time error.</li>
</ul>
<p>If we want to access class members without creating an instance of the class, we need to declare the class members static.</p>
<p>Static variables can be accessed by calling the class name of the class. There is no need to create an instance of the class for accessing the static variables because static variables are the class variables and are shared among all the class instances.</p>

<p><b>Static Methods</b></p>
<ul>
	<li>The static members and methods belong to the class rather than the instance of the class. When the implementation of the particular method is not dependent on the instance variables and instance methods, In this case, we can make that method to be static.</li>
    <li>They are accessed by the name of the class.</li>
    <li>The keywords such as this and super are not used in the body of the static method.</li>
    <li>The modification of the static field value is not allowed.</li>
</ul>

</body>
</html>
