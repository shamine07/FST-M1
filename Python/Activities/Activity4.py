player1 = input("Enter name for Player 1: ")
player2 = input("Enter name for Player 2: ")

playAgain = True

while playAgain:

    player1Action = input(player1 + ", type your action. Rock, Paper or Scissors? ").lower()
    player2Action = input(player2 + ", type your action. Rock, Paper or Scissors? ").lower()

    if player1Action == player2Action:
        print("It's a tie!")
    elif player1Action == "rock" and player2Action == "paper":
        print(player2 + " beats " + player1)
    elif player1Action == "rock" and player2Action == "scissors":
        print(player1 + " beats " + player2)
    elif player1Action == "paper" and player2Action == "rock":
        print(player1 + " beats " + player2)
    elif player1Action == "paper" and player2Action == "scissors":
        print(player2 + " beats " + player1)
    elif player1Action == "scissors" and player2Action == "rock":
        print(player2 + " beats " + player1)
    elif player1Action == "scissors" and player2Action == "paper":
        print(player1 + " beats " + player2)
    else:
        print("Invalid input")

    playAgain = input("Do you wish to play again? (Y/N): ").lower()
    if playAgain == "n":
        print("Thanks for playing!")
        playAgain = False
    elif playAgain == "y":
        continue
    else:
        print("Invalid input. Closing game.")
        raise SystemExit