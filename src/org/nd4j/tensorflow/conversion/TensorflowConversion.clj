(ns org.nd4j.tensorflow.conversion.TensorflowConversion
  "Interop between nd4j INDArray
 and tensorflow.TF_Tensor"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.tensorflow.conversion TensorflowConversion]))

(defn *get-instance
  "Get a singleton instance

  returns: `org.nd4j.tensorflow.conversion.TensorflowConversion`"
  (^org.nd4j.tensorflow.conversion.TensorflowConversion []
    (TensorflowConversion/getInstance )))

(defn *default-device-for-thread
  "Infers the device for the given thread
  based on the Nd4j.getAffinityManager()
  Usually, this will either be a gpu or cpu
  reserved for the current device.
  You can think of the \"current thread\"
  as a worker. This is mainly useful with multiple gpus

  returns: `java.lang.String`"
  (^java.lang.String []
    (TensorflowConversion/defaultDeviceForThread )))

(defn tensor-from-nd-array
  "Convert an INDArray
  to a tensorflow.TF_Tensor
  with zero copy.
  Uses a direct pointer to the underlying ndarray's
  data

  nd-array - the ndarray to use - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the equivalent tensorflow.TF_Tensor - `org.bytedeco.javacpp.tensorflow.TF_Tensor`"
  (^org.bytedeco.javacpp.tensorflow.TF_Tensor [^TensorflowConversion this ^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (-> this (.tensorFromNDArray nd-array))))

(defn nd-array-from-tensor
  "Convert a INDArray
  to a tensorflow.TF_Tensor
  using zero copy.
  It will use the underlying
  pointer with in nd4j.

  tensor - the tensor to use - `org.bytedeco.javacpp.tensorflow.TF_Tensor`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TensorflowConversion this ^org.bytedeco.javacpp.tensorflow.TF_Tensor tensor]
    (-> this (.ndArrayFromTensor tensor))))

(defn load-graph
  "Get an initialized tensorflow.TF_Graph
  based on the passed in file
  (the file must be a binary protobuf/pb file)
  The graph will be modified to be associated
  with the device associated with this current thread.
  Depending on the active Nd4j.getBackend()
  the device will either be the gpu pinned to the current thread
  or the cpu

  file-path - the path to the file to read - `java.lang.String`

  returns: the initialized graph - `org.bytedeco.javacpp.tensorflow.TF_Graph`

  throws: java.io.IOException"
  (^org.bytedeco.javacpp.tensorflow.TF_Graph [^TensorflowConversion this ^java.lang.String file-path]
    (-> this (.loadGraph file-path))))

