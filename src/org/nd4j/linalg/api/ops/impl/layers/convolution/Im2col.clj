(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Im2col
  "Im2col operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Im2col]))

(defn ->im-2col
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input-functions - `org.nd4j.autodiff.samediff.SDVariable[]`
  input-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  conv-2-d-config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`"
  (^Im2col [^org.nd4j.autodiff.samediff.SameDiff same-diff input-functions input-arrays outputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig conv-2-d-config]
    (new Im2col same-diff input-functions input-arrays outputs conv-2-d-config))
  (^Im2col [^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (new Im2col sd input config))
  (^Im2col []
    (new Im2col )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Im2col this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Im2col this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Im2col this ^java.util.List grad]
    (-> this (.doDiff grad))))

