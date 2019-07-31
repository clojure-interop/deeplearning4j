(ns org.deeplearning4j.text.movingwindow.ContextLabelRetriever
  "Context Label Retriever"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.movingwindow ContextLabelRetriever]))

(defn *string-with-labels
  "Returns a stripped sentence with the indices of words
  with certain kinds of labels.

  sentence - the sentence to process - `java.lang.String`
  tokenizer-factory - `org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory`

  returns: a pair of a post processed sentence
  with labels stripped and the spans of
  the labels - `org.nd4j.linalg.primitives.Pair<java.lang.String,org.nd4j.linalg.collection.MultiDimensionalMap<java.lang.Integer,java.lang.Integer,java.lang.String>>`"
  (^org.nd4j.linalg.primitives.Pair [^java.lang.String sentence ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory]
    (ContextLabelRetriever/stringWithLabels sentence tokenizer-factory)))

