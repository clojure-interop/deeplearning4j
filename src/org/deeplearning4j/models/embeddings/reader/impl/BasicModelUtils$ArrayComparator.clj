(ns org.deeplearning4j.models.embeddings.reader.impl.BasicModelUtils$ArrayComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.reader.impl BasicModelUtils$ArrayComparator]))

(defn ->array-comparator
  "Constructor."
  (^BasicModelUtils$ArrayComparator []
    (new BasicModelUtils$ArrayComparator )))

(defn compare
  "o-1 - `java.lang.Double[]`
  o-2 - `java.lang.Double[]`

  returns: `int`"
  (^Integer [^BasicModelUtils$ArrayComparator this o-1 o-2]
    (-> this (.compare o-1 o-2))))

