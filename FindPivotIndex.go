/*
	https://leetcode.com/problems/find-pivot-index/
	Difficulty: EASY
*/

package main

import "fmt"

var nums = []int{1, 7, 3, 6, 5, 6}

func main() {

	var solved bool = false
	var i int = 0

	for i < len(nums) {
		if i != 0 {
			var leftSum int = 0
			var rightSum int = 0

			var j int = 0
			for j < i {
				leftSum = leftSum + nums[j]
				j++
			}

			var k int = i + 1
			for k < len(nums) {
				rightSum = rightSum + nums[k]
				k++
			}

			if leftSum == rightSum {
				solved = true
				fmt.Println(i)
			}
		}

		i++
	}

	if !solved {
		fmt.Println(-1)
	}
}
