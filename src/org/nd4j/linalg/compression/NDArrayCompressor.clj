(ns org.nd4j.linalg.compression.NDArrayCompressor
  "NDArray compressor.
 Given a compression algorithm,
 it can compress/decompress
 databuffers and ndarrays."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.compression NDArrayCompressor]))

(defn get-descriptor
  "This method returns compression descriptor.
  It should be
  unique for any compressor implementation

  returns: `java.lang.String`"
  (^java.lang.String [^NDArrayCompressor this]
    (-> this (.getDescriptor))))

(defn configure
  "This method allows to pass compressor-dependent configuration options to this compressor
  PLEASE NOTE: Each compressor has own options, please check corresponding implementations javadoc

  vars - `java.lang.Object`"
  ([^NDArrayCompressor this ^java.lang.Object vars]
    (-> this (.configure vars))))

(defn get-compression-type
  "This method returns compression opType provided
  by specific NDArrayCompressor implementation

  returns: `org.nd4j.linalg.compression.CompressionType`"
  (^org.nd4j.linalg.compression.CompressionType [^NDArrayCompressor this]
    (-> this (.getCompressionType))))

(defn compress
  "This method creates compressed INDArray from Java float array, skipping usual INDArray instantiation routines

  data - `float[]`
  shape - `int[]`
  order - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayCompressor this data shape ^Character order]
    (-> this (.compress data shape order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.compress array))))

(defn compressi
  "Inplace compression of INDArray

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NDArrayCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.compressi array))))

(defn decompress
  "This method returns
  decompressed copy of referenced array

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.decompress array))))

(defn decompressi
  "Inplace decompression of INDArray

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NDArrayCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.decompressi array))))

