(ns org.deeplearning4j.models.node2vec.Node2Vec
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.node2vec Node2Vec]))

(defn ->node-2-vec
  "Constructor.

  Deprecated."
  (^Node2Vec []
    (new Node2Vec )))

(defn infer-vector
  "Deprecated.

  vertices - `java.util.Collection`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Node2Vec this ^java.util.Collection vertices]
    (-> this (.inferVector vertices))))

