(ns org.nd4j.nativeblas.BaseNativeNDArrayFactory
  "Base class with NativeOps"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas BaseNativeNDArrayFactory]))

(defn ->base-native-nd-array-factory
  "Constructor.

  dtype - `org.nd4j.linalg.api.buffer.DataBuffer$Type`
  order - `java.lang.Character`"
  (^BaseNativeNDArrayFactory [^org.nd4j.linalg.api.buffer.DataBuffer$Type dtype ^java.lang.Character order]
    (new BaseNativeNDArrayFactory dtype order))
  (^BaseNativeNDArrayFactory []
    (new BaseNativeNDArrayFactory )))

(defn convert-to-numpy
  "Description copied from interface: NDArrayFactory

  array - the array to convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^BaseNativeNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.convertToNumpy array))))

(defn create-from-npy-pointer
  "Create from an in memory numpy pointer.
  Note that this is heavily used
  in our python library jumpy.

  pointer - the pointer to thenumpy array - `org.bytedeco.javacpp.Pointer`

  returns: an ndarray created from the in memory
  numpy pointer - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNativeNDArrayFactory this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.createFromNpyPointer pointer))))

(defn create-from-npy-header-pointer
  "Description copied from interface: NDArrayFactory

  pointer - the pointer to thenumpy header - `org.bytedeco.javacpp.Pointer`

  returns: an ndarray created from the in memory
  numpy pointer - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNativeNDArrayFactory this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.createFromNpyHeaderPointer pointer))))

(defn create-from-npy-file
  "Create from a given numpy file.

  file - the file to create the ndarray from - `java.io.File`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNativeNDArrayFactory this ^java.io.File file]
    (-> this (.createFromNpyFile file))))

