# Arrays Recap

* An array is a data structure that allows you to store multiple values of the same type into a single variable.
* The default values of numeric array elements are set to 0.
* Arrays are zero-indexed: an array with n elements is index from 0 to n - 1, for example 10 elements index range is from 0 to 9.
* If we try to access index that is out of range Java will give us ArrayIndexOutOfBoundException, which indicates that the index is out of bounds.
* TO access array elements we use the square braces [ and ], also known as array access operator.

## Example of creating a new array
```java
int[] array = new int[5];
```

* The array contains the elements from array[0] to array[4].
* It has 5 elements and index range of 0 to 4.
* The new operator or keyword is used to create the array and initialize the elements to their default values.
* In this example, all the array elements are initialized to zero since this is an int array.
* For boolean array elements, they would be initalized to false.
* For string or other objects, they would be null.

```java
int[] myNumbers = {5, 4, 3, 2, 1};
```
* We can also initialize an array inline by using array initializer block { and }. Values defined need to be separated by a comma.
* This way of initializing an array is also known as an anonymous array.
* It has 5 elements and index range 0 to 4.
* In this example array elements are initialized to 5, 4, 3, 2, 1.

## 1st Common Error
```java
int[] myArray = {10, 35, 20, 17, 18};
myArray[5] = 55; // out of bounds
System.out.println(myArray[-1]); // out of bounds, doesn't wrap around like Python
```
* Accessing index out of range will cause ArrayIndexOutOfBoundsException
* We have 5 elements, but an index range of 0 to 4.

## 2nd Common Error
```java
int[] myArray = {10, 35, 20, 17, 18};

for (int i = 1; i < myArray.length; i++) {
  System.out.println("value= " + myArray[i]);
}
```

```bash
value= 35
value= 20
value= 17
value= 18
```

* Started from index 1 instead of index 0.

## 3rd Common Error
```java
int[] myArray = {10, 35, 20, 17, 18};

for (int i = 0; i <= myArray.length; i++) {
  System.out.println("value= " + myArray[i]);
}
```

```bash
value= 10
value= 35
value= 20
value= 17
value= 18
ArrayIndexOutOfBoundException
```

* Used <= myArray.length instead of < myArray.length