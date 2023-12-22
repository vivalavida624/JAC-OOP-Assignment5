##Part 1 :
Programming Assignment: ArrayList and Generics
Task 1: ArrayList Basics
1. ArrayList Operations:
- Declare an ArrayList of strings named `wordList`.
- Add the words "apple," "banana," "orange," "grape," and "kiwi" to `wordList`.
- Print the elements of `wordList`.
2. ArrayList Manipulation:
- Add "pear" at the beginning of `wordList`.
- Remove the third element from `wordList`.
- Check if the list contains the word "orange."
- Print the updated `wordList`.
Task 2: Generics
3. Generic Class:
- Create a generic class called `Pair` that stores a pair of elements.
- Instantiate a `Pair` with an Integer and a String.
- Print the elements of the `Pair`.
4. Using Generic Class:
- Create another `Pair` with two Double values.
- Print the elements of this new `Pair`.
Task 3: ArrayList with Generics
5. ArrayList with Generics:
- Create an ArrayList of `Pair` instances.
- Add the Integer-String `Pair` and Double-Double `Pair` created in Task 4 to this ArrayList.
- Print the elements of each `Pair` in the ArrayList.
Task 4: Challenge
6. Challenge:
- Write a method that takes an ArrayList of any type and prints its elements.
- Test this method with both `wordList` and the ArrayList of `Pair` instances.
----
##Part 2 :
Programming Assignment: File I/O
Task 1: Read from File
1. Read File:
- Create a Java program that reads a text file named "input.txt."
- Use FileReader and BufferedReader to read the contents of the file line by line.
- Print each line to the console.
2. Character Count:
- Implement a method that takes a String as input and counts the total number of characters (excluding whitespaces).
- Apply this method to each line read from the file and print the character count for each line.
Task 2: Write to File
3. Write to File:
- Create a new text file named "output.txt."
- Write the following lines to the file:
- "Hello, this is line 1."
- "Java File I/O is interesting!"
- "End of the assignment."
Task 3: Append to File
4. Append to File:
- Open the "output.txt" file created in Task 3 in append mode.
- Add the following lines to the end of the file:
- "Appending new line."
- "File I/O without buffers."
Task 4: Challenge
5. Challenge:
- Implement a method that takes a filename and a String as input and writes the String to the specified file without using buffers.
- Test this method by writing a custom message to a new file named "custom.txt."
