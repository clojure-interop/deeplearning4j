(ns org.nd4j.arrow.ArrowSerde
  "Conversion to and from arrow Tensor
 and INDArray"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.arrow ArrowSerde]))

(defn ->arrow-serde
  "Constructor."
  (^ArrowSerde []
    (new ArrowSerde )))

(defn *from-tensor
  "Convert a Tensor
  to an INDArray

  tensor - the input tensor - `org.apache.arrow.flatbuf.Tensor`

  returns: the equivalent INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.apache.arrow.flatbuf.Tensor tensor]
    (ArrowSerde/fromTensor tensor)))

(defn *to-tensor
  "Convert an INDArray
  to an arrow Tensor

  arr - the array to convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the equivalent Tensor - `org.apache.arrow.flatbuf.Tensor`"
  (^org.apache.arrow.flatbuf.Tensor [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (ArrowSerde/toTensor arr)))

(defn *add-data-for-arr
  "Create a Buffer
  representing the location metadata of the actual data
  contents for the ndarrays' DataBuffer

  buffer-builder - the buffer builder in use - `com.google.flatbuffers.FlatBufferBuilder`
  arr - the array to add the underlying data for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the offset added - `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder buffer-builder ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (ArrowSerde/addDataForArr buffer-builder arr)))

(defn *add-type-type-relative-to-nd-array
  "Convert the given INDArray
  data type to the proper data type for the tensor.

  buffer-builder - the buffer builder in use - `com.google.flatbuffers.FlatBufferBuilder`
  arr - the array to conver tthe data type for - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^com.google.flatbuffers.FlatBufferBuilder buffer-builder ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (ArrowSerde/addTypeTypeRelativeToNDArray buffer-builder arr)))

(defn *create-dims
  "Create the dimensions for the flatbuffer builder

  buffer-builder - the buffer builder to use - `com.google.flatbuffers.FlatBufferBuilder`
  arr - the input array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder buffer-builder ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (ArrowSerde/createDims buffer-builder arr)))

(defn *get-arrow-strides
  "Get the strides of this INDArray
  multiplieed by the element size.
  This is the Tensor and numpy format

  arr - the array to convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `long[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr]
    (ArrowSerde/getArrowStrides arr)))

(defn *type-from-tensor-type
  "Create thee databuffer type frm the given type,
  relative to the bytes in arrow in class:
  Type

  type - the type to create the nd4j DataBuffer.Type from - `byte`
  element-size - the element size - `int`

  returns: the data buffer type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^Byte type ^Integer element-size]
    (ArrowSerde/typeFromTensorType type element-size)))

