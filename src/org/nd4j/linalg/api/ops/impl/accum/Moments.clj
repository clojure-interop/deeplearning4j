(ns org.nd4j.linalg.api.ops.impl.accum.Moments
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum Moments]))

(defn ->moments
  "Constructor.

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  out-mean - `org.nd4j.linalg.api.ndarray.INDArray`
  out-std - `org.nd4j.linalg.api.ndarray.INDArray`
  axes - `int`"
  (^Moments [^org.nd4j.linalg.api.ndarray.INDArray in ^org.nd4j.linalg.api.ndarray.INDArray out-mean ^org.nd4j.linalg.api.ndarray.INDArray out-std ^Integer axes]
    (new Moments in out-mean out-std axes))
  (^Moments [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input axes]
    (new Moments same-diff input axes))
  (^Moments [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input]
    (new Moments same-diff input)))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Moments this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Moments this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Moments this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Moments this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Moments this ^java.util.List grad]
    (-> this (.doDiff grad))))

