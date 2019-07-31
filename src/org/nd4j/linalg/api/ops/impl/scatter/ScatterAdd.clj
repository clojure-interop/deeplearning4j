(ns org.nd4j.linalg.api.ops.impl.scatter.ScatterAdd
  "Created by farizrahman4u on 3/23/18."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scatter ScatterAdd]))

(defn ->scatter-add
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  ref - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  updates - `org.nd4j.autodiff.samediff.SDVariable`"
  (^ScatterAdd [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (new ScatterAdd same-diff ref indices updates))
  (^ScatterAdd []
    (new ScatterAdd )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ScatterAdd this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScatterAdd this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScatterAdd this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad-out - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScatterAdd this ^java.util.List grad-out]
    (-> this (.doDiff grad-out))))

