package ConsoleProjects.GuessingGame

class Main {
    companion object {
        @JvmStatic
        fun main(agrs: Array<String>)
        {
            var game = GuessingGame()
            game.startGame()
        }
    }
}