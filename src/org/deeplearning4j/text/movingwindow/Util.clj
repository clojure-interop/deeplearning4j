(ns org.deeplearning4j.text.movingwindow.Util
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.movingwindow Util]))

(defn *parallel-counter-map
  "Returns a thread safe counter map

  returns: `<K,V> org.nd4j.linalg.primitives.CounterMap<K,V>`"
  ([]
    (Util/parallelCounterMap )))

(defn *parallel-counter
  "Returns a thread safe counter

  returns: `<K> org.nd4j.linalg.primitives.Counter<K>`"
  ([]
    (Util/parallelCounter )))

(defn *matches-any-stop-word
  "stop-words - `java.util.List`
  word - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.util.List stop-words ^java.lang.String word]
    (Util/matchesAnyStopWord stop-words word)))

(defn *disable-logging
  "returns: `java.util.logging.Level`"
  (^java.util.logging.Level []
    (Util/disableLogging )))

