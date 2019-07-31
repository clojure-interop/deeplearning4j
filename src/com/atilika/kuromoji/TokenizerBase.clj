(ns com.atilika.kuromoji.TokenizerBase
  "TokenizerBase main class"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji TokenizerBase]))

(defn ->tokenizer-base
  "Constructor."
  (^TokenizerBase []
    (new TokenizerBase )))

(defn tokenize
  "text - `java.lang.String`

  returns: `java.util.List<? extends com.atilika.kuromoji.TokenBase>`"
  ([^TokenizerBase this ^java.lang.String text]
    (-> this (.tokenize text))))

(defn debug-tokenize
  "Tokenizes the provided text and outputs the corresponding Viterbi lattice and the Viterbi path to the provided output stream

  The output is written in DOT format.

  This method is not thread safe

  output-stream - output stream to write to - `java.io.OutputStream`
  text - text to tokenize - `java.lang.String`

  throws: java.io.IOException - if an error occurs when writing the lattice and path"
  ([^TokenizerBase this ^java.io.OutputStream output-stream ^java.lang.String text]
    (-> this (.debugTokenize output-stream text))))

(defn debug-lattice
  "Writes the Viterbi lattice for the provided text to an output stream

  The output is written in DOT format.

  This method is not thread safe

  output-stream - output stream to write to - `java.io.OutputStream`
  text - text to create lattice for - `java.lang.String`

  throws: java.io.IOException - if an error occurs when writing the lattice"
  ([^TokenizerBase this ^java.io.OutputStream output-stream ^java.lang.String text]
    (-> this (.debugLattice output-stream text))))

