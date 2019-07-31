(ns org.datavec.api.util.files.ShuffledListIterator
  "A very simple iterator over a list, that takes an optional int[] for the order.
 If the order array is not present, elements are returned in sequential order."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.files ShuffledListIterator]))

(defn ->shuffled-list-iterator
  "Constructor.

  list - `java.util.List`
  order - `int[]`"
  (^ShuffledListIterator [^java.util.List list order]
    (new ShuffledListIterator list order)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^ShuffledListIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `T`"
  ([^ShuffledListIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^ShuffledListIterator this]
    (-> this (.remove))))

