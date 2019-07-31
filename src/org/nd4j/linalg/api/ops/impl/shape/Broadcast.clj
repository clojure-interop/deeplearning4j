(ns org.nd4j.linalg.api.ops.impl.shape.Broadcast
  "Broadcast function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape Broadcast]))

(defn ->broadcast
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-x - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`"
  (^Broadcast [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-x shape]
    (new Broadcast same-diff i-x shape))
  (^Broadcast []
    (new Broadcast )))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^Broadcast this]
    (-> this (.calculateOutputShape))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Broadcast this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Broadcast this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Broadcast this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Broadcast this]
    (-> this (.tensorflowName))))

