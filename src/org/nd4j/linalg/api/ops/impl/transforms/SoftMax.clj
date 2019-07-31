(ns org.nd4j.linalg.api.ops.impl.transforms.SoftMax
  "Soft max function
 row_maxes is a row vector (max for each row)
 row_maxes = rowmaxes(input)
 diff = exp(input - max) / diff.rowSums()
 Outputs a probability distribution.
 Note that this is a parameterized model and requires
 the sum and max for the vector being calculated"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms SoftMax]))

(defn ->soft-max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^SoftMax [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new SoftMax same-diff args in-place))
  (^SoftMax [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new SoftMax same-diff args))
  (^SoftMax []
    (new SoftMax )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SoftMax this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SoftMax this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SoftMax this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SoftMax this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

