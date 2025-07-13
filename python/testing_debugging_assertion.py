# Hlulani Myambo
# Testing, Debugging and Assertions
# This is how these notes works - each term is explained after being discovered and with examples.

# Terminologies
"""
1. Errors/Bugs => A program not working as intended.
  As humans we are not perfect and most of the times we can make mistakes which leads into programs not working as intended.
  This can be fixed by debugging.

2. Debugging => Art or ways of removing  bugs/errors.
  When we are debugging, we are studying events which leads into an error or a bug.
  Here we understand why the program is not working and how can we fix it.

  To fix or debug our code faster we must make sure that we modularize our code
  How can we modularize it?
  a. Document our functions when we make them and document code that seems hard to understand.
  b. Use simple english and simple words,
  c. Avoid DRY(Do not repeat yourself)
  d. print statements are good ways of debugging too.
    => They are good to test the hypothesis, and must be inserted within the functions, loops ...etc

  => In order for you to document your code you use the doc-string
  => Doc-string are multi-line strings useed to describe the purpose, usage and behaviour of a function, modules and more.
  => The comments or a message is written or enclosed within the triple single quotes or triple double qoutes

  # History of Debugging:
  in 1947 September 9 the Mark II Aiken Relay Computer was built, could do addition in 0.1 seconds, multiplication in 0.7 seconds,
  take log of something in 5 seconds so it was impressive for that time since it is still faster that humans but it is pretty slow for todays standards.
  => Group of engineers were working on a program that was suppossed to find a trigonometry function and among them there was grey horper.
  The program was not working correctly so they went through all panels and relays where they isolated a program in relay program 70 where they have the moth.
  The moth was probably dead probably electricuted. The moth was the one impeding the calculations and the note was made and says 'First actual of bug being found'.
  So they were actual doing the debugging in real life instead of computer.

3. Testing => Validating our code by comparing input and output pairs to specifications.
   specifications => act of identifying something precisely.

4. Assertions => These are good examples of defensive programming
    => Defensive programming => checking condintions on inputs/outputs
    assert statements are either at the beginning or at the end of the function
    => used to make sure that the assumptions on computation are exactly what the function expects them to be.

    we use a keyword assert condition or what to expect, 'What to print if the function does not hold'
    This raises an AssertionError if it holds false
    Then the function will stops and not continues, This reduces errors
    And ensures that pre condition and post condition are working as expected.
    which reduces bad values too

    WHEN TO USE ASSERTIONS?
    1. When we want to spot bugs as soon as they are introduces and make clear of where they have happened.
    2. Supplementation or substitution of testing.
    3. raising an exception if a bad data is inserted.
    4. use the exception for checking types of arguments or values.
    5. checking that invariants on data structures are met
    6. check constraints on return values
    7. check the violation of constraints procedure i.e No duplicates in a list
"""

# Testing begins here
"""
QUESTION: When do we start testing?
1. The code must work meaining that there are no syntax errors.
  a. Syntax errors => analogous to spelling, This is like a grammar mistake in English.
  But in coding is when you write a wrong or incomplete structures.
  Syntax error in short is violating the grammatical or coding rules of a specific programming language.

  These will be highlighted in 'red' by the IDE (Intergrated Development Environment)

  Syntax errors are found during compile-time meaning that they are called 'compile-time errors'

  b. Compile-time errors => Discovered by the interpreter before the program runs.
  => Some Examples are
    1. Syntax errors => violation of python grammar
    i.e def hello(:
        pass

    in the above code you are missing a close parentheses which causes syntax error

    i.e if True # missing a semi colon
        print("Hello World) # missing a close double quote
        print('Hello, World") # string literal is unterminated

    Note that the common types of errors are:
    a. Leaving out a keyword
    b. Writing incorrect keyword.
    c. writing the correct keyword but in the wrong place.
    d. Leaving out a symbol such as colon, comma, parentheses

    2. Import error => importing a file that does not exists or module that does not exists
    importing meth instead of math
    or aliasing incorrectly => "import sqrt from math" instead of "from math import sqrt"

    3. IndentationError => incosistent indentation
    sometimes this can not be seen until the code is runs and raises an error

    4. NameError => Undefined indentifier or variable name has not been declared.

    And many more

  With all of these being said and if only if the code runs correctly without causing compile time errors
  Then come up with test cases.

  Test cases => pairs of input and output for the expected programs.
  And once your program runs and the test cases are there then you can start testing.
"""

# Three general classes of test that can be performed.
"""
1. Unit Testing => Testing each function seperately.
    We test to ensure that the function runs to the specifications.
    This must be done several times and if bugs are found then do Regression testing (This is our second general testing)

2. Regression Testing => Here we come up with test cases of that type of bug that was found during unit testing.
   Run the code again to ensure that there are no new bug being introduced into our programs as we try to fix the previous bug.

After doing unit testing and Regression testing multiple times then move on to the last general testing class

3. Integration testing => Testing the program as a whole.
 combining all the individual pieces and run them together.
 This will test and ensure that all the combined statements work as expected. And if it works as intended the you are done.
 But if not then go back and redo unit testing and regression testing.
"""

