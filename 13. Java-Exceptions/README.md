<!DOCTYPE html>
<html>
<body>

<h2>In This Module</h2>
<ol>
	<li>Java Exceptions</li>
    <li>Java Exception Handling</li>
    <li>try...catch block</li>
    <li>finally block</li>
    <li>throw and throws keyword</li>
</ol>

<h2>Java Exceptions</h2>
<p>An exception is an unexpected event that occurs during program execution. It affects the flow of the program instructions which can cause the program to terminate abnormally.</p>

<p>An exception can occur for many reasons. Some of them are:</p>
<ul>
	<li>Invalid user input</li>
    <li>Device failure</li>
    <li>Loss of network connection</li>
    <li>Physical limitations (Out of disk memory)</li>
    <li>Code errors</li>
    <li>Opening an unavailable file</li>
</ul>

<h2>Java Runtime Exceptions</h2>
<p>A runtime exception happens due to a programming error. They are also known as unchecked exceptions.</p>

<p>These exceptions are not checked at compile-time but run-time. Some of the common runtime exceptions are: </p>
<ul>
	<li>Null pointer access (missing the initialization of a version) - NullPointerException</li>
    <li>Out-of-bounds array access - ArrayIndexOutOfBoundsException</li>
    <li>Dividing a number by 0 - ArithmeticException</li>
</ul>

<p>You can think about it in this way. "If it is a runtime exception, it is your fault".</p>

<h2>Java IOException Exceptions</h2>
<p>An IOException is also known as a checked exception. They are checked by the compiler at the compile-time and the programmer is prompted to handle these exceptions.</p>

<p>Some of the examples of checked exceptions are: </p>
<ul>
	<li>Trying to open a file that doesn't exist results in FileNotFoundException</li>
    <li>Trying to read past the end of a file</li>
</ul>

<h2>try-catch block</h2>
<p>The try...catch block in Java is used to handle exceptions and prevents the abnormal termination of the program.</p>
<p><b>Code: </b></p>
<pre>
<code>
try
{
  // code
}
catch (exception)
{
  // code
}
</code>
</pre>

<h2>try-catch-finally block</h2>
<p>In Java, we can also use the finally block after the try...catch block.</p>

<p>In this case, the finally block is always executed whether there is an exception inside the try block or not.</p>

<p>It is good practice to use finally block to include important cleanup code like closing a file or connection.</p>

<p><b>Note: </b>There are some cases when a finally block does not execute: </p>
<ul>
	<li>Use of System.exit() method</li>
    <li>An exception occurs in the finally block</li>
    <li>The death of a thread</li>
</ul>

<h2>Java throw and throws</h2>
<p>We use the throws keyword in the method declaration to declare the type of exceptions that might occur within it.</p>

<pre>
<code>
import java.io.*;
class Main
{
    public static void findFile() throws IOException
    {
    	// code that may produce IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}
</code>
</pre>

<p>The throw keyword is used to explicitly throw a single exception.</p>
<pre>
<code>
class Main
{
   public static void divideByZero()
   {
   	  throw new ArithmeticException("Trying to divide by 0");
   }
}
</code>
</pre>
</body>
</html>