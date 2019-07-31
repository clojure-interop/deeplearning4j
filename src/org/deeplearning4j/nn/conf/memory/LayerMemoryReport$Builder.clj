(ns org.deeplearning4j.nn.conf.memory.LayerMemoryReport$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.memory LayerMemoryReport$Builder]))

(defn ->builder
  "Constructor.

  layer-name - Name of the layer or graph vertex - `java.lang.String`
  layer-type - Type of the layer or graph vertex - `java.lang.Class`
  input-type - Input type to the layer/vertex - `org.deeplearning4j.nn.conf.inputs.InputType`
  output-type - Output type from the layer/vertex - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^LayerMemoryReport$Builder [^java.lang.String layer-name ^java.lang.Class layer-type ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^org.deeplearning4j.nn.conf.inputs.InputType output-type]
    (new LayerMemoryReport$Builder layer-name layer-type input-type output-type)))

(defn standard-memory
  "Report the standard memory

  parameter-size - Number of parameters - `long`
  updater-state-size - Size for the updater array - `long`

  returns: `org.deeplearning4j.nn.conf.memory.LayerMemoryReport$Builder`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport$Builder [^LayerMemoryReport$Builder this ^Long parameter-size ^Long updater-state-size]
    (-> this (.standardMemory parameter-size updater-state-size))))

(defn working-memory
  "Report the working memory size, for both inference and training

  fixed-inference - Number of elements used for inference ( independent of minibatch size) - `long`
  variable-inference-per-ex - Number of elements used for inference, for each example - `long`
  fixed-train - Number of elements used for training (independent of minibatch size) - `long`
  variable-train-per-ex - Number of elements used for training, for each example - `long`

  returns: `org.deeplearning4j.nn.conf.memory.LayerMemoryReport$Builder`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport$Builder [^LayerMemoryReport$Builder this ^Long fixed-inference ^Long variable-inference-per-ex ^Long fixed-train ^Long variable-train-per-ex]
    (-> this (.workingMemory fixed-inference variable-inference-per-ex fixed-train variable-train-per-ex))))

(defn cache-memory
  "Reports the cached/cacheable memory requirements. This method assumes the caseload memory is the same for
  all cases, i.e., typically used with zeros (Layers that do not use caching)

  cache-mode-memory-fixed - Number of elements of cache memory, independent of the mini batch size - `long`
  cache-mode-memory-variable-per-ex - Number of elements of cache memory, for each example - `long`

  returns: `org.deeplearning4j.nn.conf.memory.LayerMemoryReport$Builder`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport$Builder [^LayerMemoryReport$Builder this ^Long cache-mode-memory-fixed ^Long cache-mode-memory-variable-per-ex]
    (-> this (.cacheMemory cache-mode-memory-fixed cache-mode-memory-variable-per-ex))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^LayerMemoryReport$Builder this]
    (-> this (.build))))

