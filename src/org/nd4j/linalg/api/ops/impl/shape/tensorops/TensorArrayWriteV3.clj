(ns org.nd4j.linalg.api.ops.impl.shape.tensorops.TensorArrayWriteV3
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape.tensorops TensorArrayWriteV3]))

(defn ->tensor-array-write-v-3
  "Constructor.

  name - `java.lang.String`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`"
  (^TensorArrayWriteV3 [^java.lang.String name ^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new TensorArrayWriteV3 name same-diff args))
  (^TensorArrayWriteV3 [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new TensorArrayWriteV3 same-diff args))
  (^TensorArrayWriteV3 []
    (new TensorArrayWriteV3 )))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayWriteV3 this]
    (-> this (.tensorflowName))))

(defn execute
  "same-diff - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `org.nd4j.list.compat.TensorList`"
  (^org.nd4j.list.compat.TensorList [^TensorArrayWriteV3 this ^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (-> this (.execute same-diff))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayWriteV3 this]
    (-> this (.opName))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^TensorArrayWriteV3 this]
    (-> this (.opType))))

