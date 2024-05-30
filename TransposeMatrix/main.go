package main

import "fmt"

func findTranspose(matrix [][]int) [][]int {
	rows := len(matrix)
	cols := len(matrix[0])
	transposedMatrix := make([][]int, cols)
	for col := range transposedMatrix {
		transposedMatrix[col] = make([]int, rows)
	}
	for row := 0; row < rows; row++ {
		for col := 0; col < cols; col++ {
			transposedMatrix[col][row] = matrix[row][col]
		}
	}
	return transposedMatrix

}
func displayMatrix(matrix [][]int) {
	rows := len(matrix)
	cols := len(matrix[0])
	for row := 0; row < rows; row++ {
		for col := 0; col < cols; col++ {
			fmt.Printf("%d ", matrix[row][col])
		}
		fmt.Println()
	}

}
func main() {
	var rows, cols int
	fmt.Printf("Enter number of rows: ")
	fmt.Scan(&rows)
	fmt.Printf("Enter number of cols: ")
	fmt.Scan(&cols)
	matrix := make([][]int, rows)
	for row := 0; row < rows; row++ {
		matrix[row] = make([]int, cols)
		for col := 0; col < cols; col++ {
			var element int
			fmt.Printf("Enter the value of element: ")
			fmt.Scan(&element)
			matrix[row][col] = element

		}
	}
	fmt.Println("Value of original matrix is:")
	displayMatrix(matrix)
	transpose := findTranspose(matrix)
	fmt.Println("Value of transposed matrix is:")
	displayMatrix(transpose)

}
