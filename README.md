<p align="center">
  <a href="" rel="noopener">
    <img src="" alt="Project logo">
  </a>
</p>
<h3 align="center">Dijkstra's Algorithm for Minimal Weight Path</h3>

<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![GitHub Issues](https://img.shields.io/github/issues/AkramChaabnia/DijkstrasMinimalWeightPath.svg)](https://github.com/AkramChaabnia/DijkstrasMinimalWeightPath/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/AkramChaabnia/DijkstrasMinimalWeightPath.svg)](https://github.com/AkramChaabnia/DijkstrasMinimalWeightPath/pulls)
[![University](https://img.shields.io/badge/University-Paris%20Cité%20Université-%23A6192E)](https://u-paris.fr)

</div>

---

<p align="center">Dijkstra's Algorithm for Minimal Weight Path is a Java project that applies Dijkstra's algorithm to determine the minimal weight path between two nodes in a graph.
  <br> 
</p>

## 📝 Table of Contents

- [About](#about)
- [Code Structure](#code_structure)
- [Algorithm Complexity](#algorithm_complexity)
- [Getting Started](#getting_started)
- [Usage](#usage)
- [Built Using](#built_using)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)
- [Contact](#contact)

## 🧐 About <a name = "about"></a>

The objective of this project is to implement Dijkstra's algorithm to find the shortest path between two nodes in a graph, considering edge weights.

## 🚀 Code Structure <a name = "code_structure"></a>

The project includes the following files:

- `App.java`: Contains the main algorithm that computes the minimal weight path using Dijkstra's algorithm.

  - `Dijkstra(Graph graph, int start, int end, int numberV)`: Implements Dijkstra's algorithm to find the shortest path.
  - `main` : method serves as the entry point for the application. It interacts with the user through the console to input the graph's details, such as the number of vertices, edges, their weights, starting node, and ending node. Once the inputs are collected, it calls the `Dijkstra` method to compute and display the minimal weight path between the specified nodes.

- `WeightedGraph.java`: Defines classes for representing a weighted graph, including vertices and edges.

## 📈 Algorithm Complexity <a name="algorithm_complexity"></a>

The complexity of the algorithm used to determine the minimal weight path using Dijkstra's algorithm depends on the number of vertices (V) and edges (E) in the graph. In this context, it exhibits a complexity of **O(V _ (V + E) _ log V)**.

## 🛠️ Prerequisites <a name = "prerequisites"></a>

To run the project, you need to have Java installed on your machine. You can download Java from [here](https://www.java.com/).

## 🏁 Getting Started <a name = "getting_started"></a>

To compile and execute the project:

1. Clone the repository or download the project files.

### Using an IDE (Eclipse, VSCode, etc.)

2. Set up the JavaFX environment in your IDE.
3. Run the `App.java` file.

### Using Command Line

2. Compile the Java code using the command: `javac App.java`.
3. Run the compiled code using the command: `java App`.

## 🎈 Usage <a name="usage"></a>

To utilize the project:

- Input the number of vertices and edges.
- Enter the edges in the format: source destination weight. Enter `-1` to stop.
- Provide the starting and ending nodes.
- The project will compute and display the minimal weight path between the specified nodes.

## ⛏️ Built Using <a name = "built_using"></a>

- [Java](https://www.java.com/) - Programming Language

## ✍️ Authors <a name = "authors"></a>

- [@AkramChaabnia](https://github.com/AkramChaabnia) - Implementation

## 🎉 Acknowledgements <a name = "acknowledgement"></a>

- This project was given by the module instructor, <u><b>Professor Nicolas Loménie</b></u> for the advanced algorithms module at Université de Paris Cité (IF05X040 Algorithmique avancée).

## 📞 Contact <a name = "contact"></a>

For any questions or inquiries, feel free to contact:

- Email: akram.chaabnia25@gmail.com
- LinkedIn: [Akram CHAABNIA](https://www.linkedin.com/in/akram-chaabnia-43b7941b0/)
- GitHub: [@AkramChaabnia](https://github.com/AkramChaabnia)

Please feel free to reach out!

---

This template covers the essential sections for a README tailored to your project. Adjust the details as per your specific implementation and requirements.
