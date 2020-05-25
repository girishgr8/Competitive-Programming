# Problem Link: https://codeforces.com/problemset/problem/580/A

n = int(input())
arr = [int(i) for i in input().split()]
subsegment = [1]*n
last = 0
for i in range(len(arr)):
  if i == 0:
    continue
  else:
    if arr[i]>=arr[i-1]:
      subsegment[i]=subsegment[i-1]+1
    else:
      subsegment[i]=1
print(max(subsegment))

