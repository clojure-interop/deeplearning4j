(ns org.deeplearning4j.graph.models.deepwalk.DeepWalk$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.models.deepwalk DeepWalk$Builder]))

(defn ->builder
  "Constructor."
  (^DeepWalk$Builder []
    (new DeepWalk$Builder )))

(defn vector-size
  "Sets the size of the vectors to be learned for each vertex in the graph

  vector-size - `int`

  returns: `org.deeplearning4j.graph.models.deepwalk.DeepWalk$Builder<V,E>`"
  (^org.deeplearning4j.graph.models.deepwalk.DeepWalk$Builder [^DeepWalk$Builder this ^Integer vector-size]
    (-> this (.vectorSize vector-size))))

(defn learning-rate
  "Set the learning rate

  learning-rate - `double`

  returns: `org.deeplearning4j.graph.models.deepwalk.DeepWalk$Builder<V,E>`"
  (^org.deeplearning4j.graph.models.deepwalk.DeepWalk$Builder [^DeepWalk$Builder this ^Double learning-rate]
    (-> this (.learningRate learning-rate))))

(defn window-size
  "Sets the window size used in skipgram model

  window-size - `int`

  returns: `org.deeplearning4j.graph.models.deepwalk.DeepWalk$Builder<V,E>`"
  (^org.deeplearning4j.graph.models.deepwalk.DeepWalk$Builder [^DeepWalk$Builder this ^Integer window-size]
    (-> this (.windowSize window-size))))

(defn seed
  "Seed for random number generation (used for repeatability).
  Note however that parallel/async gradient descent might result in behaviour that
  is not repeatable, in spite of setting seed

  seed - `long`

  returns: `org.deeplearning4j.graph.models.deepwalk.DeepWalk$Builder<V,E>`"
  (^org.deeplearning4j.graph.models.deepwalk.DeepWalk$Builder [^DeepWalk$Builder this ^Long seed]
    (-> this (.seed seed))))

(defn build
  "returns: `org.deeplearning4j.graph.models.deepwalk.DeepWalk<V,E>`"
  (^org.deeplearning4j.graph.models.deepwalk.DeepWalk [^DeepWalk$Builder this]
    (-> this (.build))))

