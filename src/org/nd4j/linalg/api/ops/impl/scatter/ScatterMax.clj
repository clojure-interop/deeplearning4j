(ns org.nd4j.linalg.api.ops.impl.scatter.ScatterMax
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scatter ScatterMax]))

(defn ->scatter-max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  ref - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  updates - `org.nd4j.autodiff.samediff.SDVariable`"
  (^ScatterMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (new ScatterMax same-diff ref indices updates))
  (^ScatterMax []
    (new ScatterMax )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ScatterMax this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScatterMax this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScatterMax this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad-out - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScatterMax this ^java.util.List grad-out]
    (-> this (.doDiff grad-out))))

