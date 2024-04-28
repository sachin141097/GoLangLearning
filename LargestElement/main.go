package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func findLargest(arr []int) int {
	largest := arr[0]
	for _, num := range arr {
		if num > largest {
			largest = num
		}
	}
	return largest
}

func main() {
	fmt.Print("Enter the array elements separated by space: ")
	scanner := bufio.NewScanner(os.Stdin)
	if scanner.Scan() {
		inputStr := scanner.Text()
		strArr := strings.Split(inputStr, " ")
		var arr []int
		for _, str := range strArr {
			num, err := strconv.Atoi(str)
			if err != nil {
				fmt.Println(err)
				fmt.Println("Invalid input. Please enter integers separated by space.")
				return
			}
			arr = append(arr, num)
		}
		largest := findLargest(arr)
		fmt.Printf("The largest element in the array is %d\n", largest)
	}
}
