# 📊 Word Counter (Java)

![Java](https://img.shields.io/badge/Java-Programming-orange?style=for-the-badge\&logo=java)
![Project](https://img.shields.io/badge/Project-Word%20Counter-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![Beginner Friendly](https://img.shields.io/badge/Level-Beginner%20Project-brightgreen?style=for-the-badge)

> 🔎 A **Java-based Word Counter** that reads text from a file and calculates the **frequency of a user-specified word** using **two different processing techniques (Split & Regex).**

---

# 🎬 Project Demo

![Typing Demo](https://media.giphy.com/media/LmNwrBhejkK9EFP504/giphy.gif)

---

# 🚀 Project Overview

This application demonstrates **text processing in Java** by reading content from a file and analyzing it using two different approaches.

The program:

✔ Reads text from a file
✔ Accepts a word from the user
✔ Counts the total number of words
✔ Calculates the frequency of the entered word
✔ Compares two different processing techniques

---

# 🔄 Application Workflow

```
Start
  │
  ▼
Read Text from input.txt
  │
  ▼
Ask User for a Word
  │
  ▼
Process Text (Two Methods)
  │
  ├── Split Method
  │       │
  │       └── Count Words + Frequency
  │
  └── Regex Method
          │
          └── Extract Words + Count Frequency
  │
  ▼
Display Results
  │
  ▼
End
```

---

# 📂 Input File Example

The program reads text from **`input.txt`**

Example:

```text
Java is a high-level, object-oriented programming language known for its
"write once, run anywhere" capability, powered by the Java Virtual Machine (JVM).
With strong memory management, multithreading support, and a rich ecosystem,
Java excels in performance, security, and scalability.
```

---

# ⌨️ User Input

The program asks the user to enter a word whose frequency should be calculated.

Example:

```
Enter a word to search: java
```

---

# ⚙️ Processing Methods

## 1️⃣ Split Method

This approach uses Java's **String split function**.

### Steps

* Split the text into words
* Store them in an array
* Count the number of words
* Compare each word with the user input

Example logic:

```java
String[] words = text.split(" ");
```

### Advantages

✔ Simple to implement
✔ Fast for small text inputs

### Limitation

⚠ Punctuation may affect results.

---

# 🔍 2️⃣ Regex Method

This approach uses **Regular Expressions** to extract words.

### Steps

* Use regex pattern to identify valid words
* Ignore punctuation
* Count extracted words
* Compare them with user input

Example logic:

```java
Pattern pattern = Pattern.compile("\\b\\w+\\b");
```

### Advantages

✔ More accurate word extraction
✔ Ignores punctuation marks

---

# 📊 Example Output

```
Total Words (Split Method): 32
Frequency of "java": 2

Total Words (Regex Method): 30
Frequency of "java": 2
```

---

# 🧠 Concepts Used

This project demonstrates:

📁 File Handling in Java
🧵 String Processing
🔎 Regular Expressions (Regex)
🔁 Loops & Conditionals
⌨️ User Input Handling

---

# 📁 Project Structure

```
Word-Counter
│
├── WordCounter.java
├── input.txt
└── README.md
```

---

# 🛠 How to Run the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/Word-Counter.git
```

---

### 2️⃣ Navigate to Project Folder

```bash
cd Word-Counter
```

---

### 3️⃣ Compile the Program

```bash
javac WordCounter.java
```

---

### 4️⃣ Run the Program

```bash
java WordCounter
```

---

# 🎯 Learning Outcomes

By building this project you will learn:

✔ Java file reading
✔ String manipulation techniques
✔ Regex usage in Java
✔ Text processing logic
✔ Basic CLI application development

---

# 📈 Future Improvements

Possible enhancements:

✨ Add GUI using Java Swing
✨ Support multiple file inputs
✨ Display most frequent words
✨ Export results to a file

---

# 👩‍💻 Author

**Hafsa Ahmadi**

GitHub:
[https://github.com/Hafsa-Ahmadi](https://github.com/Hafsa-Ahmadi)

---

⭐ If you found this project useful, **consider giving it a star!**

