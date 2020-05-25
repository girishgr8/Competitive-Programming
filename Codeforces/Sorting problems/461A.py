# Problem Link: https://codeforces.com/problemset/problem/461/A

n = int(input())
#n,k = map(int,input().split())
a = sorted([int(i) for i in input().split()])

last = sum(a)
value = 0

for i in range(0,n):
  if i == n-1:
    value+=last
  else:
    value+= last+a[i]
  last = last-a[i]

print(value)