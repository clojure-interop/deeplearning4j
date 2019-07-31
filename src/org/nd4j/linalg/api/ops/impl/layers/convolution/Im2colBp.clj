(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Im2colBp
  "Im2col operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Im2colBp]))

(defn ->im-2col-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-2c-input - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  conv-2-d-config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`"
  (^Im2colBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-2c-input ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig conv-2-d-config]
    (new Im2colBp same-diff i-2c-input grad-at-output conv-2-d-config))
  (^Im2colBp [^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (new Im2colBp sd input config))
  (^Im2colBp []
    (new Im2colBp )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Im2colBp this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Im2colBp this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Im2colBp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

