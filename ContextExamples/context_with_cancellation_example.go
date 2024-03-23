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
		fmt.Println(ctx.Err())
	}
}
func withTimeout() {
	ctx := context.Background()
	ctx, cancel := context.WithTimeout(ctx, time.Second)
	defer cancel()
	sleepAndTalk(ctx, 5*time.Second, "Hello with Timeout")
}
func background() {
	ctx := context.Background()
	sleepAndTalk(ctx, 5*time.Second, "Hello with background")
}
func withCancel() {
	ctx := context.Background()
	ctx, cancel := context.WithCancel(ctx)
	go func() {
		s := bufio.NewScanner(os.Stdin)
		s.Scan()
		cancel()
	}()
	sleepAndTalk(ctx, 5*time.Second, "Hello with cancel")
}
func main() {
	background()
	withCancel()
	withTimeout()
}
