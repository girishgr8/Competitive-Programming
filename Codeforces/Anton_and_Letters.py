s = list(set(str(input()).strip(' ')))
new_list = []
for i in range(len(s)):
  if not(s[i] == '{' or s[i] == '}' or s[i] == ' ' or s[i]==','):
    new_list.append(s[i])
print(len(new_list))
