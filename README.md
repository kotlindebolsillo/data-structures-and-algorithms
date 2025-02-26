## 🚀 Welcome to the **Data Structures & Algorithms in Kotlin** repository! 
This project showcases the lessons of the course [Data Structures & Algorithms](https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/?srsltid=AfmBOorCZMEp3TDzPCE8WHT2wfX5RjSNNwHq8d4TYLmeg9sGyEKzjBco), each implemented in two ways:
1. **Java-style (`sortArrayJavaWay`)**: A more traditional, imperative approach.
2. **Kotlin-style (`sortArrayKotlinWay`)**: A more idiomatic, expressive Kotlin version.

---

## 📖 Table of Contents
- [🛠️ Features](#%EF%B8%8F-features)
- [📂 Project Structure](#-project-structure)
- [⚡ Usage](#-usage)
- [📝 Example](#-example-bubble-sort)
- [📌 Contribution](#-contribution)
- [📄 License](#-license)

---

## 🛠️ Features
✅ Implementation of common data structures and algorithms in Kotlin.  
✅ Side-by-side comparison of Java-style vs Kotlin-style coding.  
✅ Focus on **readability**, **performance**, and **best practices**.  
✅ Easy-to-understand code for beginners and experienced developers alike.  
✅ **Execution time measurement** – Each algorithm tracks how long it takes to complete, helping analyze performance.  

---

## 📂 Project Structure

```
📦 data-structures-and-algorithms/
├── 📦 src
    ├── 📦 arrays
        ├── 📜 BubbleSortAlgorithm.kt
        ├── 📜 InsertionSortAlgorithm.kt
        ├── 📜 SelectionSortAlgorithm.kt
        ├── 📜 ShellSortAlgorithm.kt
        ├── 📜 SortAlgorithm.kt           
    ├── 📦 utils
        ├── 📜 ArrayUtils.kt
        ├── 📜 LongUtils.kt    
└── 📜 README.md
```
---

## ⚡ Usage
To run the algorithms, simply call the corresponding function:

```kotlin
fun main() {
    val shortUnsortedArray = (-10..10).shuffled().take(8).toIntArray()

    println("Sorting using Java-style approach:")
    InsertionSortAlgorithm.sortArrayJavaWay(shortUnsortedArray)

    println("\nSorting using Kotlin-style approach:")
    InsertionSortAlgorithm.sortArrayKotlinWay(shortUnsortedArray)
}
```
---

## 📝 Example: Bubble Sort

✅ Java-style (sortArrayJavaWay)

```kotlin
override fun sortArrayJavaWay(array: IntArray) {
        val timeInMillis = measureTimeMillis {
            for (lastUnsortedIndex in array.size - 1 downTo 1) {
                for (i in 0 until lastUnsortedIndex) {
                    if(array[i] > array[i + 1]) {
                        array.swap(i, i + 1)
                    }
                }
            }
        }
        array.printArray()
        timeInMillis.printTimeInMillis()
    }
```
🎯 Kotlin-style (sortArrayKotlinWay)

```kotlin
override fun sortArrayKotlinWay(array: IntArray) {
        val timeInMillis = measureTimeMillis {
            for (lastUnsortedIndex in array.lastIndex downTo 1) {
                array.forEachIndexed { index, _ ->
                    if (index < lastUnsortedIndex && array[index] > array[index + 1]) {
                        array.swap(index, index + 1)
                    }
                }
            }
        }
        array.printArray()
        timeInMillis.printTimeInMillis()
    }
```

---

## 📌 Contribution
💡 Want to improve the code or add more algorithms?
Feel free to fork this repo, make your changes, and submit a pull request!

- Fork the repository
- Create a branch (git checkout -b feature-branch)
- Commit your changes (git commit -m "Added HeapSort implementation")
- Push to your branch (git push origin feature-branch)
- Open a Pull Request 🚀

---

## 📄 License
This project is licensed under the **MIT License** – feel free to use, modify, and distribute!  
📜 See the full license [here](LICENSE).

## 🎯 Happy Coding! 🚀
