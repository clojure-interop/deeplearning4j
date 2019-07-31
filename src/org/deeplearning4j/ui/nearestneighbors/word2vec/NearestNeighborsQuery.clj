(ns org.deeplearning4j.ui.nearestneighbors.word2vec.NearestNeighborsQuery
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.nearestneighbors.word2vec NearestNeighborsQuery]))

(defn ->nearest-neighbors-query
  "Constructor.

  word - `java.lang.String`
  num-words - `int`"
  (^NearestNeighborsQuery [^java.lang.String word ^Integer num-words]
    (new NearestNeighborsQuery word num-words))
  (^NearestNeighborsQuery []
    (new NearestNeighborsQuery )))

(defn get-word
  "returns: `java.lang.String`"
  (^java.lang.String [^NearestNeighborsQuery this]
    (-> this (.getWord))))

(defn set-word
  "word - `java.lang.String`"
  ([^NearestNeighborsQuery this ^java.lang.String word]
    (-> this (.setWord word))))

(defn get-num-words
  "returns: `int`"
  (^Integer [^NearestNeighborsQuery this]
    (-> this (.getNumWords))))

(defn set-num-words
  "num-words - `int`"
  ([^NearestNeighborsQuery this ^Integer num-words]
    (-> this (.setNumWords num-words))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NearestNeighborsQuery this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NearestNeighborsQuery this]
    (-> this (.hashCode))))

