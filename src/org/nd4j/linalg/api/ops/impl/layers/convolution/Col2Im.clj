(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Col2Im
  "Col2Im operation.
 Created by agibsonccc on 3/9/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Col2Im]))

(defn ->col-2-im
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input-functions - `org.nd4j.autodiff.samediff.SDVariable[]`
  input-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  conv-2-d-config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`"
  (^Col2Im [^org.nd4j.autodiff.samediff.SameDiff same-diff input-functions input-arrays outputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig conv-2-d-config]
    (new Col2Im same-diff input-functions input-arrays outputs conv-2-d-config))
  (^Col2Im [^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (new Col2Im sd input config))
  (^Col2Im []
    (new Col2Im )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Col2Im this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Col2Im this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Col2Im this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

