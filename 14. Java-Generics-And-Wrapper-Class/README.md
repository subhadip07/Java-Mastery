<!DOCTYPE html>
<html>
<head>

</head>

<body>
<h2>In This Module</h2>
<ol>
	<li>Wrapper Classes</li>
    <li>Autoboxing And Un-boxing</li>
    <li>Generics</li>
    <li>Bounded Generics</li>
</ol>

<h2>Wrapper Classes</h2>
<p>A Wrapper class is Java is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types.</p>

<table>
	<tr>
    	<th>Primitive Data Type</th>
    	<th>Wrapper class</th>
	</tr>
	<tr>
    	<td>char</td>
    	<td>Character</td>
  	</tr>
  	<tr>
    	<td>byte</td>
    	<td>Byte</td>
  	</tr>
    <tr>
    	<td>short</td>
    	<td>Short</td>
  	</tr>
    <tr>
    	<td>int</td>
    	<td>Integer</td>
  	</tr>
    <tr>
    	<td>long</td>
    	<td>Long</td>
  	</tr>
    <tr>
    	<td>float</td>
    	<td>Float</td>
  	</tr>
    <tr>
    	<td>double</td>
    	<td>Double</td>
  	</tr>
    <tr>
    	<td>boolean</td>
    	<td>Boolean</td>
  	</tr>
</table>

<h2>Need of Wrapper Classes</h2>
<ol>
	<li>The classes in java.util package handles only objects and hence wrapper classes help in this case also.</li>
    <li>Data structures in the Collection framework, such as ArrayList and Vector, store only-objects (reference types) and not primitive types.</li>
    <li>An object is needed to support synchronization in multi-threading.</li>
</ol>

<h2>Autoboxing and Unboxing</h2>
<p>The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example - conversion of int to Integer, long to Long, double to Double, etc.</p>

<p>It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example - conversion of Integer to int, Long to long, Double to double, etc.</p>

<h2>Generics</h2>
<p>Generics means parameterized types. Using Generics, it is possible to create classes that work with different data types, An entity such as class, interface, or method that operates on a parameterized type is a generic entity.</p>

// create a generics class <br>
class GenericsClass<'T'> <br>
{ <br>
	// variable of T type <br>
    private T data; <br>
    
    public GenericsClass(T data) <br>
    { <br>
    	this.data = data; <br>
    } <br>
    
    // method that return T type varible <br>
    public T getData() <br>
    { <br>
    	return this.data; <br>
    } <br> 
} <br>

<h2>Java Generics Method</h2>
<p>Similar to the generics class, we can also create a method that can be used with any type of data. Such a class is known as Generics Method.</p>

public <'T'> void genericMethod(T data) {..}

<p>Here, the type parameter <'T'> is inserted after the modifier public and before the return type void.</p>
<p>We can call the generics method by placing the actual type <'String'> and <'Integer'> inside the bracket before the method name.</p>

demo.genericMethod("Java");
demo.genericMethod(25);

<h2>Bounded Generic Types</h2>
<p>In general, the type parameter can accept any data types (except primitive types). However, if we want to use generics for some specific types (such as accept data of number types) only, then we can use bounded types. In the case of bound types, we use the extends keyword.</p>
<p>Here, GenericsClass is created with bounded type. This means GenericsClass can only work with data types that are children of Number (Integer, Double, and so on).</p>

</br>class GenericsClass <'T' extends Number>
</br>{
	</br>public void display()
    </br>{
    	</br>System.out.println("This is a bounded type generics class.")
    </br>}
</br>}
</body>
</html>
