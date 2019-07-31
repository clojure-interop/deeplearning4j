(ns org.nd4j.linalg.api.ops.factory.DefaultOpFactory
  "Default operations factory"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.factory DefaultOpFactory]))

(defn ->default-op-factory
  "Constructor."
  (^DefaultOpFactory []
    (new DefaultOpFactory )))

(defn create-shape
  "name - `java.lang.String`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  extra-args - `java.lang.Object[]`

  returns: `org.nd4j.linalg.api.ops.Op`"
  (^org.nd4j.linalg.api.ops.Op [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z extra-args]
    (-> this (.createShape name x z extra-args))))

(defn get-op-by-name
  "Description copied from interface: OpFactory

  op-name - `java.lang.String`

  returns: `org.nd4j.linalg.api.ops.Op`"
  (^org.nd4j.linalg.api.ops.Op [^DefaultOpFactory this ^java.lang.String op-name]
    (-> this (.getOpByName op-name))))

(defn get-op-num-if-exists
  "Description copied from interface: OpFactory

  op-name - `java.lang.String`

  returns: `int`"
  (^Integer [^DefaultOpFactory this ^java.lang.String op-name]
    (-> this (.getOpNumIfExists op-name))))

(defn create-broadcast-op
  "Description copied from interface: OpFactory

  name - Name of the vector op - `java.lang.String`
  x - NDArray to operate on - `org.nd4j.linalg.api.ndarray.INDArray`
  y - Vector - `org.nd4j.linalg.api.ndarray.INDArray`
  z - Result NDArray - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - Dimension to do op along. 0 for row, 1 for column, etc - `int`

  returns: VectorOp - `org.nd4j.linalg.api.ops.BroadcastOp`"
  (^org.nd4j.linalg.api.ops.BroadcastOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Integer dimension]
    (-> this (.createBroadcastOp name x y z dimension)))
  (^org.nd4j.linalg.api.ops.BroadcastOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Integer dimension]
    (-> this (.createBroadcastOp name x y dimension)))
  (^org.nd4j.linalg.api.ops.BroadcastOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z extra-args ^Integer dimension]
    (-> this (.createBroadcastOp name x y z extra-args dimension))))

(defn create-index-accum
  "Description copied from interface: OpFactory

  name - `java.lang.String`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ops.IndexAccumulation`"
  (^org.nd4j.linalg.api.ops.IndexAccumulation [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.createIndexAccum name x y)))
  (^org.nd4j.linalg.api.ops.IndexAccumulation [^DefaultOpFactory this ^java.lang.String op-name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z extra-args]
    (-> this (.createIndexAccum op-name x y z extra-args)))
  (^org.nd4j.linalg.api.ops.IndexAccumulation [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.createIndexAccum name x))))

(defn create-gradient-op
  "name - `java.lang.String`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ops.GradientOp`"
  (^org.nd4j.linalg.api.ops.GradientOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.createGradientOp name x y z))))

(defn create-scalar-transform
  "name - `java.lang.String`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  extra-args - `java.lang.Object[]`
  scalar - `double`

  returns: `org.nd4j.linalg.api.ops.ScalarOp`"
  (^org.nd4j.linalg.api.ops.ScalarOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z extra-args ^Double scalar]
    (-> this (.createScalarTransform name x y z extra-args scalar)))
  (^org.nd4j.linalg.api.ops.ScalarOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Double scalar]
    (-> this (.createScalarTransform name x y z scalar)))
  (^org.nd4j.linalg.api.ops.ScalarOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Double scalar]
    (-> this (.createScalarTransform name x y scalar)))
  (^org.nd4j.linalg.api.ops.ScalarOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^Double scalar]
    (-> this (.createScalarTransform name x scalar))))

(defn create-loss-function
  "Description copied from interface: OpFactory

  name - the opName of the function - `java.lang.String`
  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the output - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: a loss function representing the delta between the 2 - `org.nd4j.linalg.api.ops.LossFunction`"
  (^org.nd4j.linalg.api.ops.LossFunction [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.createLossFunction name x y))))

(defn create-transform
  "name - `java.lang.String`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  extra-args - `java.lang.Object[]`

  returns: `org.nd4j.linalg.api.ops.TransformOp`"
  (^org.nd4j.linalg.api.ops.TransformOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z extra-args]
    (-> this (.createTransform name x y z extra-args)))
  (^org.nd4j.linalg.api.ops.TransformOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.createTransform name x y z)))
  (^org.nd4j.linalg.api.ops.TransformOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.createTransform name x y)))
  (^org.nd4j.linalg.api.ops.TransformOp [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.createTransform name x))))

(defn get-op-num-by-name
  "This method returns op id number for given opName

  op-name - `java.lang.String`

  returns: `int`"
  (^Integer [^DefaultOpFactory this ^java.lang.String op-name]
    (-> this (.getOpNumByName op-name))))

(defn create-accum
  "Description copied from interface: OpFactory

  name - the opName of the function - `java.lang.String`
  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transformation - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the output - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the operation - `org.nd4j.linalg.api.ops.Accumulation`"
  (^org.nd4j.linalg.api.ops.Accumulation [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.createAccum name x y z)))
  (^org.nd4j.linalg.api.ops.Accumulation [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.createAccum name x)))
  (^org.nd4j.linalg.api.ops.Accumulation [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z extra-args]
    (-> this (.createAccum name x y z extra-args)))
  (^org.nd4j.linalg.api.ops.Accumulation [^DefaultOpFactory this ^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.createAccum name x y))))

