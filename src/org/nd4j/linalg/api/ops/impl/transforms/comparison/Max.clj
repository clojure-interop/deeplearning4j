(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.Max
  "Max function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison Max]))

(defn ->max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  first - `org.nd4j.autodiff.samediff.SDVariable`
  second - `org.nd4j.autodiff.samediff.SDVariable`"
  (^Max [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable first ^org.nd4j.autodiff.samediff.SDVariable second]
    (new Max same-diff first second))
  (^Max [inputs outputs]
    (new Max inputs outputs))
  (^Max []
    (new Max )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Max this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Max this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Max this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Max this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

