(ns org.datavec.api.transform.reduce.impl.GeographicMidpointReduction$AverageCoordinateReduceOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.reduce.impl GeographicMidpointReduction$AverageCoordinateReduceOp]))

(defn ->average-coordinate-reduce-op
  "Constructor.

  delim - `java.lang.String`"
  (^GeographicMidpointReduction$AverageCoordinateReduceOp [^java.lang.String delim]
    (new GeographicMidpointReduction$AverageCoordinateReduceOp delim)))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>> void`"
  ([^GeographicMidpointReduction$AverageCoordinateReduceOp this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  writable - Input - `org.datavec.api.writable.Writable`"
  ([^GeographicMidpointReduction$AverageCoordinateReduceOp this ^org.datavec.api.writable.Writable writable]
    (-> this (.accept writable))))

(defn get
  "returns: Result - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^GeographicMidpointReduction$AverageCoordinateReduceOp this]
    (-> this (.get))))

