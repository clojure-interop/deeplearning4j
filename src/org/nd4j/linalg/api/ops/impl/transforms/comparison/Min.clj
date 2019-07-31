(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.Min
  "Min function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison Min]))

(defn ->min
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  first - `org.nd4j.autodiff.samediff.SDVariable`
  second - `org.nd4j.autodiff.samediff.SDVariable`"
  (^Min [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable first ^org.nd4j.autodiff.samediff.SDVariable second]
    (new Min same-diff first second))
  (^Min [inputs outputs]
    (new Min inputs outputs))
  (^Min []
    (new Min )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Min this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Min this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Min this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Min this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

