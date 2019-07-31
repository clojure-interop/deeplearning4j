(ns org.nd4j.linalg.cpu.nativecpu.compression.CpuThreshold
  "This compression is very special case, and shouldn't be ever used outside of ParallelWrapper/ParameterServer implementation.
 It encodes data as delta between zero and abs threshold.
 PLEASE NOTE: DO NOT USE THIS COMPRESSOR UNLESS YOU'RE 100% SURE WHAT YOU DO!"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu.compression CpuThreshold]))

(defn ->cpu-threshold
  "Constructor."
  (^CpuThreshold []
    (new CpuThreshold )))

(defn get-descriptor
  "This method returns compression descriptor. It should be unique for any compressor implementation

  returns: `java.lang.String`"
  (^java.lang.String [^CpuThreshold this]
    (-> this (.getDescriptor))))

(defn configure
  "This method allows you to configure threshold for delta extraction. Pass it as float/double value
  Default value: 1e-3

  vars - `java.lang.Object`"
  ([^CpuThreshold this ^java.lang.Object vars]
    (-> this (.configure vars))))

(defn compress
  "Description copied from interface: NDArrayCompressor

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuThreshold this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.compress array))))

(defn get-compression-type
  "Description copied from interface: NDArrayCompressor

  returns: `org.nd4j.linalg.compression.CompressionType`"
  (^org.nd4j.linalg.compression.CompressionType [^CpuThreshold this]
    (-> this (.getCompressionType))))

(defn decompress
  "Description copied from interface: NDArrayCompressor

  buffer - the buffer to decompress - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: the decompressed data buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CpuThreshold this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.decompress buffer))))

