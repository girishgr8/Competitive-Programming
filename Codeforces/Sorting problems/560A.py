# Problem Link: https://codeforces.com/problemset/problem/560/A

n = int(input())
a = [int(i) for i in input().split()]
if a.count(1) > 0:
  print(-1)
else:
  print(1)