(ns org.datavec.local.transforms.reduce.MapToPairForReducerFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.reduce MapToPairForReducerFunction]))

(defn ->map-to-pair-for-reducer-function
  "Constructor."
  (^MapToPairForReducerFunction []
    (new MapToPairForReducerFunction )))

(def *-global-key
  "Static Constant.

  type: java.lang.String"
  MapToPairForReducerFunction/GLOBAL_KEY)

(defn apply
  "Description copied from interface: Function

  writables - Input - `java.util.List`

  returns: Result - `org.nd4j.linalg.primitives.Pair<java.lang.String,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.nd4j.linalg.primitives.Pair [^MapToPairForReducerFunction this ^java.util.List writables]
    (-> this (.apply writables))))

