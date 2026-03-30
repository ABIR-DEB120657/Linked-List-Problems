# 🧩 Linked List Problem Collection (Java)

<div align="center">
  <a href="https://git.io/typing-svg">
    <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=700&size=28&pause=1000&color=00ffcc&center=true&vCenter=true&width=700&lines=Master+Linked+Lists+with+Java.;Solve+100+Problems+Step+by+Step.;Boost+Your+Coding+Skills." alt="Typing Animation Header" />
  </a>
  <br>
  <img src="https://cdn.dribbble.com/users/1162077/screenshots/3848914/programmer.gif" width="220" alt="Coding Animation">
</div>

---

## 📖 About the Project

This repository contains a **collection of Java programs** solving **Linked List problems** — from basic operations to intermediate and advanced challenges.
The project is designed to help developers and students **visualize, implement, and master linked lists** with interactive and well-documented Java code.

**✨ Key Features:**

* Singly and Doubly Linked Lists
* Basic Operations: Insert, Delete, Search
* Advanced Problems: Reverse, Detect Cycle, Merge Lists
* Utilities: Display, Count Nodes, Find Middle, Rotate, and more
* Fully commented **Java code with animations** for better understanding

---

## 🛠️ Tech Stack

<p align="left">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/C%2B%2B-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white" alt="C++"/>
  <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL"/>
  <img src="https://img.shields.io/badge/JDBC-FF6F00?style=for-the-badge&logoColor=white" alt="JDBC"/>
</p>

---

## 📂 Project Structure (Animated)

<div align="center">
  <a href="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=700&size=24&pause=800&color=FF5733&center=true&vCenter=true&width=700&lines=LinkedListProblems/;basics/;intermediate/;advanced/;README.md">
    <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=700&size=24&pause=800&color=FF5733&center=true&vCenter=true&width=700&lines=LinkedListProblems/;basics/;intermediate/;advanced/;README.md" alt="Animated Project Structure" />
  </a>
</div>

---

## 💡 How to Use

1. Clone the repository:

```bash
git clone https://github.com/yourusername/LinkedListProblems.git
```

2. Navigate to a problem folder:

```bash
cd LinkedListProblems/basics
```

3. Compile and run Java files:

```bash
javac CreateLinkedList.java
java CreateLinkedList
```

4. Explore other folders: `intermediate/` and `advanced/`.

---

## 📊 Animated Java Examples

```java
// Example: Display a Linked List
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; next = null; }
}

public class DisplayLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            try { Thread.sleep(500); } catch(Exception e) {} // animation effect
        }
        System.out.println("NULL");
    }
}
```

*Tip: Run with animation to see nodes printed step by step.*

---

## 📈 Learning Outcomes

* Master **Linked List operations** in Java
* Implement **data structures for real-world applications**
* Develop **problem-solving and algorithmic thinking**
* Prepare for **interviews and competitive programming**

---

## 📌 Contributions

Contributions are welcome! Open a **Pull Request** to add new problems, optimized solutions, or visual animations.

---

## 🌐 Connect With Me

* LinkedIn: [Abir Deb](https://www.linkedin.com/in/abir-deb-41794137b)
* GitHub: [@abir-deb120657](https://github.com/abir-deb120657)

---

*Made with ❤️ in Java and animations*
