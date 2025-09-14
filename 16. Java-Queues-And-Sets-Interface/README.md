<h2>In This Module</h2>

<ol>
  <li>Java Queue Interface</li>
  <li>Java Queue using LinkedList</li>
  <li>Java PriorityQueue</li>
  <li>Java ArrayDeque</li>
  <li>Java Set Interface</li>
  <li>Java HashSet</li>
  <li>Java Set of Custom Objects</li>
</ol>  

<h2>Java Queue Interface</h2>
<p>The Queue interface of the Java collections framework provides the functionality of the queue data structure. It extends the Collection Interface.</p>

<h3>Queue</h3>
<ul>
	<li>ArrayDeque</li>
    <li>LinkedList</li>
    <li>PriorityQueue</li>
</ul>

<h3>Methods</h3>
<ul>
	<li><b>boolean add(E e):</b> Inserts the specified element into the queue.</li>
    <li><b>boolean offer(E e):</b> Inserts the specified element into the queue. Returns true if the element was added successfully, or false if the queue is full.</li>
    <li><b>E remove():</b> Removes and returns the element at the front of the queue. Throws an exception if the queue is empty.</li>
    <li><b>E poll():</b> Removes and returns the element at the front of the queue. Returns null if the queue is empty.</li>
    <li><b>E element():</b> Retrieves but does not remove the element at the front of the queue. Throws an exception if the queue is empty/</li>
    <li><b>E peek():</b> Retrieves but does not remove the element at the front of the queue. Returns null if the queue is empty.</li>
</ul>

<h3>Java ArrayDeque Class</h3>
<p><b>Adding Elements:</b></p>
<ul>
	<li><b>addFirst(E e) or offerFirst(E e):</b> Adds an element to the front of the deque.</li>
	<li><b>addLast(E e) or offerLast(E e):</b> Adds an element to the end of the deque.</li>
</ul>

<p><b>Removing Elements:</b></p>
<ul>
	<li><b>removeFirst() or pollFirst():</b> Removes and returns the element at the front of deque.</li>
	<li><b>removeLast() or pollLast():</b> Removes and returns the element at the end of deque.</li>
</ul>

<p><b>Accessing Elements:</b></p>
<ul>
	<li><b>getFirst() or peekFirst():</b> Returns the element at the front of the deque without removing it.</li>
	<li><b>getLast() or peekLast():</b> Returns the element at the end of the deque without removing it.</li>
</ul>

<h3>Stack and Queue Operations Using ArrayDeque</h3>
<ol>
	<li><b>Stack Operations:</b></li>
    <ul>
    	<li><b>push(E e):</b> Pushes an element onto the stack represented by the deque.</li>
        <li><b>pop():</b> Pops an element from the stack represented by the deque.</li>
    </ul>
    
    <li><b>Queue Operations:</b></li>
    <ul>
    	<li><b>add(E e) or offer(E e):</b> Adds an element to the end of the deque, effectively making it a queue.</li>
        <li><b>remove() or poll():</b> Removes and returns the element at the front of the deque, making it a queue.</li>
    </ul>
</ol>

<h3>Java Set Interface</h3>
<p>The Set interface of the Java Collections framework provides the features of the mathematical set in Java. It extends the Collection interface. Unlike the list interface, sets cannot contain duplicate elements.</p>

<h3>Set</h3>
<ul>
	<li>EnumSet</li>
    <li>HashSet</li>
    <li>LinkedHashSet</li>
    <li>TreeSet</li>
</ul>

<h3>Methods</h3>
<ul>
	<li><b>add() -</b> adds the specified element to the set.</li>
    <li><b>addAll() -</b> adds all the elements of the specified collection to the set.</li>
    <li><b>remove() -</b> removes the specified element from the set.</li>
    <li><b>removeAll() -</b> removes all the elements from the set that is present in another specified set.</li>
    <li><b>retainAll() -</b> retains all the elements in the set that are also present in another specified set.</li>
    <li><b>clear() -</b> removes all the elements from the set.</li>
    <li><b>size() -</b> returns the length (number of elements) of the set.</li>
    <li><b>contains() -</b> returns true if the set contains the specified element.</li>
</ul>

<h3>Java HashSet</h3>
<ul>
	<li>In Java, HashSet is commonly used if we have to access elements randomly. It is because elements in a hash table are accessed using hash codes.</li>
    <li>The hashcode of an element is a unique identify that helps to identify the element in a hash table.</li>
    <li>HashSet cannot contain duplicate elements. Hence, each hash set element has a unique hashcode.</li>
</ul>

<h3>Java HashSet of Custom Objects</h3>
<p>When using Set and HashSet in Java, for the primitive types we can just use it without worry about how to implement the hashcode and the comparison logic. But when you want to use the Set with a custom class by putting custom objects into the set, that customm class has to implement the hashCode() and equals() methods in order for the HashSet to work.</p>
