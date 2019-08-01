(ns org.nd4j.nativeblas.Nd4jCuda$DoubleVariableSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleVariableSpace]))

(defn ->double-variable-space
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleVariableSpace [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleVariableSpace p))
  (^Nd4jCuda$DoubleVariableSpace []
    (new Nd4jCuda$DoubleVariableSpace )))

(defn put-variable
  "id - `int`
  idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  ([^Nd4jCuda$DoubleVariableSpace this ^Integer id ^Integer idx ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray array]
    (-> this (.putVariable id idx array)))
  ([^Nd4jCuda$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray array]
    (-> this (.putVariable pair array))))

(defn put-output-variable
  "variable - `org.nd4j.nativeblas.Nd4jCuda$DoubleVariable`"
  ([^Nd4jCuda$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$DoubleVariable variable]
    (-> this (.putOutputVariable variable))))

(defn total-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.totalMemory))))

(defn total-entries
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.totalEntries))))

(defn handles
  "returns: `(value="nd4j::graph::Variable<double>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.handles))))

(defn get-rng
  "returns: `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer [^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.getRNG))))

(defn inject-variable
  "pair - `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`
  variable - `org.nd4j.nativeblas.Nd4jCuda$DoubleVariable`"
  ([^Nd4jCuda$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCuda$DoubleVariable variable]
    (-> this (.injectVariable pair variable))))

(defn external-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.externalMemory))))

(defn put
  "other - `org.nd4j.nativeblas.Nd4jCuda$DoubleVariableSpace`

  returns: `(value="operator =")  org.nd4j.nativeblas.Nd4jCuda$DoubleVariableSpace`"
  ([^Nd4jCuda$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$DoubleVariableSpace other]
    (-> this (.put other))))

(defn number-of-placeholders
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.numberOfPlaceholders))))

(defn set-flow-path
  "timers - `org.nd4j.nativeblas.Nd4jCuda$FlowPath`"
  ([^Nd4jCuda$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$FlowPath timers]
    (-> this (.setFlowPath timers))))

(defn internal-entries
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.internalEntries))))

(defn set-workspace
  "workspace - `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  ([^Nd4jCuda$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$Workspace workspace]
    (-> this (.setWorkspace workspace))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleVariableSpace [^Nd4jCuda$DoubleVariableSpace this ^Long position]
    (-> this (.position position))))

(defn flow-path
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FlowPath`"
  (^org.nd4j.nativeblas.Nd4jCuda$FlowPath [^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.flowPath))))

(defn track-list
  "list - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList`"
  ([^Nd4jCuda$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList list]
    (-> this (.trackList list))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.workspace))))

(defn external-entries
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.externalEntries))))

(defn set-rng
  "rng - `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  ([^Nd4jCuda$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer rng]
    (-> this (.setRNG rng))))

(defn has-variable
  "id - `int`
  idx - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleVariableSpace this ^Integer id ^Integer idx]
    (-> this (.hasVariable id idx)))
  ([^Nd4jCuda$DoubleVariableSpace this ^Integer id]
    (-> this (.hasVariable id))))

(defn get-stash
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleStash`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleStash [^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.getStash))))

(defn get-external-variables
  "returns: `(value="nd4j::graph::Variable<double>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.getExternalVariables))))

(defn drop-variable
  "id - `int`
  idx - `int`"
  ([^Nd4jCuda$DoubleVariableSpace this ^Integer id ^Integer idx]
    (-> this (.dropVariable id idx)))
  ([^Nd4jCuda$DoubleVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair]
    (-> this (.dropVariable pair))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleVariableSpace [^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.clone))))

(defn get-placeholders
  "returns: `(value="nd4j::graph::Variable<double>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.getPlaceholders))))

(defn has-external-variable
  "it - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleVariableSpace this ^Integer it]
    (-> this (.hasExternalVariable it))))

(defn internal-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$DoubleVariableSpace this]
    (-> this (.internalMemory))))

(defn get-variable
  "id - `int`
  idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleVariable [^Nd4jCuda$DoubleVariableSpace this ^Integer id ^Integer idx]
    (-> this (.getVariable id idx)))
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleVariable [^Nd4jCuda$DoubleVariableSpace this ^Integer id]
    (-> this (.getVariable id))))

