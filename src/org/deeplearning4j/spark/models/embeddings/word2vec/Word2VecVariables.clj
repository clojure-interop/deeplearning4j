(ns org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecVariables
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec Word2VecVariables]))

(def *-name-space
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/NAME_SPACE)

(def *-vector-length
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/VECTOR_LENGTH)

(def *-adagrad
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/ADAGRAD)

(def *-negative
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/NEGATIVE)

(def *-num-words
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/NUM_WORDS)

(def *-table
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/TABLE)

(def *-window
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/WINDOW)

(def *-alpha
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/ALPHA)

(def *-min-alpha
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/MIN_ALPHA)

(def *-iterations
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/ITERATIONS)

(def *-n-grams
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/N_GRAMS)

(def *-tokenizer
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/TOKENIZER)

(def *-token-preprocessor
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/TOKEN_PREPROCESSOR)

(def *-remove-stopwords
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/REMOVE_STOPWORDS)

(def *-seed
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecVariables/SEED)

(def *-default-vals
  "Static Constant.

  Deprecated.

  type: java.util.Map<java.lang.String,java.lang.Object>"
  Word2VecVariables/defaultVals)

(defn *get-default
  "Deprecated.

  variable-name - `java.lang.String`

  returns: `<T> T`"
  ([^java.lang.String variable-name]
    (Word2VecVariables/getDefault variable-name)))

(defn *assign-var
  "Deprecated.

  variable-name - `java.lang.String`
  conf - `org.apache.spark.SparkConf`
  clazz - `java.lang.Class`

  returns: `<T> T`

  throws: java.lang.Exception"
  ([^java.lang.String variable-name ^org.apache.spark.SparkConf conf ^java.lang.Class clazz]
    (Word2VecVariables/assignVar variable-name conf clazz)))

