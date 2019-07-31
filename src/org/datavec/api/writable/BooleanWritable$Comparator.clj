(ns org.datavec.api.writable.BooleanWritable$Comparator
  "A Comparator optimized for BooleanWritable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable BooleanWritable$Comparator]))

(defn ->comparator
  "Constructor."
  (^BooleanWritable$Comparator []
    (new BooleanWritable$Comparator )))

(defn compare
  "Description copied from class: WritableComparator

  b-1 - `byte[]`
  s-1 - `int`
  l-1 - `int`
  b-2 - `byte[]`
  s-2 - `int`
  l-2 - `int`

  returns: `int`"
  (^Integer [^BooleanWritable$Comparator this b-1 ^Integer s-1 ^Integer l-1 b-2 ^Integer s-2 ^Integer l-2]
    (-> this (.compare b-1 s-1 l-1 b-2 s-2 l-2))))

