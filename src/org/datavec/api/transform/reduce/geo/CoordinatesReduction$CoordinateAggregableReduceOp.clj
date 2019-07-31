(ns org.datavec.api.transform.reduce.geo.CoordinatesReduction$CoordinateAggregableReduceOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.reduce.geo CoordinatesReduction$CoordinateAggregableReduceOp]))

(defn ->coordinate-aggregable-reduce-op
  "Constructor.

  n - `int`
  initial-op - `org.nd4j.linalg.function.Supplier`
  delim - `java.lang.String`"
  (^CoordinatesReduction$CoordinateAggregableReduceOp [^Integer n ^org.nd4j.linalg.function.Supplier initial-op ^java.lang.String delim]
    (new CoordinatesReduction$CoordinateAggregableReduceOp n initial-op delim)))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>> void`"
  ([^CoordinatesReduction$CoordinateAggregableReduceOp this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  writable - Input - `org.datavec.api.writable.Writable`"
  ([^CoordinatesReduction$CoordinateAggregableReduceOp this ^org.datavec.api.writable.Writable writable]
    (-> this (.accept writable))))

(defn get
  "returns: Result - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^CoordinatesReduction$CoordinateAggregableReduceOp this]
    (-> this (.get))))

