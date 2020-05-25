# Problem Link: https://codeforces.com/problemset/problem/545/D

def solve(a):
  start = 0
  c = 0
  for i in a:
    if start<=i:
      c+=1
      start+=i
  print(c)
  return

n = int(input())
a = sorted([int(i) for i in input().split()])
solve(a)