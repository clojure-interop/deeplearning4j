(ns org.deeplearning4j.models.word2vec.Huffman
  "Huffman tree builder"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec Huffman]))

(defn ->huffman
  "Constructor.

  Builds Huffman tree for collection of SequenceElements, with defined CODE_LENGTH
  Default CODE_LENGTH is 40

  words - `java.util.Collection`
  code-length - CODE_LENGTH defines maximum length of code path, and effectively limits vocabulary size. - `int`"
  (^Huffman [^java.util.Collection words ^Integer code-length]
    (new Huffman words code-length))
  (^Huffman [^java.util.Collection words]
    (new Huffman words)))

(defn max-code-length
  "Instance Constant.

  type: int"
  (^Integer [^Huffman this]
    (-> this .-MAX_CODE_LENGTH)))

(defn build
  ""
  ([^Huffman this]
    (-> this (.build))))

(defn apply-indexes
  "This method updates VocabCache and all it's elements with Huffman indexes
  Please note: it should be the same VocabCache as was used for Huffman tree initialization

  cache - VocabCache to be updated. - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  ([^Huffman this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache cache]
    (-> this (.applyIndexes cache))))

