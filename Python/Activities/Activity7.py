list_of_numbers = list(input("Enter numbers separated by comma: ").split(","))

print(list_of_numbers)

sumTotal = 0
for number in list_of_numbers:
    sumTotal += int(number)

str(sumTotal)
print("The sum is " + str(sumTotal))