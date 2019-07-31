(ns org.nd4j.linalg.api.ops.impl.transforms.DynamicPartition
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
  (:import [org.nd4j.linalg.api.ops.impl.transforms DynamicPartition]))

(defn ->dynamic-partition
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  partitions - `org.nd4j.autodiff.samediff.SDVariable`
  num-partitions - `int`"
  (^DynamicPartition [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable partitions ^Integer num-partitions]
    (new DynamicPartition same-diff input partitions num-partitions))
  (^DynamicPartition []
    (new DynamicPartition )))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^DynamicPartition this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^DynamicPartition this]
    (-> this (.mappingsForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^DynamicPartition this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DynamicPartition this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DynamicPartition this]
    (-> this (.onnxName))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^DynamicPartition this]
    (-> this (.getNumOutputs))))

