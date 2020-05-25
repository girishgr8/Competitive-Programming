#Problem Link: https://codeforces.com/problemset/problem/432/A

n,k = map(int,input().split())
arr = sorted([int(i) for i in input().split()])
if n<3:
  print(0)
else:
  teams = 0
  for i in range(0,len(arr)-2,3):
    if 5-arr[i]>=k and 5-arr[i+1]>=k and 5-arr[i+2]>=k:
      teams+=1
  print(teams)
