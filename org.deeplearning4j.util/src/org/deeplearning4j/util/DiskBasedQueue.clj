(ns org.deeplearning4j.util.DiskBasedQueue
  "Naive disk based queue for storing items on disk.
 Only meant for poll and adding items."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util DiskBasedQueue]))

(defn ->disk-based-queue
  "Constructor.

  path - `java.lang.String`"
  (^DiskBasedQueue [^java.lang.String path]
    (new DiskBasedQueue path))
  (^DiskBasedQueue []
    (new DiskBasedQueue )))

(defn add-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^DiskBasedQueue this ^java.util.Collection c]
    (-> this (.addAll c))))

(defn peek
  "returns: `E`"
  ([^DiskBasedQueue this]
    (-> this (.peek))))

(defn offer
  "e - `E`

  returns: `boolean`"
  (^Boolean [^DiskBasedQueue this e]
    (-> this (.offer e))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskBasedQueue this ^java.lang.Object o]
    (-> this (.contains o))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^DiskBasedQueue this]
    (-> this (.iterator))))

(defn element
  "returns: `E`"
  ([^DiskBasedQueue this]
    (-> this (.element))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskBasedQueue this ^java.lang.Object o]
    (-> this (.remove o)))
  ([^DiskBasedQueue this]
    (-> this (.remove))))

(defn poll
  "returns: `E`"
  ([^DiskBasedQueue this]
    (-> this (.poll))))

(defn add
  "e - `E`

  returns: `boolean`"
  (^Boolean [^DiskBasedQueue this e]
    (-> this (.add e))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^DiskBasedQueue this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^DiskBasedQueue this]
    (-> this (.size))))

(defn retain-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^DiskBasedQueue this ^java.util.Collection c]
    (-> this (.retainAll c))))

(defn clear
  ""
  ([^DiskBasedQueue this]
    (-> this (.clear))))

(defn to-array
  "a - `T[]`

  returns: `<T> T[]`"
  ([^DiskBasedQueue this a]
    (-> this (.toArray a)))
  ([^DiskBasedQueue this]
    (-> this (.toArray))))

(defn remove-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^DiskBasedQueue this ^java.util.Collection c]
    (-> this (.removeAll c))))

(defn contains-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^DiskBasedQueue this ^java.util.Collection c]
    (-> this (.containsAll c))))

