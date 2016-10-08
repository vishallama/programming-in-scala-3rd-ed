package chap07

object for_expressions {

	// Iteration through collections, filtering, nested iteration,
	// mid-stream variable bindings

	val filesHere = (new java.io.File(".")).listFiles

	def fileLines(file: java.io.File) =
		scala.io.Source.fromFile(file).getLines().toList

	def grep(pattern: String) =
		for {
			file <- filesHere
			if file.getName.endsWith(".scala")
			line <- fileLines(file)
			trimmed = line.trim
			if trimmed.matches(pattern)
		} println(file + ": " + trimmed)

	grep(".*.scala.*")

	// Producing a collection
	def scalaFiles =
		for {
			file <- filesHere
			if file.getName.endsWith(".scala")
		} yield file

	println(scalaFiles)

	// Transforming a collection
	val forLineLengths =
		for {
			file <- filesHere
			if file.getName.endsWith(".scala")
			line <- fileLines(file)
			trimmed = line.trim
			if trimmed.matches(".*for.*")
		} yield trimmed.length
}