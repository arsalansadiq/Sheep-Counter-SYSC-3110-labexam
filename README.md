# Sheep-Counter -  SYSC 3110 – Lab Exam (2 hours)
## A simple program which increment and decrements sheep.Programmed using (MVC) design Pattern. This was programmed for a Lab Exam.
### Open book. Headphones and/or laptop not allowed.

### We want to come up with a very simple GUI application that can help Shepherd Joe keep count of his sheep on his handheld device that runs Java. The GUI should look like this:


The shepherd knows the total number of his sheep, and he enters this number in the top text field. When bringing the sheep back to the barn, the shepherd presses “increment” for each sheep that crosses the barn door. Occasionally, an unruly sheep gets back out, and so Joe needs to click “decrement”. The “current” text field shows the current number of sheep that have made it back into the barn. The label at the bottom is to make it clear to Joe whether all the sheep have made it safely into the barn. While the current number of sheep inside the barn is under the total, the label is set in red as “incomplete!”. When all the sheep are in, the label is automatically set to “complete!” in green.
Occasionally, a sheep gets eaten by a wolf, or new sheep are acquired or born, and so the total can change. Joe can then just change the total directly in the text field and press enter. It is possible then that the number in the “current” text field is higher than the total, in which case, the bottom label should be set in yellow to “inconsistent!”. Joe can of course get out of the inconsistency by hitting “decrement” until the current number is correct and therefore equal or below the total.

### You are asked to implement this application using the Model-View-Controller principles.
Hints:
* for the layout above, a simple 4 x 2 GridLayout was used (there’s an unused area to the right of the label at the bottom);
* JTextField triggers an ActionEvent (just like JButton!) when you hit “enter”.
### Deliverables:
* a) The complete code, packaged in a JAR file (MAKE SURE YOU INCLUDE YOUR SOURCE CODE OR YOU WILL GET ZERO);
* b) The complete UML class diagram of your design, and a UML sequence diagram showing what happens when the user hits “enter” in the “total” field. You can use Violet to create these diagrams but make sure you export the diagram in png, gif or jpg.
#### Put your deliverables (the JAR and the diagrams) in a single zip file, and submit your file on cuLearn. THE DEADLINE FOR SUBMISSION IS AUTOMATICALLY ENFORCED, AND MISSING IT MEANS YOU GET ZERO. So: submit early, and submit often.
We will evaluate the following items:
* Is your program compiling and working correctly? Does it crash too easily?
* Does the implementation meet our requirements?
* Is the code well written: deals well with bad input, smell-free (no code repetition, overly long methods or complicated logic)?
* Does the design follow loose coupling and high cohesion principles?
* Are the diagrams correct and do they correspond to the code?
