# Problem Link: https://codeforces.com/problemset/problem/459/B

n = int(input())
a = sorted([int(i) for i in input().split()])
if a.count(a[0])==n:
  print(0,n*(n-1)//2)
else:
  print(a[-1]-a[0], (a.count(a[0])* a.count(a[-1])))