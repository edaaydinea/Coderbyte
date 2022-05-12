def FirstFactorial(num):

  # code goes here
  fact = 1
  for i in range(1,num+1):
    fact = fact * i
  return fact

# keep this function call here 
print(FirstFactorial(input()))
