package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	fmt.Println("Enter the array elements separated by space: ")
	scanner := bufio.NewScanner(os.Stdin)
	if scanner.Scan() {
		line := scanner.Text()
		arr := parseInts(line)
		moveZeros(arr)
		fmt.Printf("Value of array after moving zeros to end is %v\n", arr)
	}

}
func moveZeros(arr []int) {
	temp := make([]int, 0)
	n := len(arr)
	for i := 0; i < n; i++ {
		if arr[i] != 0 {
			temp = append(temp, arr[i])
		}
	}
	for i := 0; i < len(temp); i++ {
		arr[i] = temp[i]
	}
	for i := len(temp); i < n; i++ {
		arr[i] = 0
	}
}
func parseInts(s string) []int {
	strArr := strings.Fields(s)
	arr := make([]int, len(strArr))
	for i, str := range strArr {
		num, err := strconv.Atoi(str)
		if err != nil {
			fmt.Println("Invalid input.Please enter integers separated by space.")
			os.Exit(1)
		}
		arr[i] = num
	}
	return arr
}
