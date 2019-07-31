(ns org.deeplearning4j.nn.conf.memory.MemoryReport
  "A MemoryReport is designed to represent the estimated memory usage of a model, as a function of:
 - Training vs. Inference usage of the network
 - Minibatch size
 - ND4J DataType setting
 - Cache mode
 Note that the memory use estimate may not be exact, as may not take into account all possible memory use;
 Furthermore, memory may exceed this value depending on, for example, garbage collection.



 For the purposes of estimating memory use under different situations, we consider there to be 3 types of memory:
 Standard memory, working memory and Cached memory. Each type has the concept of 'fixed' size memory (independent
 of minibatch size) and 'variable' memory (total use depends on minibatch size; memory reported is for one example).


 The following breakdown of memory types will be used:

 Standard memory

 Fixed size (parameters, parameter gradients, updater state)
 Variable size (activations, activation gradients)

 Working memory (may be reused via workspace or garbage collected)

 Fixed size (may be different for train vs. inference)
 Variable size (may be different for train vs. inference)

 Cached memory (only used for training mode)

 Fixed size (as a function of CacheMode)
 Variable size (as a function of CacheMode)




 For MemoryUseMode (X = train or inference), for a given cache mode CM and minibatch size M and layers L:
 TotalMemory(X,CM,M) = sum_L ( StandardFixedMem(X)  M * StandardVariableMem(X) )
 + max_L ( WorkingFixedMem(X,CM)  M * WorkingVariableMem(X,CM) )
 + sum_L ( CachedFixedMem(X,CM)  M * CachedVariableMem(X,CM))

 Note 1: CachedFixedMem(INFERENCE,any) = 0 and CachedVariableMem(INFERENCE,any) = 0. i.e., cache is a train-only
 feature.
 Note 2: Working memory may depend on cache mode: if we cache something, we have less computation to do later, and
 hence less working memory.
 Note 3: Reported memory figures are given in NDArray size unit - thus 1 refers to 1 float or 1 double value,
 depending on the data type setting."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.memory MemoryReport]))

(defn ->memory-report
  "Constructor."
  (^MemoryReport []
    (new MemoryReport )))

(def *-cache-mode-all-zeros
  "Static Constant.

  A simple Map containing all zeros for each CacheMode key

  type: java.util.Map<org.deeplearning4j.nn.conf.CacheMode,java.lang.Long>"
  MemoryReport/CACHE_MODE_ALL_ZEROS)

(defn *cache-mode-map-for
  "Get a map of CacheMode with all keys associated with the specified value

  value - Value for all keys - `long`

  returns: Map - `java.util.Map<org.deeplearning4j.nn.conf.CacheMode,java.lang.Long>`"
  (^java.util.Map [^Long value]
    (MemoryReport/cacheModeMapFor value)))

(defn *from-json
  "json - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.memory.MemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.MemoryReport [^java.lang.String json]
    (MemoryReport/fromJson json)))

(defn *from-yaml
  "yaml - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.memory.MemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.MemoryReport [^java.lang.String yaml]
    (MemoryReport/fromYaml yaml)))

(defn get-report-class
  "returns: Class that the memory report was generated for - `java.lang.Class<?>`"
  (^java.lang.Class [^MemoryReport this]
    (-> this (.getReportClass))))

(defn get-name
  "Name of the object that the memory report was generated for

  returns: Name of the object - `java.lang.String`"
  (^java.lang.String [^MemoryReport this]
    (-> this (.getName))))

(defn get-total-memory-bytes
  "Get the total memory use in bytes for the given configuration

  minibatch-size - Mini batch size to estimate the memory for - `int`
  memory-use-mode - The memory use mode (training or inference) - `org.deeplearning4j.nn.conf.memory.MemoryUseMode`
  cache-mode - The CacheMode to use - `org.deeplearning4j.nn.conf.CacheMode`
  data-type - Nd4j datatype - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: The estimated total memory consumption in bytes - `long`"
  (^Long [^MemoryReport this ^Integer minibatch-size ^org.deeplearning4j.nn.conf.memory.MemoryUseMode memory-use-mode ^org.deeplearning4j.nn.conf.CacheMode cache-mode ^org.nd4j.linalg.api.buffer.DataBuffer$Type data-type]
    (-> this (.getTotalMemoryBytes minibatch-size memory-use-mode cache-mode data-type)))
  (^Long [^MemoryReport this ^Integer minibatch-size ^org.deeplearning4j.nn.conf.memory.MemoryUseMode memory-use-mode ^org.deeplearning4j.nn.conf.CacheMode cache-mode]
    (-> this (.getTotalMemoryBytes minibatch-size memory-use-mode cache-mode))))

(defn get-memory-bytes
  "Get the memory estimate (in bytes) for the specified type of memory

  memory-type - Type of memory to get the estimate for invites - `org.deeplearning4j.nn.conf.memory.MemoryType`
  minibatch-size - Mini batch size to estimate the memory for - `int`
  memory-use-mode - The memory use mode (training or inference) - `org.deeplearning4j.nn.conf.memory.MemoryUseMode`
  cache-mode - The CacheMode to use - `org.deeplearning4j.nn.conf.CacheMode`
  data-type - Nd4j datatype - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: Estimated memory use for the given memory type - `long`"
  (^Long [^MemoryReport this ^org.deeplearning4j.nn.conf.memory.MemoryType memory-type ^Integer minibatch-size ^org.deeplearning4j.nn.conf.memory.MemoryUseMode memory-use-mode ^org.deeplearning4j.nn.conf.CacheMode cache-mode ^org.nd4j.linalg.api.buffer.DataBuffer$Type data-type]
    (-> this (.getMemoryBytes memory-type minibatch-size memory-use-mode cache-mode data-type)))
  (^Long [^MemoryReport this ^org.deeplearning4j.nn.conf.memory.MemoryType memory-type ^Integer minibatch-size ^org.deeplearning4j.nn.conf.memory.MemoryUseMode memory-use-mode ^org.deeplearning4j.nn.conf.CacheMode cache-mode]
    (-> this (.getMemoryBytes memory-type minibatch-size memory-use-mode cache-mode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MemoryReport this]
    (-> this (.toString))))

(defn to-json
  "returns: `java.lang.String`"
  (^java.lang.String [^MemoryReport this]
    (-> this (.toJson))))

(defn to-yaml
  "returns: `java.lang.String`"
  (^java.lang.String [^MemoryReport this]
    (-> this (.toYaml))))

