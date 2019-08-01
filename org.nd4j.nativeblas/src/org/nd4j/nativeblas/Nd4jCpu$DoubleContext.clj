(ns org.nd4j.nativeblas.Nd4jCpu$DoubleContext
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleContext]))

(defn ->double-context
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleContext [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleContext p))
  (^Nd4jCpu$DoubleContext [^org.nd4j.nativeblas.Nd4jCpu$DoubleContextPrototype prototype ^org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace variable-space]
    (new Nd4jCpu$DoubleContext prototype variable-space)))

(defn is-value-available
  "idx - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleContext this ^Integer idx]
    (-> this (.isValueAvailable idx)))
  ([^Nd4jCpu$DoubleContext this]
    (-> this (.isValueAvailable))))

(defn has-workspace-provided
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleContext this]
    (-> this (.hasWorkspaceProvided))))

(defn set-outer-time
  "time - `long`"
  ([^Nd4jCpu$DoubleContext this ^Long time]
    (-> this (.setOuterTime time))))

(defn get-rng
  "returns: `org.nd4j.nativeblas.Nd4jCpu$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCpu$RandomBuffer [^Nd4jCpu$DoubleContext this]
    (-> this (.getRNG))))

(defn set-inner-time
  "time - `long`"
  ([^Nd4jCpu$DoubleContext this ^Long time]
    (-> this (.setInnerTime time))))

(defn get-inner-time
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$DoubleContext this]
    (-> this (.getInnerTime))))

(defn get-variable-space
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace [^Nd4jCpu$DoubleContext this]
    (-> this (.getVariableSpace))))

(defn set-branch
  "branch - `int`"
  ([^Nd4jCpu$DoubleContext this ^Integer branch]
    (-> this (.setBranch branch))))

(defn get-branch
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleContext this]
    (-> this (.getBranch))))

(defn set-variable-space
  "variable-space - `org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace`"
  ([^Nd4jCpu$DoubleContext this ^org.nd4j.nativeblas.Nd4jCpu$DoubleVariableSpace variable-space]
    (-> this (.setVariableSpace variable-space))))

(defn f-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$DoubleContext this]
    (-> this (.fWorkspace))))

(defn track-list
  "list - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList`"
  ([^Nd4jCpu$DoubleContext this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList list]
    (-> this (.trackList list))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$DoubleContext this]
    (-> this (.workspace))))

(defn t-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$DoubleContext this]
    (-> this (.tWorkspace))))

(defn variable
  "This method fetches variable from Workspace DIRECTLY

  node - `int`
  index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable [^Nd4jCpu$DoubleContext this ^Integer node ^Integer index]
    (-> this (.variable node index)))
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable [^Nd4jCpu$DoubleContext this ^Integer idx]
    (-> this (.variable idx))))

(defn set-rng
  "rng - `org.nd4j.nativeblas.Nd4jCpu$RandomBuffer`"
  ([^Nd4jCpu$DoubleContext this ^org.nd4j.nativeblas.Nd4jCpu$RandomBuffer rng]
    (-> this (.setRNG rng))))

(defn get-stash
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleStash`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleStash [^Nd4jCpu$DoubleContext this]
    (-> this (.getStash))))

(defn push-nd-array-list-to-variable-space
  "node-id - `int`
  index - `int`
  list - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList`"
  ([^Nd4jCpu$DoubleContext this ^Integer node-id ^Integer index ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList list]
    (-> this (.pushNDArrayListToVariableSpace node-id index list)))
  ([^Nd4jCpu$DoubleContext this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList list]
    (-> this (.pushNDArrayListToVariableSpace pair list)))
  ([^Nd4jCpu$DoubleContext this ^Boolean track]
    (-> this (.pushNDArrayListToVariableSpace track))))

(defn attach-workspace
  "workspace - `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  ([^Nd4jCpu$DoubleContext this ^org.nd4j.nativeblas.Nd4jCpu$Workspace workspace]
    (-> this (.attachWorkspace workspace))))

(defn get-outer-time
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$DoubleContext this]
    (-> this (.getOuterTime))))

(defn push-nd-array-to-variable-space
  "node-id - `int`
  index - `int`
  array - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  ([^Nd4jCpu$DoubleContext this ^Integer node-id ^Integer index ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray array]
    (-> this (.pushNDArrayToVariableSpace node-id index array)))
  ([^Nd4jCpu$DoubleContext this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray array]
    (-> this (.pushNDArrayToVariableSpace pair array)))
  ([^Nd4jCpu$DoubleContext this ^Boolean removable]
    (-> this (.pushNDArrayToVariableSpace removable))))

(defn ensure-variable
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable [^Nd4jCpu$DoubleContext this ^Integer idx]
    (-> this (.ensureVariable idx)))
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable [^Nd4jCpu$DoubleContext this]
    (-> this (.ensureVariable))))

(defn get-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$DoubleContext this]
    (-> this (.getWorkspace))))

(defn o-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$DoubleContext this]
    (-> this (.oWorkspace))))

(defn get-variable
  "This method returns variable for a given input index for this block

  idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable [^Nd4jCpu$DoubleContext this ^Integer idx]
    (-> this (.getVariable idx))))

(defn forget-workspace
  ""
  ([^Nd4jCpu$DoubleContext this]
    (-> this (.forgetWorkspace))))

