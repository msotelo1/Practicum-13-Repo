# Instructions

## Practicum 13 - while and for Loops in Java

### BACKGROUND<br>
 **The while Loop**<br>
Programming languages generally provide a means of
repeating a set of program statements over and over
based on some condition (e.g., Boolean expression). 
Two common loops provided are the `while` loop and 
`for` loop.<br><br>
The `while loop` is referred to as an *indefinite loop*
since it can be used to **iterate** over a set of
statements an indefinite number of times, e.g.,<br><br>

<!-- "java" after the initial three backticks has markdown
      highlight text as Java code.
      
      Note that the final three backticks must be on their
      own line in order to be recognized. 
-->
```java 
System.out.println("Enter a number between 1-10")
response = input.nextInt();
while(response < 1 && response > 10) {
    System.out.println("INVALID RESPONSE - Please Reenter");
    System.out.println("Enter a number between 1-10");
    response = input.nextInt();
}
```
<!-- if put a break <br> before this than the backticks
     for symtax highlighting became disabled
-->
**The do-while Loop**<br>
Java also provides a `do-while` loop. The difference between
the two is that a while loop is a *pre-test* loop
and the do-while is a *posttest* loop.
That is, a while loop checks the condition *before* 
executing the loop. Thus if the condition is false the
first time, the loop is never executed. The do-while loop
on the other hand always executes the loop the first time,
and *then* checks the condition before executing the loop
again. Thus, do-while loops always execute one or more times.
<br>
Note that a do-while loop would be appropriate to use in the
above example, since we want to prompt the user for input
at least once, and possible more times (if they enter invalid
values),<br><br>

```java 
do {
     System.out.println("Enter a number between 1-10")
     response = input.nextInt();
}
while(response < 1 && response > 10); 
```
Note that the above contains less code than the while loop version.
However, it does not display an invalid input message as the
while loop version does, which may be approiate in some cases.
<br><br>
**The for Loop**<br>
The `for loop` is referred to as a *definite loop* since it is
used when a set of statements need to be iterated over a
specific number of times. A classic examples of its use is
if we needed to iterate over and add up all of the elements
of an array,
```java
   int sum = 0;
   int[] exam1_grades = new int[25];
   // assume grades entered into array exam1_grades

   for(int i = 0; i < exam_grades.length; i++)
     sum = sum + exam_grades[i];

   System.out.println("Exam 1 average = " + 
                       sum / (double) exams_grades.length;
```
The for loop iterates once for each elements in the array.
The array length can be determine by use of *arrayname*.length
as done here.  There is not need to curly braces with a for
loop when there is only one statement in the loop.<br><br>
There is a subtle different when writing a for loop each of
the following ways,
```java
  for(int i = 0; i < exam_grades.length; i++)
  ---------------------------------------------
  int i;  
  for(i = 0; i < exam_grades.length; i++)
```
The first way declares variable `i` *within* the loop as well as
assigning it. The second way declares variable `i` *before* the 
loop, and thus only assigns it within the for loop.
<br><br>
The difference in the two approaches is that when declaring
variable `i` within the loop, the variable only exists for the
duration of the loop, and is not accessible after the loop.
In the second approach, however, variable `i` is accessible 
after the termination of the loop, since it was declared
outside of the *scope* of the for loop.
<br><br>

### WHAT TO DO<br>
- Complete the program following the expected results in the
  program comments.<br><br>
- Correct and syntax, runtime or logic errors.
