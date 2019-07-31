(ns org.deeplearning4j.spark.text.functions.TokenizerFunction
  "Tokenizer function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.functions TokenizerFunction]))

(defn ->tokenizer-function
  "Constructor.

  tokenizer - `java.lang.String`
  tokenizer-preprocessor - `java.lang.String`
  n-grams - `int`"
  (^TokenizerFunction [^java.lang.String tokenizer ^java.lang.String tokenizer-preprocessor ^Integer n-grams]
    (new TokenizerFunction tokenizer tokenizer-preprocessor n-grams)))

(defn call
  "v-1 - `java.lang.String`

  returns: `java.util.List<java.lang.String>`

  throws: java.lang.Exception"
  (^java.util.List [^TokenizerFunction this ^java.lang.String v-1]
    (-> this (.call v-1))))

