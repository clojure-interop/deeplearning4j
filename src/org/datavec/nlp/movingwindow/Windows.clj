(ns org.datavec.nlp.movingwindow.Windows
  "Static utility class for textual based windowing functions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.movingwindow Windows]))

(defn ->windows
  "Constructor."
  (^Windows []
    (new Windows )))

(defn *windows
  "Constructs a list of window of size windowSize.
  Note that padding for each window is created as well.

  words - the words to tokenize and construct windows from - `java.io.InputStream`
  tokenizer-factory - tokenizer factory to use - `org.datavec.nlp.tokenization.tokenizerfactory.TokenizerFactory`
  window-size - the window size to generate - `int`

  returns: the list of windows for the tokenized string - `java.util.List<org.datavec.nlp.movingwindow.Window>`"
  (^java.util.List [^java.io.InputStream words ^org.datavec.nlp.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory ^Integer window-size]
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

  returns: a window based on the given sentence - `org.datavec.nlp.movingwindow.Window`"
  (^org.datavec.nlp.movingwindow.Window [^Integer window-size ^Integer word-pos ^java.util.List sentence]
    (Windows/windowForWordInPosition window-size word-pos sentence)))

