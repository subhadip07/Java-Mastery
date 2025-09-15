<!DOCTYPE html>
<html>
<body>

<h2>In This Module</h2>
<ol>
	<li>Java Collection Framework</li>
    <li>Java Collection Interface</li>
    <li>Java List Interface</li>
    <li>Java ArrayList</li>
    <li>Java LinkedList</li>
    <li>Java Vector</li>
    <li>Java Stack</li>
</ol>

<h2>Java Collection Framework</h2>
<p>The Java collections framework provides a set of interfaces and classes to implement various data structures and algorithms. These interfaces include several methods to perform different operations on collections.<p>

<h3>Collection</h3>
<ul>
	<li>List</li>
    <li>Set</li>
    <ul>
    	<li>SortedSet</li>
    </ul>
    <li>Queue</li>
    <ul>
    	<li>Deque</li>
    </ul>
</ul>

<h3>Map</h3>
<ul>
	<li>SortedMap</li>
</ul>

<h3>Iterator</h3>
<ul>
	<li>ListIterator</li>
</ul>

<h2>Java Collection Interface</h2>
<p>The Collection interface is the root interface of the Java collections framework.</p>
<p>The Collection interface includes various methods that can be used to perform different operations on objects.</p>

<ul>
	<li><b>int size(): </b>Returns the number of elements in the collection.</li>
    <li><b>boolean isEmpty(): </b>Returns true if the collection contains no elements.</li>
    <li><b>boolean contains(Object o): </b>Returns true if the collection contains the specified element.</li>
    <li><b>boolean add(E e): </b>Adds the specified element to the collection. Returns true if the collection changed as a result.</li>
    <li><b>boolean remove(Object o): </b>Removes a single instance of the specified element from the collection, if it is present.</li>
    <li><b>boolean containsAll(Collection<> c): </b>Returns true if the collection contains all elements of the specified collection.</li>
    <li><b>boolean addAll(Collection<> c): </b>Adds all elements from the specified collection to the collection.</li>
    <li><b>boolean removeAll(Collection<> c): </b>Removes all elements in the collection that are also contained in the specified collection.</li>
    <li><b>boolean retainAll(Collection<> c): </b>Removes all elements from the collection that are not present in the specified collection.</li>
    <li><b>void clear(): </b>Removes all elements from the collection.</li>
    <li><b>Object[] toArray(): </b>Returns an array containing all elements in the collection.</li>
</ul>

<h2>Java List Interface</h2>

<p><b>List</b></p>
<ol>
	<li>ArrayList</li>
    <li>LinkedList</li>
    <li>Stack</li>
    <li>Vector</li>
</ol>

<p>The List interface extends the Collection interface and adds methods that are specific to lists, which are ordered collections that allow duplicate elements. Here are some methods that are present in the List interface but not in the Collection interface: </p>

<ul>
	<li><b>get(int index): </b>Retrieves the element at the specified index in the list.</li>
    <li><b>set(int index, E element): </b>Replaces the element at the specified index with the given element.</li>
    <li><b>add(int index, E element): </b>Inserts the specified element at the specified position in the list, shifting the current elements to the right.</li>
    <li><b>remove(int index): </b>Removes the element at the specified index from the list and shifts the remaining elements to the left.</li>
    <li><b>indexOf(Object o): </b>Returns the index of the first occurence of the specified element in the list, or -1 if the element is not present.</li>
    <li><b>lastIndexOf(Object o): </b>Returns the index of the last occurence of the specified element in the list, or -1 if the element is not present.</li>
    <li><b>listIterator(): </b>Returns a list iterator over the elements in the list.</li>
    <li><b>listInterator(int index): </b>Returns a list iterator over the elements in the list, starting at the specified index.</li>
    <li><b>subList(int fromIndex, int toIndex): </b>Returns a view of the portion of the list between the specified fromIndex (inclusive) and toIndex (exclusive).</li>
</ul>

<h2>Java ArrayList</h2>
<p>In Java, we need to declare the size of an array before we can use it. Once the size of an array is declared, it's hard to change it.</p>
<p>To handle this issue, we can use the ArrayList class. It allows us to create resizable arrays.</p>
<p>Unlike arrays, arraylists can automatically adjust their capacity when we add or remove elements from them. Hence, arraylists are also known as dynamic arrays.</p>

<h2>Internal Working of ArrayList</h2>
<p>Initially, the array has a certain capacity, and as elements are added, it fills up. When the capacity is reached, the ArrayList creates a new larger array and copies the elements from the old array to the new one. This process of resizing and copying is transparent to the user.</p>

<p>However, frequent resizing operations can lead to performance overhead, so the ArrayList increases its capacity by a certain factor to minimize the frequency of resizing.</p>

<h2>Java LinkedList</h2>
<p>The LinkedList class of the Java collections framework provides the functionality of the linked list data structure (doubly linkedlist).</p>
<p>Elements in linked lists are not stored in sequence. Instead, they are scattered and connected through links (Prev and Next).</p>

<h2>Java Vector</h2>
<p>The Vector class synchronizes each individual operation. This means whenever we want to perform some operation on vector, the Vector class automatically applies a lock to that operation.</p>

<p>It is because when one thread is accessing a vector, and at the same time another thread tries to access it, and exception called ConcurrentModificationException is generated. Hence, this continuous use of lock for each operation makes vectors less efficient. However, in array lists, methods are not synchronized.</p>

<h2>Java Stack</h2>
<p>In stack, elements are stored and accessed in Last In First Out manner. That is, elements are added to the top of the stack and removed from the top of the stack.</p>

<ol>
	<li><b>void push(E item): </b>Pushes the given element onto the top of the stack.</li>
    <li><b>E pop(): </b>Removes and returns the element at the top of the stack. Throws an EmptyStackException if the stack is empty.</li>
    <li><b>E peek(): </b>Returns the element at the top of the stack without removing it. Throws an EmptyStackException if the stack is empty.</li>
    <li><b>boolean empty(): </b>Returns true if the stack is empty, false otherwise.</li>
</ol>
</body>
</html>