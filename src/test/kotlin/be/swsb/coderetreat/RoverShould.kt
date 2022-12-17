package be.swsb.coderetreat

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class RoverShould{
    @Test
    fun beFacingNorthByDefault(){
        val defaultRover:  Rover = Rover()
        assertThat(defaultRover.facingDirection).isEqualTo(Direction.NORTH)
    }
    @Test
    fun bePositionedAt00(){
        val defaultRover: Rover = Rover()
        assertThat(defaultRover.position).isEqualTo(Position(0,0))
    }

}
