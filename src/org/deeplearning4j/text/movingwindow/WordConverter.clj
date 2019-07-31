(ns org.deeplearning4j.text.movingwindow.WordConverter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.movingwindow WordConverter]))

(defn ->word-converter
  "Constructor.

  sentences - `java.util.List`
  vec - `org.deeplearning4j.models.word2vec.Word2Vec`"
  (^WordConverter [^java.util.List sentences ^org.deeplearning4j.models.word2vec.Word2Vec vec]
    (new WordConverter sentences vec)))

(defn *to-input-matrix
  "windows - `java.util.List`
  vec - `org.deeplearning4j.models.word2vec.Word2Vec`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.List windows ^org.deeplearning4j.models.word2vec.Word2Vec vec]
    (WordConverter/toInputMatrix windows vec)))

(defn *to-label-matrix
  "labels - `java.util.List`
  windows - `java.util.List`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.List labels ^java.util.List windows]
    (WordConverter/toLabelMatrix labels windows)))

(defn to-input-matrix
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WordConverter this]
    (-> this (.toInputMatrix))))

(defn to-label-matrix
  "labels - `java.util.List`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WordConverter this ^java.util.List labels]
    (-> this (.toLabelMatrix labels))))

