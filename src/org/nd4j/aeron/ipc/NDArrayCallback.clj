(ns org.nd4j.aeron.ipc.NDArrayCallback
  "An ndarray listener"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc NDArrayCallback]))

(defn on-nd-array-message
  "A listener for ndarray message

  message - the message for the callback - `org.nd4j.aeron.ipc.NDArrayMessage`"
  ([^NDArrayCallback this ^org.nd4j.aeron.ipc.NDArrayMessage message]
    (-> this (.onNDArrayMessage message))))

(defn on-nd-array-partial
  "Used for partial updates using tensor along
  dimension

  arr - the array to count as an update - `org.nd4j.linalg.api.ndarray.INDArray`
  idx - the index for the tensor along dimension - `long`
  dimensions - the dimensions to act on for the tensor along dimension - `int`"
  ([^NDArrayCallback this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long idx ^Integer dimensions]
    (-> this (.onNDArrayPartial arr idx dimensions))))

(defn on-nd-array
  "Setup an ndarray

  arr - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NDArrayCallback this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.onNDArray arr))))

