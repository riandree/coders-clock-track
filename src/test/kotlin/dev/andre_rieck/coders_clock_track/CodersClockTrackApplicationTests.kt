package dev.andre_rieck.coders_clock_track

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersConfiguration::class)
@SpringBootTest
class CodersClockTrackApplicationTests {

	@Test
	fun contextLoads() {
	}

}
