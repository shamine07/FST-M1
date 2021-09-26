my_tuple = tuple(input("Enter a range of numbers separated by comma: ").split(","))
print(my_tuple)

#new_list = []
for number in my_tuple:
    if int(number)%5 == 0:
        print(number)

#print("List of numbers divisible by 5 are: " + str(new_list))