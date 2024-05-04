package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func rightRotate(arr []int, rotations int) {
	n := len(arr)
	rotations = rotations % n
	temp := make([]int, rotations)
	copy(temp, arr[n-rotations:])
	for i := n - 1; i >= rotations; i-- {
		arr[i] = arr[i-rotations]
	}
	for i := 0; i < rotations; i++ {
		arr[i] = temp[i]
	}
}

// parseInts parses a space-separated string of integers into a slice of integers
func parseInts(s string) []int {
	strArr := strings.Fields(s)
	arr := make([]int, len(strArr))
	for i, str := range strArr {
		num, err := strconv.Atoi(str)
		if err != nil {
			fmt.Println("Invalid input. Please enter integers separated by space.")
			os.Exit(1)
		}
		arr[i] = num
	}
	return arr
}
func main() {
	fmt.Println("Enter the array elements separated by space:")

	// Create a scanner to read input line by line
	scanner := bufio.NewScanner(os.Stdin)

	// Read the first line of input (array elements)
	if scanner.Scan() {
		line := scanner.Text()
		arr := parseInts(line)

		// Read the second line of input (number of rotations)
		fmt.Println("Enter the number of rotations:")
		if scanner.Scan() {
			line = scanner.Text()
			numRotations, err := strconv.Atoi(line)
			if err != nil {
				fmt.Println("Invalid input for number of rotations.")
				return
			}

			// Perform rotations
			rightRotate(arr, numRotations)
			fmt.Printf("Value of arr after rotating it %d times is %v\n", numRotations, arr)

		}

	}

}
