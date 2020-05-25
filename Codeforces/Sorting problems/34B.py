# Problem Link: https://codeforces.com/problemset/problem/34/B

n, m = map(int, input().split())
arr = [num for num in sorted([int(i) for i in input().split()]) if num < 0] 
profit=0
i=0
while(i<m and i<len(arr)):
  profit+=abs(arr[i])
  i+=1
print(profit)

