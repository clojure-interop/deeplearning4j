(ns org.nd4j.linalg.api.ops.executioner.OpExecutionerUtil
  "Utility functions for the DefaultOpExecutioner"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.executioner OpExecutionerUtil]))

(defn *can-do-op-directly?
  "Can we do the transform op (Z = Op(X,Y)) directly on the arrays without breaking them up into 1d tensors first?

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z]
    (OpExecutionerUtil/canDoOpDirectly x y z))
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (OpExecutionerUtil/canDoOpDirectly x y))
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray x]
    (OpExecutionerUtil/canDoOpDirectly x)))

(defn *check-for-na-n
  "z - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray z]
    (OpExecutionerUtil/checkForNaN z)))

(defn *check-for-any
  "z - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray z]
    (OpExecutionerUtil/checkForAny z)))

(defn *check-for-inf
  "z - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray z]
    (OpExecutionerUtil/checkForInf z)))

(defn *choose-element-wise-tensor-dimension
  "Choose tensor dimension for operations with 3 arguments: z=Op(x,y) or similar

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z]
    (OpExecutionerUtil/chooseElementWiseTensorDimension x y z))
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (OpExecutionerUtil/chooseElementWiseTensorDimension x y))
  (^Integer [^org.nd4j.linalg.api.ndarray.INDArray x]
    (OpExecutionerUtil/chooseElementWiseTensorDimension x)))

(defn *get-1-d-tensor-stats
  "Tensor1DStats, used to efficiently iterate through tensors on a matrix (2d NDArray) for element-wise ops
  For example, the offset of each 1d tensor can be calculated using only a single tensorAlongDimension method call,
  hence is potentially faster than approaches requiring multiple tensorAlongDimension calls.
  Note that this can only (generally) be used for 2d NDArrays. For certain 3+d NDArrays, the tensor starts may not
  be in increasing order

  array - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ops.executioner.OpExecutionerUtil$Tensor1DStats`"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutionerUtil$Tensor1DStats [^org.nd4j.linalg.api.ndarray.INDArray array ^Integer dimension]
    (OpExecutionerUtil/get1DTensorStats array dimension)))

