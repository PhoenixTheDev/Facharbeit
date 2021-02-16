import random
n = 10
input_values = [random.randint(0, 10000000) for _ in range(n)]


def quicksort(list):
  if len(list) <= 1:
    return list

  left = []
  right = []
  equal = []

  pivot = list[0]
  for x in list:
    if x > pivot:
      right.append(x)
    elif x < pivot:
      left.append(x)
    else:
      equal.append(x)
  return quicksort(left) + equal + quicksort(right)
