package chap07

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object try_expressions {

	// An exception throw has type Nothing. You can use a throw as an
	// expression even though it will never actually evaluate to anything.

	val n = 4
	val half =
		if (n % 2 == 0)
			n / 2
		else
			throw new RuntimeException("n must be even")

	// Catching exceptions
	try {
		val file = new FileReader("input.txt")
		// Use and close file
	} catch {
		case ex: FileNotFoundException => "File not found"
		case ex: IOException => "I/O error"
	} finally {
		"Can't determine the exception"
	}
}
