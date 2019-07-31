(ns org.nd4j.linalg.function.Supplier
  "A supplier of results with no input arguments"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.function Supplier]))

(defn get
  "returns: Result - `T`"
  ([^Supplier this]
    (-> this (.get))))

