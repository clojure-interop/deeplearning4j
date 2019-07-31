(ns org.nd4j.linalg.api.ops.Op
  "An op is defined as follows:
 opName: opName of the operation
 x: the origin ndarray
 y: the ndarray to parse in parallel
 z: the resulting buffer
 n: the number of elements to iterate over
 where x is the origin ndarray,
 y, is a pairwise op
 over n elements in the ndarray
 stored in result z

 This is followed from the standard template for a BLAS operation
 such that given a linear buffer, a function defines 3 buffers (x,y,z)
 and the associated strides and offsets (handled by the ndarrays in this case)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops Op]))

(defn set-n
  "Change n

  n - `long`"
  ([^Op this ^Long n]
    (-> this (.setN n))))

(defn n
  "The number of elements to do a op over

  returns: the op - `long`"
  (^Long [^Op this]
    (-> this (.n))))

(defn set-z
  "set z (the solution ndarray)

  z - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Op this ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.setZ z))))

(defn extra-args-buff
  "Returns a buffer of either float
  or double
  of the extra args for this buffer

  returns: a buffer of either opType float or double
  representing the extra args for this op - `java.nio.Buffer`"
  (^java.nio.Buffer [^Op this]
    (-> this (.extraArgsBuff))))

(defn z
  "The resulting ndarray

  returns: the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Op this]
    (-> this (.z))))

(defn num-processed
  "Number processed

  returns: the number of elements accumulated - `long`"
  (^Long [^Op this]
    (-> this (.numProcessed))))

(defn extra-args
  "Extra arguments

  returns: the extra arguments - `java.lang.Object[]`"
  ([^Op this]
    (-> this (.extraArgs))))

(defn op-name
  "The opName of this operation

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Op this]
    (-> this (.opName))))

(defn x
  "The origin ndarray

  returns: the origin ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Op this]
    (-> this (.x))))

(defn set-extra-args
  "extra-args - `java.lang.Object[]`"
  ([^Op this extra-args]
    (-> this (.setExtraArgs extra-args))))

(defn exec
  "Exec along each dimension

  dimensions - the dimensions to execute on - `int`"
  ([^Op this ^Integer dimensions]
    (-> this (.exec dimensions)))
  ([^Op this]
    (-> this (.exec))))

(defn op-num
  "An op number

  returns: `int`"
  (^Integer [^Op this]
    (-> this (.opNum))))

(defn pass-through?
  "Returns whether the op should be executed or not (through the executioner)

  returns: true if the op is pass through false otherwise - `boolean`"
  (^Boolean [^Op this]
    (-> this (.isPassThrough))))

(defn extra-args-data-buff
  "Returns the extra args as a data buffer

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Op this]
    (-> this (.extraArgsDataBuff))))

(defn set-y
  "set y(the pairwise ndarray)

  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Op this ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.setY y))))

(defn y
  "The pairwise op ndarray

  returns: the pairwise op ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Op this]
    (-> this (.y))))

(defn init
  "Initialize the operation based on the parameters

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^Op this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn set-x
  "set x (the input ndarray)

  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Op this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.setX x))))

(defn exec-special?
  "Whether the executioner
  needs to do a special call or not

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^Op this]
    (-> this (.isExecSpecial))))

(defn to-custom-op
  "Converts this op to be a CustomOp
  A CustomOp is a more flexible op
  meant for multiple inputs and outputs.
  The default implementation in BaseOp
  converts a simple op to a multi input/output operation
  by mapping the x and y on to inputs , the op opName
  and the z on to outputs.

  returns: the equivalent CustomOp - `org.nd4j.linalg.api.ops.CustomOp`"
  (^org.nd4j.linalg.api.ops.CustomOp [^Op this]
    (-> this (.toCustomOp))))

