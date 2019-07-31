(ns org.nd4j.linalg.api.ops.impl.transforms.DynamicStitch
  "Transforms a given input tensor into numPartitions partitions, as indicated by the indices in \"partitions\".
 Output tensor has one more dimension than input tensor, the first dimension indicates the partition.

 Example:

 input: [4, 3, 5, 7, 8, 0]
 input shape: [1, 6]
 partitions: [1, 0, 1, 0, 0, 1]
 numPartitions: 2
 outputs[0]: [3, 7, 8]
 outputs[1]: [4, 5, 0]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms DynamicStitch]))

(defn ->dynamic-stitch
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  indices - `org.nd4j.autodiff.samediff.SDVariable[]`
  inputs - `org.nd4j.autodiff.samediff.SDVariable[]`"
  (^DynamicStitch [^org.nd4j.autodiff.samediff.SameDiff same-diff indices inputs]
    (new DynamicStitch same-diff indices inputs))
  (^DynamicStitch []
    (new DynamicStitch )))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DynamicStitch this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^DynamicStitch this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^DynamicStitch this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DynamicStitch this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DynamicStitch this]
    (-> this (.onnxName))))

