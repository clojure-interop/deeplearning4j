(ns org.deeplearning4j.models.glove.AbstractCoOccurrences
  "This class implements building cooccurrence map for abstract training corpus.
 However it's performance rather low, due to exsessive IO that happens in ShadowCopyThread
 PLEASE NOTE: Current implementation involves massive IO, and it should be rewritter as soon as ND4j gets sparse arrays support"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove AbstractCoOccurrences]))

(defn get-co-occurrence-count
  "This method returns cooccurrence distance weights for two SequenceElements

  element-1 - `T`
  element-2 - `T`

  returns: distance weight - `double`"
  (^Double [^AbstractCoOccurrences this element-1 element-2]
    (-> this (.getCoOccurrenceCount element-1 element-2))))

(defn fit
  ""
  ([^AbstractCoOccurrences this]
    (-> this (.fit))))

(defn iterator
  "This method returns iterator with elements pairs and their weights. Resulting iterator is safe to use in multi-threaded environment.
  Developer's note: thread safety on received iterator is delegated to PrefetchedSentenceIterator

  returns: `java.util.Iterator<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.primitives.Pair<T,T>,java.lang.Double>>`"
  (^java.util.Iterator [^AbstractCoOccurrences this]
    (-> this (.iterator))))

