(ns org.nd4j.linalg.api.iter.LinearIndexLookup
  "Represents a cache linear index lookup"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.iter LinearIndexLookup]))

(defn ->linear-index-lookup
  "Constructor.

  shape - the shape of the linear index - `int[]`
  ordering - the ordering of the linear index - `char`"
  (^LinearIndexLookup [shape ^Character ordering]
    (new LinearIndexLookup shape ordering)))

(defn lookup
  "Give back a sub
  wrt the given linear index

  index - the index - `int`

  returns: the sub for the given index - `long[]`"
  ([^LinearIndexLookup this ^Integer index]
    (-> this (.lookup index))))

