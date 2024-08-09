package dev.andre_rieck.coders_clock_track

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<CodersClockTrackApplication>().with(TestcontainersConfiguration::class).run(*args)
}
