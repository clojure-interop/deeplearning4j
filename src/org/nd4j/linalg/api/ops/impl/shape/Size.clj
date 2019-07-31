(ns org.nd4j.linalg.api.ops.impl.shape.Size
  "Returns the size of the input as a rank 0 array"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape Size]))

(defn ->size
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`"
  (^Size [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input]
    (new Size same-diff input))
  (^Size []
    (new Size )))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Size this]
    (-> this (.onnxName))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Size this]
    (-> this (.opName))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Size this]
    (-> this (.opType))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Size this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

