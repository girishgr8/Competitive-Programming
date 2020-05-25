# Problem Link: https://codeforces.com/problemset/problem/149/A

k = int(input())
a = sorted([int(i) for i in input().split()], reverse=True)
months = 0
for i in a:
  if k>0:
    k-=i
    months+=1
  else:
    break

if k > 0:
  print(-1)
else:
  print(months)