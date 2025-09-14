<!DOCTYPE html>
<html>
<body>

<h2>In this Module</h2>

<ol>
  <li>The Map Interface</li>
  <li>Comparable and Comparator</li>
</ol>  

<h3>The Map Interface</h3>

<p>In Java, elements of Maps are stored in key/value pair. Keys are unique values associated with individual Values. A map cannot contains duplicate keys. And, each key is associated with a single value.</p>

<h3>Map</h3>

<ol>
	<li>HashMap</li>
	<li>TreeMap</li>
	<li>EnumMap</li>
	<li>LinkedHashMap</li>
	<li>WeakHashMap</li>
</ol>

<h3>Methods of Map</h3>
<ul>
	<li>put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.</li>
    <li>putAll() - Inserts all the entries from the specified map to this map.</li>
    <li>putIfAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.</li>
    <li>get(K) - Returns the value associated with the specified key K. If the key is not found, it returns null.</li>
    <li>getOrDefault(K, defaultValue) - Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue</li>
    <li>containsKey(K) - Checks if the specified key K is present in the map or not.</li>
    <li>containsValue(V) - Checks if the specified value V is present in the map or not.</li>
    <li>replace(K, V) - Replaces the value of the key K with the new specified value V.</li>
    <li>replace(K, oldValue, newValue) - Replaces the value of the key K with the new value only if the key K is associated with the value OldValue.</li>
    <li>remove(K) - Removes the entry from the map represented by the key K.</li>
    <li>remove(K, V) - Removes the entry from the map that has key K associated with value V.</li>
    <li>keySet() - Returns a set of all the keys present in a map.</li>
    <li>values() - Returns a set of all the values present in a map.</li>
    <li>entrySet() - Returns a set of all the key/value mapping present in a map.</li>
</ul>

<h2>Comparable and Comparator</h2>

<p>To sort customm objects like Student or Employee, we need to provide explicit sorting logic. To achieve this, Java provides the Comparable and Comparator interfaces. Comparable and Comparator in Java allow us to define custom sorting behavior for objects, including sorting based on multiple data members.</p>

<h3>The Comparable Interface</h3>

<p>
This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.
</p>

<p>
<b>public int compareTo(Object obj):</b> It is used to compare the current object with the specified object. It returns
<ul>
	<li>positive integer, if the current object is greater than the specified object.</li>
	<li>negative integer, if the current object is less than the specified object.</li>
	<li>zero, if the current object is equal to the specified object.</li>
</ul>
</p>

<h2>The Java 8 Comparator Interface</h2>

<p>
Java 8 provides new ways of defining Comparators by using lambda expressions, and the comparing() static factory method.
</p>

<p><b>Code:</b></p>
<p>
Comparator byRanking = 
(Player player1, Player player2) -> Integer.compare(player1.geyRanking(), player2.getRanking());
</p>

<p>
Comparator<'Player'> byRanking = Comparator.comparing(Player::getRanking);
</p>
<p>
Comparator<'Player'> byAge = Comparator.comparing(Player::getAge);
</p>

</body>
</html>