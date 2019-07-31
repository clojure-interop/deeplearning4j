(ns org.nd4j.linalg.api.ops.impl.layers.convolution.DepthToSpace
  "Inverse operation to SpaceToDepth. This operation takes 4D array in, in either NCHW or NHWC format,
 and moves data from channels (C) to spatial dimensions (HW) for given blockSize.

 Example:
 blockSize = 4
 dataFormat = \"NCHW\"
 input shape = [128, 4, 4, 48]
 output shape = [128, 4*4, 4*4, 48/4/4]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution DepthToSpace]))

(defn ->depth-to-space
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  block-size - `int`
  data-format - `java.lang.String`"
  (^DepthToSpace [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Integer block-size ^java.lang.String data-format]
    (new DepthToSpace same-diff args block-size data-format))
  (^DepthToSpace []
    (new DepthToSpace )))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DepthToSpace this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^DepthToSpace this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^DepthToSpace this]
    (-> this (.mappingsForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^DepthToSpace this]
    (-> this (.opName))))

(defn tensorflow-names
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String[]`"
  ([^DepthToSpace this]
    (-> this (.tensorflowNames))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DepthToSpace this]
    (-> this (.tensorflowName))))

