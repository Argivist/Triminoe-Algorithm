# Triminoe Labeling Algorithm

This project implements a triminoe labeling algorithm in Java. The algorithm takes an environment, represented by a board, and labels the cells with triminoe numbers based on certain rules.

## Files

The project consists of the following files:

- `Environment.java`: Defines the `Environment` class that represents the game board and provides methods to manipulate and display the board.

- `Triminoe.java`: The main class of the project that implements the triminoe labeling algorithm.

- `PointArray.java`: Defines the `PointArray` class that represents an array of points, used in the triminoe generation process.

- `Point.java`: Defines the `Point` class that represents a coordinate point on the board.

## How to Run

To run the triminoe labeling algorithm, follow these steps:

1. Compile the Java source files using the following command:

javac Triminoe.java Environment.java PointArray.java Point.java


2. Run the compiled program using the following command:

java Triminoe


This will execute the `main` method in the `Triminoe` class and display the labeled environment.

## Usage

The `Triminoe` class contains the logic for the triminoe labeling algorithm. It utilizes the `Environment`, `PointArray`, and `Point` classes to perform the operations.

To use the algorithm on a specific environment, you can customize the `Environment` object creation and pass it to the `Triminoe` class. The algorithm will label the cells in the environment according to the implemented rules.

Feel free to explore and modify the code to experiment with different board sizes, triminoe labeling techniques, or additional functionalities.

## Contributing

Contributions to the triminoe labeling algorithm project are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License


