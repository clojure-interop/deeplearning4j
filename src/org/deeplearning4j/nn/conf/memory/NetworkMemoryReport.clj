(ns org.deeplearning4j.nn.conf.memory.NetworkMemoryReport
  "Network memory reports is a class that is used to store/represent the memory requirements of a
 MultiLayerNetwork or ComputationGraph,
 composed of multiple layers and/or vertices."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.memory NetworkMemoryReport]))

(defn ->network-memory-report
  "Constructor.

  layer-and-vertex-reports - `java.util.Map`
  model-class - `java.lang.Class`
  model-name - `java.lang.String`
  network-input-types - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^NetworkMemoryReport [^java.util.Map layer-and-vertex-reports ^java.lang.Class model-class ^java.lang.String model-name ^org.deeplearning4j.nn.conf.inputs.InputType network-input-types]
    (new NetworkMemoryReport layer-and-vertex-reports model-class model-name network-input-types)))

(defn get-report-class
  "returns: Class that the memory report was generated for - `java.lang.Class<?>`"
  (^java.lang.Class [^NetworkMemoryReport this]
    (-> this (.getReportClass))))

(defn get-name
  "Description copied from class: MemoryReport

  returns: Name of the object - `java.lang.String`"
  (^java.lang.String [^NetworkMemoryReport this]
    (-> this (.getName))))

(defn get-total-memory-bytes
  "Description copied from class: MemoryReport

  minibatch-size - Mini batch size to estimate the memory for - `int`
  memory-use-mode - The memory use mode (training or inference) - `org.deeplearning4j.nn.conf.memory.MemoryUseMode`
  cache-mode - The CacheMode to use - `org.deeplearning4j.nn.conf.CacheMode`
  data-type - Nd4j datatype - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: The estimated total memory consumption in bytes - `long`"
  (^Long [^NetworkMemoryReport this ^Integer minibatch-size ^org.deeplearning4j.nn.conf.memory.MemoryUseMode memory-use-mode ^org.deeplearning4j.nn.conf.CacheMode cache-mode ^org.nd4j.linalg.api.buffer.DataBuffer$Type data-type]
    (-> this (.getTotalMemoryBytes minibatch-size memory-use-mode cache-mode data-type))))

(defn get-memory-bytes
  "Description copied from class: MemoryReport

  memory-type - Type of memory to get the estimate for invites - `org.deeplearning4j.nn.conf.memory.MemoryType`
  minibatch-size - Mini batch size to estimate the memory for - `int`
  memory-use-mode - The memory use mode (training or inference) - `org.deeplearning4j.nn.conf.memory.MemoryUseMode`
  cache-mode - The CacheMode to use - `org.deeplearning4j.nn.conf.CacheMode`
  data-type - Nd4j datatype - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: Estimated memory use for the given memory type - `long`"
  (^Long [^NetworkMemoryReport this ^org.deeplearning4j.nn.conf.memory.MemoryType memory-type ^Integer minibatch-size ^org.deeplearning4j.nn.conf.memory.MemoryUseMode memory-use-mode ^org.deeplearning4j.nn.conf.CacheMode cache-mode ^org.nd4j.linalg.api.buffer.DataBuffer$Type data-type]
    (-> this (.getMemoryBytes memory-type minibatch-size memory-use-mode cache-mode data-type))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkMemoryReport this]
    (-> this (.toString))))

