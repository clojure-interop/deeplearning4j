(ns org.nd4j.linalg.api.ops.impl.shape.SizeAt
  "Returns the size of the input along given dimension as a rank 0 array"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape SizeAt]))

(defn ->size-at
  "Constructor.

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  output - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`"
  (^SizeAt [^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray output ^Integer dimension]
    (new SizeAt input output dimension))
  (^SizeAt [^org.nd4j.linalg.api.ndarray.INDArray input ^Integer dimension]
    (new SizeAt input dimension))
  (^SizeAt []
    (new SizeAt )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SizeAt this]
    (-> this (.opName))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^SizeAt this]
    (-> this (.opType))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SizeAt this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

