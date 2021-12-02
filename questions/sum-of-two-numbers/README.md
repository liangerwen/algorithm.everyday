# LeetCode-1.两数之和

> 题目来源：[LeetCode-1.两数之和](https://leetcode-cn.com/problems/two-sum/) 
>
> 题目难度：⭐

## 问题描述

给定一个整数数组nums和一个目标值target，请你在该数组中找出和为目标值的那**两个**整数，并返回他们的数组下标。你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍

示例：
1. 给定 nums = [2, 7, 11, 15], target = 9
2. 因为 nums[0] + nums[1] = 2 + 7 = 9
3. 所以返回 [0, 1]

## 简要分析

这个问题在理解上没有什么难点，主要就是给定一个数组和一个目标数target，其中每个元素至多使用一次，要求找到两个元素A和B，使得它们的和正好等于给定的target，返回这两个适格数字的下标。题目已经假定每个数组和target的组合只有有一个正确答案

## 题解

- [双重for循环法-Java实现](./solutions/double-for-in-java/)，最简单的解法，消耗也最大
- [字典遍历法-Java实现](./solutions/dict-check-in-java/)

## 总结

暂无
