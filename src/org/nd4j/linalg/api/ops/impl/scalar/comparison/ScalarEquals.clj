(ns org.nd4j.linalg.api.ops.impl.scalar.comparison.ScalarEquals
  "Return a binary (0 or 1) when greater than a number"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scalar.comparison ScalarEquals]))

(defn ->scalar-equals
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`
  num - `java.lang.Number`"
  (^ScalarEquals [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^java.lang.Number num]
    (new ScalarEquals x y z n num))
  (^ScalarEquals [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar ^Boolean in-place]
    (new ScalarEquals same-diff i-v scalar in-place))
  (^ScalarEquals [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar]
    (new ScalarEquals same-diff i-v scalar))
  (^ScalarEquals [^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.Number num]
    (new ScalarEquals x num))
  (^ScalarEquals [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new ScalarEquals x))
  (^ScalarEquals []
    (new ScalarEquals )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ScalarEquals this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ScalarEquals this]
    (-> this (.opName))))

(defn get-dimension
  "Description copied from interface: BroadcastOp

  returns: `int[]`"
  ([^ScalarEquals this]
    (-> this (.getDimension))))

(defn set-dimension
  "Description copied from interface: BroadcastOp

  dimension - `int`"
  ([^ScalarEquals this ^Integer dimension]
    (-> this (.setDimension dimension))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScalarEquals this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarEquals this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarEquals this]
    (-> this (.tensorflowName))))

