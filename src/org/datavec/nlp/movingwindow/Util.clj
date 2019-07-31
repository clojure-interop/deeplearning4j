(ns org.datavec.nlp.movingwindow.Util
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.movingwindow Util]))

(defn ->util
  "Constructor."
  (^Util []
    (new Util )))

(defn *parallel-counter
  "Returns a thread safe counter

  returns: `org.nd4j.linalg.primitives.Counter<java.lang.String>`"
  (^org.nd4j.linalg.primitives.Counter []
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

