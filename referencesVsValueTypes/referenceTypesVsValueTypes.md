# Reference Types vs Value Types
```java
int[] myIntArray = new int[5];
int[] anotherArray = myIntArray;

System.out.println("myIntArray= " + Arrays.toString(myIntArray));
System.out.println("anotherArray= " + Arrays.toString(anotherArray));
```

```bash
myIntArray= [0, 0, 0, 0, 0]
anotherArray= [0, 0, 0, 0, 0]
```

```java
anotherArray[0] = 1;

System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));
```

```bash
after change myIntArray= [1, 0, 0, 0, 0]
after change anotherArray= [1, 0, 0, 0, 0]
```

* Both myIntArray and anotherArray are both pointing to the same array in memory.
* When we print, we're printing the same array.
* When we set the element at index 0 to 1, we're setting it at that address, so it updates the same array.
* So, when we print again, we're printing the same array, which is why "both" variables update.