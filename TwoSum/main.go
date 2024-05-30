package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func findTwoSum(arr []int, target int) []int {
	n := len(arr)
	for i := 0; i < n; i++ {
		for j := i + 1; j < n; j++ { // Start from i+1 to avoid using the same element twice
			if arr[i]+arr[j] == target {
				return []int{i, j}
			}
		}
	}
	return []int{} // Return empty slice if no pair is found
}

func main() {
	var arr []int

	scanner := bufio.NewScanner(os.Stdin)
	fmt.Printf("Enter array elements separated by space: ")
	if scanner.Scan() {
		line := scanner.Text()
		elements := strings.Fields(line)
		for _, el := range elements {
			num, err := strconv.Atoi(el)
			if err != nil {
				fmt.Println("Invalid input:", err)
				os.Exit(1)
			}
			arr = append(arr, num)
		}
	}

	var target int
	fmt.Printf("Enter the value of target element: ")
	if scanner.Scan() {
		target, _ = strconv.Atoi(scanner.Text())
	}

	fmt.Printf("Indexes of elements that sum up to target are: %v\n", findTwoSum(arr, target))
}
