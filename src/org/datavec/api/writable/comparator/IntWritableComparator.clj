(ns org.datavec.api.writable.comparator.IntWritableComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.comparator IntWritableComparator]))

(defn ->int-writable-comparator
  "Constructor."
  (^IntWritableComparator []
    (new IntWritableComparator )))

(defn compare
  "o-1 - `org.datavec.api.writable.Writable`
  o-2 - `org.datavec.api.writable.Writable`

  returns: `int`"
  (^Integer [^IntWritableComparator this ^org.datavec.api.writable.Writable o-1 ^org.datavec.api.writable.Writable o-2]
    (-> this (.compare o-1 o-2))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IntWritableComparator this]
    (-> this (.toString))))

