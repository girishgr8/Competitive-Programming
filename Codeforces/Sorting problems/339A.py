# Problem Link: https://codeforces.com/problemset/problem/339/A

numbers = sorted(input().split('+'))
s = numbers[0]
for i in range(1,len(numbers)):
  s+='+'+numbers[i]
print(s)
