(ns org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleVariableSpace]))

(defn ->double-variable-space
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleVariableSpace [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleVariableSpace p))
  (^Nd4jCpu$DoubleVariableSpace []
    (new Nd4jCpu$DoubleVariableSpace )))

(defn put-variable
  "id - `int`
  idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  ([^Nd4jCpu$DoubleVariableSpace this ^Integer id ^Integer idx ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray array]
    (-> this (.putVariable id idx array)))
  ([^Nd4jCpu$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray array]
    (-> this (.putVariable pair array))))

(defn put-output-variable
  "variable - `org.nd4j.nativeblas.Nd4jCpu$DoubleVariable`"
  ([^Nd4jCpu$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable variable]
    (-> this (.putOutputVariable variable))))

(defn total-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.totalMemory))))

(defn total-entries
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.totalEntries))))

(defn handles
  "returns: `(value="nd4j::graph::Variable<double>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.handles))))

(defn get-rng
  "returns: `org.nd4j.nativeblas.Nd4jCpu$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCpu$RandomBuffer [^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.getRNG))))

(defn inject-variable
  "pair - `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`
  variable - `org.nd4j.nativeblas.Nd4jCpu$DoubleVariable`"
  ([^Nd4jCpu$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable variable]
    (-> this (.injectVariable pair variable))))

(defn external-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.externalMemory))))

(defn put
  "other - `org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace`

  returns: `(value="operator =")  org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace`"
  ([^Nd4jCpu$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace other]
    (-> this (.put other))))

(defn number-of-placeholders
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.numberOfPlaceholders))))

(defn set-flow-path
  "timers - `org.nd4j.nativeblas.Nd4jCpu$FlowPath`"
  ([^Nd4jCpu$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$FlowPath timers]
    (-> this (.setFlowPath timers))))

(defn internal-entries
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.internalEntries))))

(defn set-workspace
  "workspace - `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  ([^Nd4jCpu$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$Workspace workspace]
    (-> this (.setWorkspace workspace))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace [^Nd4jCpu$DoubleVariableSpace this ^Long position]
    (-> this (.position position))))

(defn flow-path
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FlowPath`"
  (^org.nd4j.nativeblas.Nd4jCpu$FlowPath [^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.flowPath))))

(defn track-list
  "list - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList`"
  ([^Nd4jCpu$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList list]
    (-> this (.trackList list))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.workspace))))

(defn external-entries
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.externalEntries))))

(defn set-rng
  "rng - `org.nd4j.nativeblas.Nd4jCpu$RandomBuffer`"
  ([^Nd4jCpu$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$RandomBuffer rng]
    (-> this (.setRNG rng))))

(defn has-variable
  "id - `int`
  idx - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleVariableSpace this ^Integer id ^Integer idx]
    (-> this (.hasVariable id idx)))
  ([^Nd4jCpu$DoubleVariableSpace this ^Integer id]
    (-> this (.hasVariable id))))

(defn get-stash
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleStash`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleStash [^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.getStash))))

(defn get-external-variables
  "returns: `(value="nd4j::graph::Variable<double>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.getExternalVariables))))

(defn drop-variable
  "id - `int`
  idx - `int`"
  ([^Nd4jCpu$DoubleVariableSpace this ^Integer id ^Integer idx]
    (-> this (.dropVariable id idx)))
  ([^Nd4jCpu$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair]
    (-> this (.dropVariable pair))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace [^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.clone))))

(defn get-placeholders
  "returns: `(value="nd4j::graph::Variable<double>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.getPlaceholders))))

(defn has-external-variable
  "it - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleVariableSpace this ^Integer it]
    (-> this (.hasExternalVariable it))))

(defn internal-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$DoubleVariableSpace this]
    (-> this (.internalMemory))))

(defn get-variable
  "id - `int`
  idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable [^Nd4jCpu$DoubleVariableSpace this ^Integer id ^Integer idx]
    (-> this (.getVariable id idx)))
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable [^Nd4jCpu$DoubleVariableSpace this ^Integer id]
    (-> this (.getVariable id))))

