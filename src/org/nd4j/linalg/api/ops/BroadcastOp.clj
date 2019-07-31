(ns org.nd4j.linalg.api.ops.BroadcastOp
  "A broad cast op is one where a scalar
 or less rank array
 is broadcast to fill
 a bigg er array.
 A typical broad cast operation would be adding a row to
 each row in a matrix."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops BroadcastOp]))

(defn get-dimension
  "Dimension to do the vector op along. Along dimension 1 for row vector ops, along 0 for column vector ops

  returns: `int[]`"
  ([^BroadcastOp this]
    (-> this (.getDimension))))

(defn set-dimension
  "Set the dimension for the vector op.

  dimension - `int`"
  ([^BroadcastOp this ^Integer dimension]
    (-> this (.setDimension dimension))))

