(ns org.nd4j.nativeblas.Nd4jCpu$HalfVariableSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfVariableSpace]))

(defn ->half-variable-space
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfVariableSpace [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfVariableSpace p))
  (^Nd4jCpu$HalfVariableSpace []
    (new Nd4jCpu$HalfVariableSpace )))

(defn put-variable
  "id - `int`
  idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`"
  ([^Nd4jCpu$HalfVariableSpace this ^Integer id ^Integer idx ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray array]
    (-> this (.putVariable id idx array)))
  ([^Nd4jCpu$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray array]
    (-> this (.putVariable pair array))))

(defn put-output-variable
  "variable - `org.nd4j.nativeblas.Nd4jCpu$HalfVariable`"
  ([^Nd4jCpu$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$HalfVariable variable]
    (-> this (.putOutputVariable variable))))

(defn total-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$HalfVariableSpace this]
    (-> this (.totalMemory))))

(defn total-entries
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfVariableSpace this]
    (-> this (.totalEntries))))

(defn handles
  "returns: `(value="nd4j::graph::Variable<float16>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCpu$HalfVariableSpace this]
    (-> this (.handles))))

(defn get-rng
  "returns: `org.nd4j.nativeblas.Nd4jCpu$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCpu$RandomBuffer [^Nd4jCpu$HalfVariableSpace this]
    (-> this (.getRNG))))

(defn inject-variable
  "pair - `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`
  variable - `org.nd4j.nativeblas.Nd4jCpu$HalfVariable`"
  ([^Nd4jCpu$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCpu$HalfVariable variable]
    (-> this (.injectVariable pair variable))))

(defn external-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$HalfVariableSpace this]
    (-> this (.externalMemory))))

(defn put
  "other - `org.nd4j.nativeblas.Nd4jCpu$HalfVariableSpace`

  returns: `(value="operator =")  org.nd4j.nativeblas.Nd4jCpu$HalfVariableSpace`"
  ([^Nd4jCpu$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$HalfVariableSpace other]
    (-> this (.put other))))

(defn number-of-placeholders
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfVariableSpace this]
    (-> this (.numberOfPlaceholders))))

(defn set-flow-path
  "timers - `org.nd4j.nativeblas.Nd4jCpu$FlowPath`"
  ([^Nd4jCpu$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$FlowPath timers]
    (-> this (.setFlowPath timers))))

(defn internal-entries
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfVariableSpace this]
    (-> this (.internalEntries))))

(defn set-workspace
  "workspace - `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  ([^Nd4jCpu$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$Workspace workspace]
    (-> this (.setWorkspace workspace))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfVariableSpace [^Nd4jCpu$HalfVariableSpace this ^Long position]
    (-> this (.position position))))

(defn flow-path
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FlowPath`"
  (^org.nd4j.nativeblas.Nd4jCpu$FlowPath [^Nd4jCpu$HalfVariableSpace this]
    (-> this (.flowPath))))

(defn track-list
  "list - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayList`"
  ([^Nd4jCpu$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayList list]
    (-> this (.trackList list))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$HalfVariableSpace this]
    (-> this (.workspace))))

(defn external-entries
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfVariableSpace this]
    (-> this (.externalEntries))))

(defn set-rng
  "rng - `org.nd4j.nativeblas.Nd4jCpu$RandomBuffer`"
  ([^Nd4jCpu$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$RandomBuffer rng]
    (-> this (.setRNG rng))))

(defn has-variable
  "id - `int`
  idx - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$HalfVariableSpace this ^Integer id ^Integer idx]
    (-> this (.hasVariable id idx)))
  ([^Nd4jCpu$HalfVariableSpace this ^Integer id]
    (-> this (.hasVariable id))))

(defn get-stash
  "returns: `org.nd4j.nativeblas.Nd4jCpu$HalfStash`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfStash [^Nd4jCpu$HalfVariableSpace this]
    (-> this (.getStash))))

(defn get-external-variables
  "returns: `(value="nd4j::graph::Variable<float16>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCpu$HalfVariableSpace this]
    (-> this (.getExternalVariables))))

(defn drop-variable
  "id - `int`
  idx - `int`"
  ([^Nd4jCpu$HalfVariableSpace this ^Integer id ^Integer idx]
    (-> this (.dropVariable id idx)))
  ([^Nd4jCpu$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair]
    (-> this (.dropVariable pair))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCpu$HalfVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfVariableSpace [^Nd4jCpu$HalfVariableSpace this]
    (-> this (.clone))))

(defn get-placeholders
  "returns: `(value="nd4j::graph::Variable<float16>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCpu$HalfVariableSpace this]
    (-> this (.getPlaceholders))))

(defn has-external-variable
  "it - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$HalfVariableSpace this ^Integer it]
    (-> this (.hasExternalVariable it))))

(defn internal-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$HalfVariableSpace this]
    (-> this (.internalMemory))))

(defn get-variable
  "id - `int`
  idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfVariable`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfVariable [^Nd4jCpu$HalfVariableSpace this ^Integer id ^Integer idx]
    (-> this (.getVariable id idx)))
  (^org.nd4j.nativeblas.Nd4jCpu$HalfVariable [^Nd4jCpu$HalfVariableSpace this ^Integer id]
    (-> this (.getVariable id))))

