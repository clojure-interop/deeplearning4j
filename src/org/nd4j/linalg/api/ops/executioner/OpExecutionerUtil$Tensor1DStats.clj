(ns org.nd4j.linalg.api.ops.executioner.OpExecutionerUtil$Tensor1DStats
  "Simple class containing values used for calculating various quantities related to 1d tensors.
 offset of ith tensor: firstTensorOffset  i * tensorStartSeparation
 separation between elements in tensor: elementWiseStride
 number of elements in each 1d tensor: tensorLength
 number of 1d tensors: numTensors"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.executioner OpExecutionerUtil$Tensor1DStats]))

(defn ->tensor-1-d-stats
  "Constructor."
  (^OpExecutionerUtil$Tensor1DStats []
    (new OpExecutionerUtil$Tensor1DStats )))

(defn first-tensor-offset
  "Instance Constant.

  type: long"
  (^Long [^OpExecutionerUtil$Tensor1DStats this]
    (-> this .-firstTensorOffset)))

(defn tensor-start-separation
  "Instance Constant.

  type: long"
  (^Long [^OpExecutionerUtil$Tensor1DStats this]
    (-> this .-tensorStartSeparation)))

(defn num-tensors
  "Instance Constant.

  type: long"
  (^Long [^OpExecutionerUtil$Tensor1DStats this]
    (-> this .-numTensors)))

(defn tensor-length
  "Instance Constant.

  type: long"
  (^Long [^OpExecutionerUtil$Tensor1DStats this]
    (-> this .-tensorLength)))

(defn element-wise-stride
  "Instance Constant.

  type: int"
  (^Integer [^OpExecutionerUtil$Tensor1DStats this]
    (-> this .-elementWiseStride)))

