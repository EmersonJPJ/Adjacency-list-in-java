# 📚 **Graph Management System** - A Data Structures Project

## 🚀 **Introduction**
Welcome to the **Graph Management System** project! This application is designed to demonstrate the power of graph data structures through an interactive command-line interface. The main functionalities of the project revolve around graph manipulation, specifically adding, removing, and displaying edges, as well as showing the adjacency list of vertices.

The system is built using Java and focuses on **graphs** implemented with **adjacency lists**.

---

## 📋 **Table of Contents**

- [Project Overview](#-project-overview)
- [Features](#-features)
- [Technical Details](#-technical-details)
  - [Data Structure](#-data-structure)
- [How to Use](#-how-to-use)
- [Installation](#-installation)
- [License](#-license)

---

## 🛠 **Project Overview**

This project simulates a graph management system with the following core features:

- **Add edges**: Create a weighted edge between two vertices.
- **Remove edges**: Delete an edge between two vertices.
- **Display graph**: View the full graph structure with weights.
- **Show adjacency list**: Display the neighbors of a specific vertex.

The system operates on an **undirected, weighted graph** and uses **adjacency lists** for efficient representation.

---

## 🎯 **Features**

- **User-friendly CLI**: Interact with the program through a clean command-line interface.
- **Flexible graph structure**: Add and remove edges between vertices of a dynamic graph.
- **Efficient adjacency list**: Maintain a list of adjacent vertices for quick lookups.
- **Scalability**: Supports graphs of various sizes (up to 20 vertices).

---

## 🧑‍💻 **Technical Details**

### 🗃 **Data Structure**

This project uses the **adjacency list** representation for the graph, where each vertex has a linked list of its adjacent vertices. The graph is represented as an array of linked lists, where each linked list node contains the adjacent vertex and the weight of the edge connecting them.

#### **Classes Overview**:
1. **Principal.java**: Main class responsible for interacting with the user, displaying the menu, and calling methods to manipulate the graph.
2. **Nodo.java**: Defines the `Nodo` class, which represents each edge in the adjacency list (stores a vertex, weight, and a pointer to the next node).
3. **Grafo.java**: Defines the `Grafo` class, which manages the graph, including operations like adding/removing edges and displaying the graph.

### 🌳 **Graph Representation**:

The graph is represented as a fixed-size array of `Nodo` objects. Each `Nodo` represents a vertex and holds a linked list of edges (represented as other `Nodo` objects).

#### **Structure of the Data**:
```plaintext
graph[vertex] -> [NODO(AdjacentVertex, Weight)] -> [NODO(NextVertex, Weight)] -> NULL
```
### **Example**:
If vertex 0 is connected to vertex 1 with a weight of 5, the structure would look like:
```plaintext
graph[0] -> [Nodo(1, 5)] -> NULL
```

## 🔧 **How to Use**

To run the project, follow these steps:

1. **Clone the repository**:

    ```bash
    git clone https://github.com/yourusername/graph-management-system.git
    cd graph-management-system
    ```

2. **Compile the Java files**:

    ```bash
    javac Principal.java Nodo.java Grafo.java
    ```

3. **Run the program**:

    ```bash
    java Principal
    ```

---

## 📥 **Installation**

This project requires **Java 8+** to run. Ensure that you have Java installed on your system:

1. **Install Java** (if not already installed):
   - For Windows/Mac/Linux: [Download Java from Oracle](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)

2. Clone the repository and compile the files:

    ```bash
    git clone https://github.com/EmersonJPJ/Adjacency-list-in-java.git
    cd Adjacency-list-in-java
    javac Principal.java Nodo.java Grafo.java
    java Principal
    ```

## 🤝 Contributing

Contributions are always welcome! If you have suggestions, improvements, or bug fixes, feel free to open an issue or create a pull request. 

## ✨ Contact  

Feel free to reach out for any questions or suggestions!  

- 📧 **Email**: emerson04vade@gmail.com  
- 💻 **GitHub**: EmersonJPJ 
