(ns org.datavec.api.writable.comparator.FloatWritableComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.comparator FloatWritableComparator]))

(defn ->float-writable-comparator
  "Constructor."
  (^FloatWritableComparator []
    (new FloatWritableComparator )))

(defn compare
  "o-1 - `org.datavec.api.writable.Writable`
  o-2 - `org.datavec.api.writable.Writable`

  returns: `int`"
  (^Integer [^FloatWritableComparator this ^org.datavec.api.writable.Writable o-1 ^org.datavec.api.writable.Writable o-2]
    (-> this (.compare o-1 o-2))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FloatWritableComparator this]
    (-> this (.toString))))

