(ns org.datavec.api.writable.comparator.LongWritableComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.comparator LongWritableComparator]))

(defn ->long-writable-comparator
  "Constructor."
  (^LongWritableComparator []
    (new LongWritableComparator )))

(defn compare
  "o-1 - `org.datavec.api.writable.Writable`
  o-2 - `org.datavec.api.writable.Writable`

  returns: `int`"
  (^Integer [^LongWritableComparator this ^org.datavec.api.writable.Writable o-1 ^org.datavec.api.writable.Writable o-2]
    (-> this (.compare o-1 o-2))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LongWritableComparator this]
    (-> this (.toString))))

