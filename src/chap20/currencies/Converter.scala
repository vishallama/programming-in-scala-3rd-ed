package chap20.currencies

object Converter {

  var exchangeRate = Map(
      "USD" -> Map(
          "USD" -> 1.0   , "EUR" -> 0.7596,
          "JPY" -> 1.21  , "CHF" -> 1.223),
      "EUR" -> Map(
          "USD" -> 1.316 , "EUR" -> 1.0   ,
          "JPY" -> 1.594 , "CHF" -> 1.623),
      "JPY" -> Map(
          "USD" -> 0.8257, "EUR" -> 0.6272,
          "JPY" -> 1.0   , "CHF" -> 1.018),
      "CHF" -> Map(
          "USD" -> 0.8108, "EUR" -> 0.6160,
          "JPY" -> 0.982 , "CHF" -> 1.0)
  )
}
