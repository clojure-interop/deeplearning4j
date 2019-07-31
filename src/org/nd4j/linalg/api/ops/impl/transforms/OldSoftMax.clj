(ns org.nd4j.linalg.api.ops.impl.transforms.OldSoftMax
  "Soft max function
 row_maxes is a row vector (max for each row)
 row_maxes = rowmaxes(input)
 diff = exp(input - max) / diff.rowSums()
 Outputs a probability distribution.
 Note that this is a parameterized model and requires
 the sum and max for the vector being calculated"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms OldSoftMax]))

(defn ->old-soft-max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^OldSoftMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new OldSoftMax same-diff i-v shape in-place extra-args))
  (^OldSoftMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new OldSoftMax same-diff i-v-1 i-v-2 in-place))
  (^OldSoftMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new OldSoftMax same-diff i-v-1 i-v-2))
  (^OldSoftMax [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new OldSoftMax x z))
  (^OldSoftMax [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new OldSoftMax x))
  (^OldSoftMax []
    (new OldSoftMax )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^OldSoftMax this]
    (-> this (.opNum))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^OldSoftMax this]
    (-> this (.isExecSpecial))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^OldSoftMax this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldSoftMax this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldSoftMax this]
    (-> this (.tensorflowName))))

(defn exec
  "Description copied from interface: Op

  dimensions - the dimensions to execute on - `int`"
  ([^OldSoftMax this ^Integer dimensions]
    (-> this (.exec dimensions)))
  ([^OldSoftMax this]
    (-> this (.exec))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^OldSoftMax this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^OldSoftMax this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

