(ns org.datavec.api.writable.comparator.ReverseComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.comparator ReverseComparator]))

(defn ->reverse-comparator
  "Constructor."
  (^ReverseComparator []
    (new ReverseComparator )))

(defn compare
  "o-1 - `T`
  o-2 - `T`

  returns: `int`"
  (^Integer [^ReverseComparator this o-1 o-2]
    (-> this (.compare o-1 o-2))))

