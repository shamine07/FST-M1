fruits_dictionary = {
    "mango": 20,
    "apple": 150,
    "banana": 12
}

check_fruit = input("Search fruit: ")

if check_fruit in fruits_dictionary:
    print("In stock!")
else:
    print("Out of stock!")