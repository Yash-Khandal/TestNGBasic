# TestNGBasic



What is really happening
We stick the free-text label (groups = "hello") on each @Test method.
TestNG keeps a map:
"hello" → [sayHello, goodMorning]
"bye"  → [sayBye, goodNight]
When the XML says
<include name="hello"/>
TestNG looks up the map and runs only the methods whose list contains that label.
That’s it—no method calls itself, no stack grows—so zero recursion.
Analogy
Think of it like TV channels:
Methods = TV shows
Groups = channel names (HBO, ESPN, Comedy)
<include name="HBO"/> = “show me only HBO shows”
You’re simply filtering a playlist, not rewinding the tape.
If you want to see the labels, add a line inside any method:
java
Copy
System.out.println("Running method: " + new Exception().getStackTrace()[0].getMethodName());
Run it again—you’ll see normal top-to-bottom execution, no self-calls.
Bottom line
Groups are just tags/keywords so you can include/exclude whole sets of tests in one shot—no magic, no loops, no recursion.
