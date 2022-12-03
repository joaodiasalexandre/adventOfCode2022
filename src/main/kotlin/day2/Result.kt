package day2

interface Result{
    val score: Int
}

object Win: Result{
    override val score: Int = 6
}

object Lose: Result{
    override val score: Int = 0
}

object Draw: Result{
    override val score: Int = 3
}