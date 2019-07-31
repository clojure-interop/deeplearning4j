(ns org.deeplearning4j.graph.models.deepwalk.DeepWalk
  "Implementation of the DeepWalk graph vectorization model, based on the paper
 DeepWalk: Online Learning of Social Representations by Perozzi, Al-Rfou & Skiena (2014),
 http://arxiv.org/abs/1403.6652
 Similar to word2vec in nature, DeepWalk is an unsupervised learning algorithm that learns a vector representation
 of each vertex in a graph. Vector representations are learned using walks (usually random walks) on the vertices in
 the graph.
 Once learned, these vector representations can then be used for purposes such as classification, clustering, similarity
 search, etc on the graph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.models.deepwalk DeepWalk]))

(defn ->deep-walk
  "Constructor."
  (^DeepWalk []
    (new DeepWalk )))

(def *-status-update-frequency
  "Static Constant.

  type: int"
  DeepWalk/STATUS_UPDATE_FREQUENCY)

(defn get-vector-size
  "returns: `int`"
  (^Integer [^DeepWalk this]
    (-> this (.getVectorSize))))

(defn get-window-size
  "returns: `int`"
  (^Integer [^DeepWalk this]
    (-> this (.getWindowSize))))

(defn get-learning-rate
  "returns: `double`"
  (^Double [^DeepWalk this]
    (-> this (.getLearningRate))))

(defn set-learning-rate
  "learning-rate - `double`"
  ([^DeepWalk this ^Double learning-rate]
    (-> this (.setLearningRate learning-rate))))

(defn initialize
  "Initialize the DeepWalk model with a given graph.

  graph - `org.deeplearning4j.graph.api.IGraph`"
  ([^DeepWalk this ^org.deeplearning4j.graph.api.IGraph graph]
    (-> this (.initialize graph))))

(defn fit
  "Fit the model, in parallel.
  This creates a set of GraphWalkIterators, which are then distributed one to each thread

  graph - Graph to fit - `org.deeplearning4j.graph.api.IGraph`
  walk-length - Length of rangom walks to generate - `int`"
  ([^DeepWalk this ^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length]
    (-> this (.fit graph walk-length)))
  ([^DeepWalk this ^org.deeplearning4j.graph.iterator.parallel.GraphWalkIteratorProvider iterator-provider]
    (-> this (.fit iterator-provider))))

(defn lookup-table
  "returns: `org.deeplearning4j.graph.models.embeddings.GraphVectorLookupTable`"
  (^org.deeplearning4j.graph.models.embeddings.GraphVectorLookupTable [^DeepWalk this]
    (-> this (.lookupTable))))

