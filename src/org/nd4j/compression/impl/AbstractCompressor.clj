(ns org.nd4j.compression.impl.AbstractCompressor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.compression.impl AbstractCompressor]))

(defn ->abstract-compressor
  "Constructor."
  (^AbstractCompressor []
    (new AbstractCompressor )))

(defn *get-buffer-type-ex
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (AbstractCompressor/getBufferTypeEx buffer)))

(defn compress
  "This method creates compressed INDArray from Java float array, skipping usual INDArray instantiation routines

  data - `float[]`
  shape - `int[]`
  order - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractCompressor this data shape ^Character order]
    (-> this (.compress data shape order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.compress array))))

(defn configure
  "This method has no effect in this compressor

  vars - `java.lang.Object`"
  ([^AbstractCompressor this ^java.lang.Object vars]
    (-> this (.configure vars))))

(defn compressi
  "Inplace compression of INDArray

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.compressi array))))

(defn decompressi
  "Description copied from interface: NDArrayCompressor

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.decompressi array))))

(defn decompress
  "Description copied from interface: NDArrayCompressor

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.decompress array))))

