(ns org.datavec.local.transforms.sequence.LocalMapToPairByColumnFunction
  "Function to map a n example to a pair, by using one of the columns as the key."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.sequence LocalMapToPairByColumnFunction]))

(defn ->local-map-to-pair-by-column-function
  "Constructor."
  (^LocalMapToPairByColumnFunction []
    (new LocalMapToPairByColumnFunction )))

(defn apply
  "Description copied from interface: Function

  writables - Input - `java.util.List`

  returns: Result - `org.nd4j.linalg.primitives.Pair<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.nd4j.linalg.primitives.Pair [^LocalMapToPairByColumnFunction this ^java.util.List writables]
    (-> this (.apply writables))))

