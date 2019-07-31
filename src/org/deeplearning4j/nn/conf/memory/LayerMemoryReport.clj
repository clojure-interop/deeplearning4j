(ns org.deeplearning4j.nn.conf.memory.LayerMemoryReport
  "A MemoryReport Designed to report estimated memory use for a single layer or graph vertex."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.memory LayerMemoryReport]))

(defn get-report-class
  "returns: Class that the memory report was generated for - `java.lang.Class<?>`"
  (^java.lang.Class [^LayerMemoryReport this]
    (-> this (.getReportClass))))

(defn get-name
  "Description copied from class: MemoryReport

  returns: Name of the object - `java.lang.String`"
  (^java.lang.String [^LayerMemoryReport this]
    (-> this (.getName))))

(defn get-total-memory-bytes
  "Description copied from class: MemoryReport

  minibatch-size - Mini batch size to estimate the memory for - `int`
  memory-use-mode - The memory use mode (training or inference) - `org.deeplearning4j.nn.conf.memory.MemoryUseMode`
  cache-mode - The CacheMode to use - `org.deeplearning4j.nn.conf.CacheMode`
  data-type - Nd4j datatype - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: The estimated total memory consumption in bytes - `long`"
  (^Long [^LayerMemoryReport this ^Integer minibatch-size ^org.deeplearning4j.nn.conf.memory.MemoryUseMode memory-use-mode ^org.deeplearning4j.nn.conf.CacheMode cache-mode ^org.nd4j.linalg.api.buffer.DataBuffer$Type data-type]
    (-> this (.getTotalMemoryBytes minibatch-size memory-use-mode cache-mode data-type))))

(defn get-memory-bytes
  "Description copied from class: MemoryReport

  memory-type - Type of memory to get the estimate for invites - `org.deeplearning4j.nn.conf.memory.MemoryType`
  minibatch-size - Mini batch size to estimate the memory for - `int`
  memory-use-mode - The memory use mode (training or inference) - `org.deeplearning4j.nn.conf.memory.MemoryUseMode`
  cache-mode - The CacheMode to use - `org.deeplearning4j.nn.conf.CacheMode`
  data-type - Nd4j datatype - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: Estimated memory use for the given memory type - `long`"
  (^Long [^LayerMemoryReport this ^org.deeplearning4j.nn.conf.memory.MemoryType memory-type ^Integer minibatch-size ^org.deeplearning4j.nn.conf.memory.MemoryUseMode memory-use-mode ^org.deeplearning4j.nn.conf.CacheMode cache-mode ^org.nd4j.linalg.api.buffer.DataBuffer$Type data-type]
    (-> this (.getMemoryBytes memory-type minibatch-size memory-use-mode cache-mode data-type))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LayerMemoryReport this]
    (-> this (.toString))))

(defn scale
  "Multiply all memory usage by the specified scaling factor

  scale - Scale factor to multiply all memory usage by - `int`"
  ([^LayerMemoryReport this ^Integer scale]
    (-> this (.scale scale))))

