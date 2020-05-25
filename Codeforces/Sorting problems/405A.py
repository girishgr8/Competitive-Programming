# Problem Link: https://codeforces.com/problemset/problem/405/A

n = int(input())
for i in sorted([int(i) for i in input().split()]):
  print(i, end=" ")