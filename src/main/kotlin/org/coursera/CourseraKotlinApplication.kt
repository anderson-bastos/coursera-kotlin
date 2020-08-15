package org.coursera

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CourseraKotlinApplication

fun main(args: Array<String>) {
	runApplication<CourseraKotlinApplication>(*args)
}
