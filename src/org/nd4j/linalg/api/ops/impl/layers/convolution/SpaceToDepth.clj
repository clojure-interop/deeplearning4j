(ns org.nd4j.linalg.api.ops.impl.layers.convolution.SpaceToDepth
  "This operation takes 4D array in, in either NCHW or NHWC format, and moves data from spatial dimensions (HW)
 to channels (C) for given blockSize

 Example:
 blockSize = 4
 dataFormat = \"NCHW\"
 input shape = [128, 16, 16, 3]
 output shape = [128, 16/4, 16/4, 3*4*4]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution SpaceToDepth]))

(defn ->space-to-depth
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  block-size - `int`
  data-format - `java.lang.String`"
  (^SpaceToDepth [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Integer block-size ^java.lang.String data-format]
    (new SpaceToDepth same-diff args block-size data-format))
  (^SpaceToDepth []
    (new SpaceToDepth )))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SpaceToDepth this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^SpaceToDepth this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^SpaceToDepth this]
    (-> this (.mappingsForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SpaceToDepth this]
    (-> this (.opName))))

(defn tensorflow-names
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String[]`"
  ([^SpaceToDepth this]
    (-> this (.tensorflowNames))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SpaceToDepth this]
    (-> this (.tensorflowName))))

