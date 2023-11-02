package ConsoleProjects.GuessingGame

class GuessingGame {
    fun startGame() {
        var guess: Int
        var number: Int
        var count = 0
        var playAgain: String

        do {
            number = (Math.random() * 100).toInt()
            println("Guess a number between 0 and 100")

            do {
                print("Enter your guess: ")
                guess = readLine()!!.toInt()
                count++
                if(guess > number) {
                    println("Too high")
                } else if(guess < number) {
                    println("Too low")
                } else {
                    println("You got it!!!")
                    println("You took $count guesses")
                }
            } while(guess != number)
            print("Do you want to play again? (y/n): ")
            playAgain = readLine()!!.toLowerCase()

        } while(playAgain == "y")
    }
}