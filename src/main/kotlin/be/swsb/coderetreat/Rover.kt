package be.swsb.coderetreat


class Rover(val facingDirection: Direction = Direction.NORTH,
            val position: Position = Position(0,0)) {
}

enum class Direction{
    NORTH
}
