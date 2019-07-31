(ns org.nd4j.linalg.api.ops.impl.shape.GatherNd
  "GatherND op"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape GatherNd]))

(defn ->gather-nd
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^GatherNd [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable indices ^Boolean in-place]
    (new GatherNd same-diff input indices in-place)))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^GatherNd this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GatherNd this]
    (-> this (.onnxName))))

(defn tensorflow-names
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String[]`"
  ([^GatherNd this]
    (-> this (.tensorflowNames))))

