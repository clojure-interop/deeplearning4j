(ns org.datavec.api.writable.comparator.DoubleWritableComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.comparator DoubleWritableComparator]))

(defn ->double-writable-comparator
  "Constructor."
  (^DoubleWritableComparator []
    (new DoubleWritableComparator )))

(defn compare
  "o-1 - `org.datavec.api.writable.Writable`
  o-2 - `org.datavec.api.writable.Writable`

  returns: `int`"
  (^Integer [^DoubleWritableComparator this ^org.datavec.api.writable.Writable o-1 ^org.datavec.api.writable.Writable o-2]
    (-> this (.compare o-1 o-2))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DoubleWritableComparator this]
    (-> this (.toString))))

