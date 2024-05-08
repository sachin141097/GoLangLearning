package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func findSecondLargest(arr []int) int {
	n := len(arr)
	largest := arr[0]
	secondLargest := -1
	for i := 0; i < n; i++ {
		if arr[i] > largest {
			secondLargest = largest
			largest = arr[i]
		} else if arr[i] < largest && arr[i] > secondLargest {
			secondLargest = arr[i]
		}
	}
	return secondLargest
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

		secondLargest := findSecondLargest(arr)
		fmt.Printf("Value of second largest element is %v\n", secondLargest)

	}

}
