# Problem Link: https://codeforces.com/problemset/problem/37/A

n = int(input())
a = sorted([int(i) for i in input().split()])
u = set(a)
h = 1
for i in u:
  if h<a.count(i):
    h = a.count(i)

print(h,len(u))