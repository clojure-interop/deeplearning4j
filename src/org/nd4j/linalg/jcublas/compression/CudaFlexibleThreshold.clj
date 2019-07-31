(ns org.nd4j.linalg.jcublas.compression.CudaFlexibleThreshold
  "This compression is very special case, and shouldn't be ever used outside of ParallelWrapper/ParameterServer implementation.
 It encodes data as delta between zero and abs threshold.
 Unlike CudaThreshold codec, CudaFlexibleThreshold tries to target specified sparsity/density updates ratio via topN approach
 PLEASE NOTE: DO NOT USE THIS COMPRESSOR UNLESS YOU'RE 100% SURE WHAT YOU DO!"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.compression CudaFlexibleThreshold]))

(defn ->cuda-flexible-threshold
  "Constructor."
  (^CudaFlexibleThreshold []
    (new CudaFlexibleThreshold )))

(defn get-descriptor
  "This method returns compression descriptor. It should be unique for any compressor implementation

  returns: `java.lang.String`"
  (^java.lang.String [^CudaFlexibleThreshold this]
    (-> this (.getDescriptor))))

(defn configure
  "This method allows you to configure desired sparsity/density ratio for updates. Pass it as float/double value
  Default value: 0.1

  vars - `java.lang.Object`"
  ([^CudaFlexibleThreshold this ^java.lang.Object vars]
    (-> this (.configure vars))))

(defn compress
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaFlexibleThreshold this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.compress buffer))))

