list1 = [2,1,1,3,2]  #1,1
list2 = [1,2,1,2,14]  #2,2

final_list = []

for i in list1:
    if i%2 != 0:
        final_list.append(i)

for i in list2:
    if i%2 == 0:
        final_list.append(i)


print("Final list is: " + str(final_list))