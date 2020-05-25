n = int(input())
s = str(input())
print(n-2*(min(s.count('0'),s.count('1'))))