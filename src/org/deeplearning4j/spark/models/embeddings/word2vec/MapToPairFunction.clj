(ns org.deeplearning4j.spark.models.embeddings.word2vec.MapToPairFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec MapToPairFunction]))

(defn ->map-to-pair-function
  "Constructor."
  (^MapToPairFunction []
    (new MapToPairFunction )))

(defn call
  "pair - `java.util.Map.Entry`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.models.word2vec.VocabWord,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^MapToPairFunction this ^java.util.Map.Entry pair]
    (-> this (.call pair))))

