(ns org.nd4j.linalg.api.ops.impl.shape.RollAxis
  "Transpose function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape RollAxis]))

(defn ->roll-axis
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`
  axis - `int`"
  (^RollAxis [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args ^Integer axis]
    (new RollAxis same-diff i-v shape in-place extra-args axis))
  (^RollAxis [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new RollAxis x y z n))
  (^RollAxis [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Integer axis]
    (new RollAxis same-diff i-v axis))
  (^RollAxis [^org.nd4j.autodiff.samediff.SameDiff same-diff ^Integer axis]
    (new RollAxis same-diff axis))
  (^RollAxis [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new RollAxis x))
  (^RollAxis []
    (new RollAxis )))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^RollAxis this]
    (-> this (.calculateOutputShape))))

(defn z
  "Description copied from interface: Op

  returns: the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RollAxis this]
    (-> this (.z))))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^RollAxis this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^RollAxis this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^RollAxis this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

(defn exec
  "Description copied from interface: Op

  dimensions - the dimensions to execute on - `int`"
  ([^RollAxis this ^Integer dimensions]
    (-> this (.exec dimensions)))
  ([^RollAxis this]
    (-> this (.exec))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^RollAxis this]
    (-> this (.opNum))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RollAxis this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RollAxis this]
    (-> this (.onnxName))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^RollAxis this]
    (-> this (.isExecSpecial))))

