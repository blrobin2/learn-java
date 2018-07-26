# Java Naming Conventions
* Adopting the accepted conventions for naming variables, methods and object in Java makes your code easier for others to read.
* "Others" here also includes you when you come to look at your code weeks or months after you wrote it.

The things you will name in Java are:
* Packages
* Classes
* Interfaces
* Methods
* Constants
* Variables
* Type Parameters

## Packages
* Always lower case.
* Package names should be unique
* Use your internet domain name, reversed, as a prefix for the package name
* Oracle specify a convention for package names at http://docs.oracle.com/javase/specs/jls/se6/html/packages.html#7

### Invalid domain name components
* Replace invalid characters (i.e. -) in domain name with an underscore
* Domain name components starting with a number should start with an underscore _
* Domain name components that are Java keywords should start with an underscore

### Examples with replacements:
* Switch.supplier.com -> com.supplier._switch
* 1world.com -> com._1world
* Experts-exchange.com -> com.experts_exchange

### Example package names
* java.lang
* java.io
* org.xml.sax.helpers
* com.blrobin2.autoboxing

## Class Names
* CamelCase
* Class names should be nouns (they represent things)
* Should start with a capital letter (so, PascalCase)
* Each word in the name should also start with a capital (e.g. LinkedList)

### Sample Class Names
* ArrayList
* LinkedList
* String
* TopSong
* GearBox
* Main

## Interface Names
* Capitalized like class names (PascalCase)
* Consider what objects implementing will become or what they will be able to do:

### Examples:
* List
* Comparable
* Serializeable

## Method Names
* camelCase
* Often verbs
* Reflect the function performed or the result returned

### Examples:
* size()
* getName()
* addPlayer()

## Constants
* CONSTANT_CASE
* Separate words with underscore_
* Declared using the final keyword

### Examples:
* static final int MAX_INT
* static final short SEVERITY_ERROR
* static final double PI = 3.141592653

## Variable Names
* camelCase
* Meaningful and indicative
* Do not use underscores

### Examples:
* i
* league
* sydneySwans
* boxLength

## Type Parameters
* Single character, capital letter
* Guidelines given at https://docs.oracle.com/javase/tutorial/java/generics/types.html

### Type Parameters Examples
* E - Element (used extensively by the Java Collections Framework)
* K - Key
* T - Type
* V - Value
* S,U,V, etc. - 2nd, 3rd, 4th types