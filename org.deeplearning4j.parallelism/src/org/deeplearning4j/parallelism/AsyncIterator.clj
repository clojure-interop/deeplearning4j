(ns org.deeplearning4j.parallelism.AsyncIterator
  "Asynchronous Iterator for better performance of iterators in dl4j-nn & dl4j-nlp"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism AsyncIterator]))

(defn ->async-iterator
  "Constructor.

  iterator - `java.util.Iterator`
  buffer-size - `int`"
  (^AsyncIterator [^java.util.Iterator iterator ^Integer buffer-size]
    (new AsyncIterator iterator buffer-size))
  (^AsyncIterator [^java.util.Iterator iterator]
    (new AsyncIterator iterator)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AsyncIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `T`"
  ([^AsyncIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^AsyncIterator this]
    (-> this (.remove))))

(defn shutdown
  ""
  ([^AsyncIterator this]
    (-> this (.shutdown))))

