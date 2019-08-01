(ns org.nd4j.parameterserver.ParameterServerListener
  "Parameter server
 listener. This holds an
 INDArray in memory
 and maintains the \"master copy\"
 of the ndarray."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver ParameterServerListener]))

(defn ->parameter-server-listener
  "Constructor.

  Shape of the ndarray

  shape - the shape of the array - `int[]`
  updates-per-epoch - the number of updates per epochfor synchronization - `int`"
  (^ParameterServerListener [shape ^Integer updates-per-epoch]
    (new ParameterServerListener shape updates-per-epoch))
  (^ParameterServerListener [shape]
    (new ParameterServerListener shape)))

(defn on-nd-array-message
  "A listener for ndarray message

  message - the message for the callback - `org.nd4j.aeron.ipc.NDArrayMessage`"
  ([^ParameterServerListener this ^org.nd4j.aeron.ipc.NDArrayMessage message]
    (-> this (.onNDArrayMessage message))))

(defn on-nd-array-partial
  "Used for partial updates using tensor along
  dimension

  arr - the array to count as an update - `org.nd4j.linalg.api.ndarray.INDArray`
  idx - the index for the tensor along dimension - `long`
  dimensions - the dimensions to act on for the tensor along dimension - `int`"
  ([^ParameterServerListener this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long idx ^Integer dimensions]
    (-> this (.onNDArrayPartial arr idx dimensions))))

(defn on-nd-array
  "Setup an ndarray

  arr - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ParameterServerListener this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.onNDArray arr))))

(defn finish
  "Do a final divide for averaging"
  ([^ParameterServerListener this]
    (-> this (.finish))))

