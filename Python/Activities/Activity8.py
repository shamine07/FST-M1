list_of_numbers = list(input("Enter comma separated numbers: ").split(","))

listLength = len(list_of_numbers)
print(listLength)

if list_of_numbers[0] == list_of_numbers[-1]:
    print(True)
else:
    print(False)
