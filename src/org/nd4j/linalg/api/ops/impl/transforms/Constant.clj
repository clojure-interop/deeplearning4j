(ns org.nd4j.linalg.api.ops.impl.transforms.Constant
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms Constant]))

(defn ->constant
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`"
  (^Constant [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape]
    (new Constant same-diff i-v shape))
  (^Constant []
    (new Constant )))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Constant this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

(defn dup
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.autodiff.functions.DifferentialFunction`"
  (^org.nd4j.autodiff.functions.DifferentialFunction [^Constant this]
    (-> this (.dup))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Constant this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Constant this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Constant this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Constant this]
    (-> this (.tensorflowName))))

