# Problem Link: https://codeforces.com/problemset/problem/490/A

n = int(input())
arr = [int(i) for i in input().split()]
teams = min(arr.count(1),min(arr.count(2),arr.count(3)))
print(teams)
if not(teams==0):
  ones = 0
  twos = 0
  threes = 0
  while(teams>0):
    ones = arr.index(1,ones,n)+1
    twos = arr.index(2,twos,n)+1
    threes = arr.index(3,threes,n)+1
    print(ones,twos,threes)
    teams-=1