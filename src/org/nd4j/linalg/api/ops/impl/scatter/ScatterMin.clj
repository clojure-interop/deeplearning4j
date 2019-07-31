(ns org.nd4j.linalg.api.ops.impl.scatter.ScatterMin
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scatter ScatterMin]))

(defn ->scatter-min
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  ref - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  updates - `org.nd4j.autodiff.samediff.SDVariable`"
  (^ScatterMin [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (new ScatterMin same-diff ref indices updates))
  (^ScatterMin []
    (new ScatterMin )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ScatterMin this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScatterMin this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScatterMin this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad-out - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScatterMin this ^java.util.List grad-out]
    (-> this (.doDiff grad-out))))

