(ns org.deeplearning4j.models.word2vec.VocabWork
  "Vocab work meant for use with the vocab actor"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec VocabWork]))

(defn ->vocab-work
  "Constructor.

  count - `java.util.concurrent.atomic.AtomicInteger`
  work - `java.lang.String`
  stem - `boolean`
  label - `java.lang.String`"
  (^VocabWork [^java.util.concurrent.atomic.AtomicInteger count ^java.lang.String work ^Boolean stem ^java.lang.String label]
    (new VocabWork count work stem label))
  (^VocabWork [^java.util.concurrent.atomic.AtomicInteger count ^java.lang.String work ^Boolean stem]
    (new VocabWork count work stem)))

(defn get-count
  "returns: `java.util.concurrent.atomic.AtomicInteger`"
  (^java.util.concurrent.atomic.AtomicInteger [^VocabWork this]
    (-> this (.getCount))))

(defn set-stem
  "stem - `boolean`"
  ([^VocabWork this ^Boolean stem]
    (-> this (.setStem stem))))

(defn increment
  ""
  ([^VocabWork this]
    (-> this (.increment))))

(defn set-count
  "count - `java.util.concurrent.atomic.AtomicInteger`"
  ([^VocabWork this ^java.util.concurrent.atomic.AtomicInteger count]
    (-> this (.setCount count))))

(defn get-work
  "returns: `java.lang.String`"
  (^java.lang.String [^VocabWork this]
    (-> this (.getWork))))

(defn get-label
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VocabWork this]
    (-> this (.getLabel))))

(defn stem?
  "returns: `boolean`"
  (^Boolean [^VocabWork this]
    (-> this (.isStem))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VocabWork this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VocabWork this ^java.lang.Object o]
    (-> this (.equals o))))

(defn set-label
  "label - `java.util.List`"
  ([^VocabWork this ^java.util.List label]
    (-> this (.setLabel label))))

(defn set-work
  "work - `java.lang.String`"
  ([^VocabWork this ^java.lang.String work]
    (-> this (.setWork work))))

