(ns org.deeplearning4j.graph.models.embeddings.GraphVectorLookupTable
  "Lookup table for vector representations of the vertices in a graph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.models.embeddings GraphVectorLookupTable]))

(defn vector-size
  "The size of the vector representations

  returns: `int`"
  (^Integer [^GraphVectorLookupTable this]
    (-> this (.vectorSize))))

(defn reset-weights
  "Reset (randomize) the weights."
  ([^GraphVectorLookupTable this]
    (-> this (.resetWeights))))

(defn iterate
  "Conduct learning given a pair of vertices (in and out)

  first - `int`
  second - `int`"
  ([^GraphVectorLookupTable this ^Integer first ^Integer second]
    (-> this (.iterate first second))))

(defn get-vector
  "Get the vector for the vertex with index idx

  idx - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GraphVectorLookupTable this ^Integer idx]
    (-> this (.getVector idx))))

(defn set-learning-rate
  "Set the learning rate

  learning-rate - `double`"
  ([^GraphVectorLookupTable this ^Double learning-rate]
    (-> this (.setLearningRate learning-rate))))

(defn get-num-vertices
  "Returns the number of vertices in the graph

  returns: `int`"
  (^Integer [^GraphVectorLookupTable this]
    (-> this (.getNumVertices))))

