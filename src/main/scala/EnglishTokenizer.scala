object EnglishTokenizer {
  val pattern = "\\s+"
}

class EnglishTokenizer extends Tokenizer {
  override def tokenize(str: String) = {

    // kind of shitty (double traversal)
    val preprocessed = str.replaceAll("\\-\n+", "-")

    for (token <- preprocessed.split(EnglishTokenizer.pattern))
      yield token
  }

}
