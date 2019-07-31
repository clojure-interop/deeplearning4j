(ns org.datavec.api.writable.comparator.TextWritableComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.comparator TextWritableComparator]))

(defn ->text-writable-comparator
  "Constructor."
  (^TextWritableComparator []
    (new TextWritableComparator )))

(defn compare
  "o-1 - `org.datavec.api.writable.Writable`
  o-2 - `org.datavec.api.writable.Writable`

  returns: `int`"
  (^Integer [^TextWritableComparator this ^org.datavec.api.writable.Writable o-1 ^org.datavec.api.writable.Writable o-2]
    (-> this (.compare o-1 o-2))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TextWritableComparator this]
    (-> this (.toString))))

