(ns org.nd4j.linalg.cpu.nativecpu.compression.CpuFlexibleThreshold
  "This compression is very special case, and shouldn't be ever used outside of ParallelWrapper/ParameterServer implementation.
 It encodes data as delta between zero and abs threshold.
 Unlike CpuThreshold codec, CpuFlexibleThreshold tries to target specified sparsity/density updates ratio via topN approach
 PLEASE NOTE: DO NOT USE THIS COMPRESSOR UNLESS YOU'RE 100% SURE WHAT YOU DO!"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu.compression CpuFlexibleThreshold]))

(defn ->cpu-flexible-threshold
  "Constructor."
  (^CpuFlexibleThreshold []
    (new CpuFlexibleThreshold )))

(defn get-descriptor
  "This method returns compression descriptor. It should be unique for any compressor implementation

  returns: `java.lang.String`"
  (^java.lang.String [^CpuFlexibleThreshold this]
    (-> this (.getDescriptor))))

(defn configure
  "This method allows you to configure desired sparsity/density ratio for updates. Pass it as float/double value
  Default value: 0.1

  vars - `java.lang.Object`"
  ([^CpuFlexibleThreshold this ^java.lang.Object vars]
    (-> this (.configure vars))))

(defn compress
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CpuFlexibleThreshold this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.compress buffer))))

