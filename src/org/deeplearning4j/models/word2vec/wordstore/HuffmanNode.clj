(ns org.deeplearning4j.models.word2vec.wordstore.HuffmanNode
  "Huffman tree node info, needed for w2v calculations.
 Used only in StandaloneWord2Vec internals."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.wordstore HuffmanNode]))

(defn ->huffman-node
  "Constructor.

  code - `byte[]`
  point - `int[]`
  index - `int`
  length - `byte`"
  (^HuffmanNode [code point ^Integer index ^Byte length]
    (new HuffmanNode code point index length))
  (^HuffmanNode []
    (new HuffmanNode )))

