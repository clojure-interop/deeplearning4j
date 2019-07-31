(ns org.deeplearning4j.text.movingwindow.Windows
  "Static utility class for textual based windowing cooccurrences"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.movingwindow Windows]))

(defn *windows
  "Constructs a list of window of size windowSize.
  Note that padding for each window is created as well.

  words - the words to tokenize and construct windows from - `java.lang.String`
  tokenizer-factory - tokenizer factory to use - `org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory`
  window-size - the window size to generate - `int`
  vectors - `org.deeplearning4j.models.embeddings.wordvectors.WordVectors`

  returns: the list of windows for the tokenized string - `java.util.List<org.deeplearning4j.text.movingwindow.Window>`"
  (^java.util.List [^java.lang.String words ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory ^Integer window-size ^org.deeplearning4j.models.embeddings.wordvectors.WordVectors vectors]
    (Windows/windows words tokenizer-factory window-size vectors))
  (^java.util.List [^java.io.InputStream words ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory ^Integer window-size]
    (Windows/windows words tokenizer-factory window-size))
  (^java.util.List [^java.io.InputStream words ^Integer window-size]
    (Windows/windows words window-size))
  (^java.util.List [^java.lang.String words]
    (Windows/windows words)))

(defn *window-for-word-in-position
  "Creates a sliding window from text

  window-size - the window size to use - `int`
  word-pos - the position of the word to center - `int`
  sentence - the sentence to createComplex a window for - `java.util.List`

  returns: a window based on the given sentence - `org.deeplearning4j.text.movingwindow.Window`"
  (^org.deeplearning4j.text.movingwindow.Window [^Integer window-size ^Integer word-pos ^java.util.List sentence]
    (Windows/windowForWordInPosition window-size word-pos sentence)))

