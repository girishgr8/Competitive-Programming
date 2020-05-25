# Problem Link: https://codeforces.com/problemset/problem/230/A

def customKey(obj):
  return obj.strength

class Dragon:
  def __init__(self, strength, bonus):
    self.strength = strength
    self.bonus = bonus
    self.defeated = False

s,n = map(int,input().split())
dragons = []
for i in range(n):
  strength,bonus = map(int, input().split())
  dragons.append(Dragon(strength,bonus))

dragons.sort(key=customKey)

loop = True
count = 0
while(loop):
  loop = False
  for i in range(len(dragons)):
    if dragons[i].strength<s and dragons[i].defeated==False:
      s+=dragons[i].bonus
      dragons[i].defeated = True
      count+=1
      loop = True

if count == len(dragons):
  print('YES')
else:
  print('NO')