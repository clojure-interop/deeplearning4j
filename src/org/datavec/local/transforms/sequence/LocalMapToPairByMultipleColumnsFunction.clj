(ns org.datavec.local.transforms.sequence.LocalMapToPairByMultipleColumnsFunction
  "Function to map an example to a pair, by using some of the column values as the key."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.sequence LocalMapToPairByMultipleColumnsFunction]))

(defn ->local-map-to-pair-by-multiple-columns-function
  "Constructor."
  (^LocalMapToPairByMultipleColumnsFunction []
    (new LocalMapToPairByMultipleColumnsFunction )))

(defn apply
  "Description copied from interface: Function

  writables - Input - `java.util.List`

  returns: Result - `org.nd4j.linalg.primitives.Pair<java.util.List<org.datavec.api.writable.Writable>,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.nd4j.linalg.primitives.Pair [^LocalMapToPairByMultipleColumnsFunction this ^java.util.List writables]
    (-> this (.apply writables))))