# Other methods of testing.
"""
1. Exhaustive Testing => Run a program using all possible inputs and compare actual outputs from expected outputs from test cases

2. Random testing => Subset or some values of the input within the domain are used for testing
    This must be done if and only if there are no Natural partitions .
    The more random testing is done and run passes the test cases, the more likely it is for the coode to be likely correct.

3. Equivalence classes and Boundary value:
    a. Equivalence Classes => grouping inputs into sets of values with similar expected behaviour.
    b. Boundary value analysis => Choosing values at and either side of the boudary class.
    i.e boundary value = 10 then sample values(test cases) are 9 and 11

4. Path testing => creating test cases that covers all the paths execution of the program atleast once.
    Here a 'path-complete test case' can be implemented.

    path-complete => Test case  that goes through all possible paths in the code.

    NB: Path testing is mainly for control flow statements.
    a. Branches(if statements):
    => Exercise all parts of a condition
    => Test cases must go through all the branches.

    b. For loops:
    => Have test case that goes through the loop.
    => Have a test case that goes though the loop exactly once meaning the loop is executed one time.
    => Have the test case the does not go though the loop at all.

    c. While loops:
    => Similar to the loops but must have cases that catch all ways to exit the loop to avoid the infinite loop.
    => Here a path complete test case might miss a bug.

5. Statement coverage => Here we are testing all the statement atleast once rather than testing all the path.

6. Glass and Black boxes:
    a. Glass box testing:
    => Here the code is the guide into coming up with the test cases.
    => The code itself exists and by looking at the code, You must come up with the test cases and you must explore all the paths.
    => This is mainly applied on path testing and have some drawbacks such as code not going through loops arbitrary many times and missing some paths.

    b. Black box testing:
    => The doc-string here explains what does that function does and just by reading that docstring the we can come up with the test cases.
    => Test cases are designed without looking at the code.
    => Advantages are that anyone can implement it just by reading the doc string of a function so it is implementer independent.
    => Regardless of the implementation, The test cases must give the same expected outputs for the corresponding inputs.
"""

# glass box testing
def absolute_value_of_a_number(number):
    """
    Args:
        number (int): Assumes that the input is an integer

    Returns:
        int: return number if number >= 0 otherwise return -number
    """

    if number < -1:
        return -number
    else:
        return number

"""
Test cases here for path-complete suite are 2 and -2
but absolute_value_of_number(-1) returns -1 therefore you skipped one boundary test case which is -1
therefore there exists a bug in our code which means that we did not inlude that -1 as a test case
"""

"""
Debugging Steps:
1. Study the program code.
  => Do not ask what is wrong rather ask how did you get unexpected result.
  This is similar to physics or any scientific method.
  => You first study the available data i.e test cases
  => Form a hypothesis i.e indexing from 1 to ...etc
  => Repeat the experiment for x times.
  => pick simplest input to test with. i.e simplest test case that can exists

Note as You run the code and debugging there are error messages that may be encountered in the terminal.
These error code messages are know as Run-time errors.

run-time errors => Errors raised during the execution of aa certain program.
=> program structure or syntax is correct but does not executes as expected.
examples of run-time errors:
    1. IndexError => Trying to access element out of range. in mathematics we say it is not fall within our range or domain.
    2. TypeError => Trying to convert a list into an integer or trying to convert an inappropriate type. i.e '3'/4
    3. NameError => referencing a non-existing variable or calling the variable that does not exists.
    4. ZeroDivisionError => number divided by 0
    5. RecursionError => recursion reach limit of 997 times
    6. FileNotFoundError => importing a file that does not exists within the specified path.

    # Logic Error will be found most of the time and these are the hard ones to debug so suggestion is that take time while you are doing them.
    => Program here passes the checking or compiling then executes but produces incorrect results or
    no results at all due to the flaw on the implementation of the algorithm.
    => with logic errors sometimes you have to start over.

    with LOGIC ERRORS:
    => Think before writing the new code.
    => Draw pictures, take a break
    => Explain the code to someone else or rubber ducky.
    As you explain to someone then you will find the error within your code.

Run-time errors are called exceptions.
They are called exceptions because it is an exception to what was expected to what the program expected.

=> Common times of errors are
1. SyntaxError: failing to fulfill the python grammar.
2. NameError: local or global variable not found.
3. AttributeError: Failing to reference an attribute
4. TypeError: Operand does not have correct type.
5. ValueError: Operand is correct but the value is illegal.
5. IOError: file not found

To encouter a block of code that you think might raise an exception then use the try/except block.

try:
    code block that you think will raise an exception
except 'name of exception':
    print() # print what you want the user to see if the enter something incorrect or if the expetion is encountered.
    Name of an exception is not compulsory but it is good to specify them

else:
    this body is executed when code in try is finished without raising an error.

finally:
    Anything within this code block will always run.
    mostly we use this part for closing our file to avoid memory leak.
    This will always run regardless of what is happening on the try, except and else.

When an error is found what do we do?
=> if it is within a function then stop execution then raise an exception using the keyword raise.
=> raising an exception means we signal error meaning that it must have a description
 i.e raise Exception('description here...')
 => raise nameoferror('description goes here')
"""

# Things you must not do when testing and debugging
"""
1. Do not write the entire program, test the entire program and debug the entire program.
    Since you will introduce more and more bugs which is going to cause lot of confusion
"""

# Things to do when doing testing and debugging
"""
1. Do unit testing
 => write one function, test that function and debug that function and ensure that it works
 => Do the same for other functions
2. Do regression testing on them if there is an error.
3. Do integration testing if everything works as intended on unit testing and regression testing.

This will reduce the debugging time.

As you change your code, ALWAYS backup your code.
Change the code, document, if the code was working for a bit then backup it and try to change some places.
"""

# The best way to learn and understand hard topics and complex algorithms is to go back to basics of programming independent of the programming langauge. - Hlulani Myambo
