package day2

enum class PlayerCodes {
    X,
    Y,
    Z;

    companion object {
        fun from(s: String): PlayerCodes = PlayerCodes.values().first{
            it.name == s
        }
    }
}