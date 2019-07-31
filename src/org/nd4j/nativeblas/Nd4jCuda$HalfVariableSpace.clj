(ns org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfVariableSpace]))

(defn ->half-variable-space
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfVariableSpace [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfVariableSpace p))
  (^Nd4jCuda$HalfVariableSpace []
    (new Nd4jCuda$HalfVariableSpace )))

(defn put-variable
  "id - `int`
  idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  ([^Nd4jCuda$HalfVariableSpace this ^Integer id ^Integer idx ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray array]
    (-> this (.putVariable id idx array)))
  ([^Nd4jCuda$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray array]
    (-> this (.putVariable pair array))))

(defn put-output-variable
  "variable - `org.nd4j.nativeblas.Nd4jCuda$HalfVariable`"
  ([^Nd4jCuda$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$HalfVariable variable]
    (-> this (.putOutputVariable variable))))

(defn total-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$HalfVariableSpace this]
    (-> this (.totalMemory))))

(defn total-entries
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfVariableSpace this]
    (-> this (.totalEntries))))

(defn handles
  "returns: `(value="nd4j::graph::Variable<float16>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$HalfVariableSpace this]
    (-> this (.handles))))

(defn get-rng
  "returns: `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer [^Nd4jCuda$HalfVariableSpace this]
    (-> this (.getRNG))))

(defn inject-variable
  "pair - `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`
  variable - `org.nd4j.nativeblas.Nd4jCuda$HalfVariable`"
  ([^Nd4jCuda$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCuda$HalfVariable variable]
    (-> this (.injectVariable pair variable))))

(defn external-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$HalfVariableSpace this]
    (-> this (.externalMemory))))

(defn put
  "other - `org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace`

  returns: `(value="operator =")  org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace`"
  ([^Nd4jCuda$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace other]
    (-> this (.put other))))

(defn number-of-placeholders
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfVariableSpace this]
    (-> this (.numberOfPlaceholders))))

(defn set-flow-path
  "timers - `org.nd4j.nativeblas.Nd4jCuda$FlowPath`"
  ([^Nd4jCuda$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$FlowPath timers]
    (-> this (.setFlowPath timers))))

(defn internal-entries
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfVariableSpace this]
    (-> this (.internalEntries))))

(defn set-workspace
  "workspace - `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  ([^Nd4jCuda$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$Workspace workspace]
    (-> this (.setWorkspace workspace))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace [^Nd4jCuda$HalfVariableSpace this ^Long position]
    (-> this (.position position))))

(defn flow-path
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FlowPath`"
  (^org.nd4j.nativeblas.Nd4jCuda$FlowPath [^Nd4jCuda$HalfVariableSpace this]
    (-> this (.flowPath))))

(defn track-list
  "list - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList`"
  ([^Nd4jCuda$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList list]
    (-> this (.trackList list))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$HalfVariableSpace this]
    (-> this (.workspace))))

(defn external-entries
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfVariableSpace this]
    (-> this (.externalEntries))))

(defn set-rng
  "rng - `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  ([^Nd4jCuda$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer rng]
    (-> this (.setRNG rng))))

(defn has-variable
  "id - `int`
  idx - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfVariableSpace this ^Integer id ^Integer idx]
    (-> this (.hasVariable id idx)))
  ([^Nd4jCuda$HalfVariableSpace this ^Integer id]
    (-> this (.hasVariable id))))

(defn get-stash
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfStash`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfStash [^Nd4jCuda$HalfVariableSpace this]
    (-> this (.getStash))))

(defn get-external-variables
  "returns: `(value="nd4j::graph::Variable<float16>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$HalfVariableSpace this]
    (-> this (.getExternalVariables))))

(defn drop-variable
  "id - `int`
  idx - `int`"
  ([^Nd4jCuda$HalfVariableSpace this ^Integer id ^Integer idx]
    (-> this (.dropVariable id idx)))
  ([^Nd4jCuda$HalfVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair]
    (-> this (.dropVariable pair))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace [^Nd4jCuda$HalfVariableSpace this]
    (-> this (.clone))))

(defn get-placeholders
  "returns: `(value="nd4j::graph::Variable<float16>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$HalfVariableSpace this]
    (-> this (.getPlaceholders))))

(defn has-external-variable
  "it - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfVariableSpace this ^Integer it]
    (-> this (.hasExternalVariable it))))

(defn internal-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$HalfVariableSpace this]
    (-> this (.internalMemory))))

(defn get-variable
  "id - `int`
  idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariable [^Nd4jCuda$HalfVariableSpace this ^Integer id ^Integer idx]
    (-> this (.getVariable id idx)))
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariable [^Nd4jCuda$HalfVariableSpace this ^Integer id]
    (-> this (.getVariable id))))

