# Problem Link: https://codeforces.com/problemset/problem/546/B

n = int(input())
a = sorted([int(i) for i in input().split()])

cost = 0
for i in range(n-1):
  if a[i+1] <= a[i]:
    cost+=(a[i]-a[i+1]+1)
    a[i+1]+=(a[i]-a[i+1]+1)

print(cost)