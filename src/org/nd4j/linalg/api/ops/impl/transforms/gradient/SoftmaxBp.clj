(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.SoftmaxBp
  "Softmax backpropagation op - dL/dIn from in and dL/dOut"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient SoftmaxBp]))

(defn ->softmax-bp
  "Constructor.

  sd - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  dimension - `java.lang.Integer`"
  (^SoftmaxBp [^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable grad ^java.lang.Integer dimension]
    (new SoftmaxBp sd input grad dimension))
  (^SoftmaxBp []
    (new SoftmaxBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SoftmaxBp this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SoftmaxBp this ^java.util.List grad]
    (-> this (.doDiff grad))))

