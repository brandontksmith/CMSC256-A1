<h4>IMPORTANT:</h4>
	
You must first compile the classes and create a JAR file to use this program as described
below. The directions to do this are below.

Each component of the assignment runs by passing the program # as an argument to the JAR
file i.e. java -jar A1.jar Q[program #] [args]

<h4>COMPILING & THE JAR:</h4>

	NOTE:

		*You must be in the directory outside of the source code. So, we want to be in the
		directory that contains com.*

	1) Create a new directory called build. This is where we will store the compiled classes.

	2) Compile the classes using this command:

		javac -d build com/btks/a1/*.java

	3) Change your working directory (cd on Linux) to build

	4) Run the following command to generate a JAR file:

		jar cevf com.btks.a1.A1 A1.jar .

	5) The JAR file will now be inside build.

	TIP:

		An IDE like NetBeans or Eclipse can compile and build this for you. If you find
		this to be difficult, feel free to create a new project with these classes and do
		it that way.

<h4>PROGRAM 1:</h4>

	java -jar A1.jar Q1

	From here, the program will prompt you to enter a list of words space separated, and will
	count the occurrences of each word.

<h4>PROGRAM 2:</h4>

	java -jar A1.jar Q2

	From here, the program will prompt you for a number of lines, and then have you enter that
	many lines. It will then reverse and print out each line in reverse order.

<h4>PROGRAM 3:</h4>

	java -jar A1.jar Q3

	From here, the program will prompt you to choose a Polygon, and then ask you for the inputs
	of the specified polygon. It will output the area and perimeter of the shape you choose.

<h4>PROGRAM 4:</h4>

	java -jar A1.jar Q4 <input path>

	Example: java -jar A1.jar Q4 input.txt

	From here, the program will evaluate each mathematical expression, and ouput the results.

	NOTE:

		The input file must only consist of mathematical expressions, with one expression
		per line, and use the following operators:

		(, ), **, *, /, -, and +.

		You are able to use white spaces, and of course, numeric digits. These are some
		examples of valid expressions:

		5 * (3 + 6) + 3** 2
		8 - 3 + (2 * 3) - 17
		8 ** 2 + 13

<h4>PROGRAM 5:</h4>

	java -jar A1.jar Q5 <input path>

	Example: java -jar A1.jar Q5 input2.txt

	From here, the program will determine how many boxes can be used.

	NOTE:

		Each line in the input file starts with the number of boxes and then the three
		dimensions of all boxes, separated by the number sign #. Dimensions are separated
		by a comma. For example, a list of 4 boxes can be written as:

		4#1,1,1#2,2,2#3,3,3#4,4,4

<h4>DISCLAIMER:</h4>

	I realize that this is publicly available. If you are in CMSC256 at VCU and have this same
	assignment, do NOT copy this and pass it off as your own. You will get caught, and I won't
	be held accountable for any cheating. This is here to document the programs/projects I do
	both at home, work, and for my classes at the university.
