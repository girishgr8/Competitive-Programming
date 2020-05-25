# Problem Link: https://codeforces.com/problemset/problem/1041/A

n = int(input())
a = sorted([int(i) for i in input().split()])

total_diff = 0
for i in range(1,len(a)):
  total_diff += a[i]-a[i-1]-1

print(total_diff)