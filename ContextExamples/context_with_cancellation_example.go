package main

import (
	"bufio"
	"context"
	"fmt"
	"os"
	"time"
)

func sleepAndTalk(ctx context.Context, t time.Duration, m string) {
	select {
	case <-time.After(t):
		fmt.Println(m)
	case <-ctx.Done():
		fmt.Println("Context cancelled")
	}
}
func main() {
	ctx := context.Background()
	ctx, cancel := context.WithCancel(ctx)
	go func() {
		s := bufio.NewScanner(os.Stdin)
		s.Scan()
		cancel()
	}()
	sleepAndTalk(ctx, 5*time.Second, "hello")
}
