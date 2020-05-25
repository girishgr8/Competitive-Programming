# Problem Link: https://codeforces.com/problemset/problem/766/B

def solve(a):
  for i in range(len(a)-2):
    if a[i]+a[i+1]>a[i+2] and a[i+1]+a[i+2]>a[i] and a[i]+a[i+2]>a[i]:
      print('YES')
      return
  print('NO')
  return

n = int(input())
a = sorted([int(i) for i in input().split()])
solve(a)
