(ns org.nd4j.nativeblas.Nd4jCuda$HalfContext
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfContext]))

(defn ->half-context
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfContext [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfContext p))
  (^Nd4jCuda$HalfContext [^org.nd4j.nativeblas.Nd4jCuda$HalfContextPrototype prototype ^org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace variable-space]
    (new Nd4jCuda$HalfContext prototype variable-space)))

(defn is-value-available
  "idx - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfContext this ^Integer idx]
    (-> this (.isValueAvailable idx)))
  ([^Nd4jCuda$HalfContext this]
    (-> this (.isValueAvailable))))

(defn has-workspace-provided
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfContext this]
    (-> this (.hasWorkspaceProvided))))

(defn set-outer-time
  "time - `long`"
  ([^Nd4jCuda$HalfContext this ^Long time]
    (-> this (.setOuterTime time))))

(defn get-rng
  "returns: `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer [^Nd4jCuda$HalfContext this]
    (-> this (.getRNG))))

(defn set-inner-time
  "time - `long`"
  ([^Nd4jCuda$HalfContext this ^Long time]
    (-> this (.setInnerTime time))))

(defn get-inner-time
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$HalfContext this]
    (-> this (.getInnerTime))))

(defn get-variable-space
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace [^Nd4jCuda$HalfContext this]
    (-> this (.getVariableSpace))))

(defn set-branch
  "branch - `int`"
  ([^Nd4jCuda$HalfContext this ^Integer branch]
    (-> this (.setBranch branch))))

(defn get-branch
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfContext this]
    (-> this (.getBranch))))

(defn set-variable-space
  "variable-space - `org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace`"
  ([^Nd4jCuda$HalfContext this ^org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace variable-space]
    (-> this (.setVariableSpace variable-space))))

(defn f-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$HalfContext this]
    (-> this (.fWorkspace))))

(defn track-list
  "list - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList`"
  ([^Nd4jCuda$HalfContext this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList list]
    (-> this (.trackList list))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$HalfContext this]
    (-> this (.workspace))))

(defn t-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$HalfContext this]
    (-> this (.tWorkspace))))

(defn variable
  "This method fetches variable from Workspace DIRECTLY

  node - `int`
  index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariable [^Nd4jCuda$HalfContext this ^Integer node ^Integer index]
    (-> this (.variable node index)))
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariable [^Nd4jCuda$HalfContext this ^Integer idx]
    (-> this (.variable idx))))

(defn set-rng
  "rng - `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  ([^Nd4jCuda$HalfContext this ^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer rng]
    (-> this (.setRNG rng))))

(defn get-stash
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfStash`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfStash [^Nd4jCuda$HalfContext this]
    (-> this (.getStash))))

(defn push-nd-array-list-to-variable-space
  "node-id - `int`
  index - `int`
  list - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList`"
  ([^Nd4jCuda$HalfContext this ^Integer node-id ^Integer index ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList list]
    (-> this (.pushNDArrayListToVariableSpace node-id index list)))
  ([^Nd4jCuda$HalfContext this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList list]
    (-> this (.pushNDArrayListToVariableSpace pair list)))
  ([^Nd4jCuda$HalfContext this ^Boolean track]
    (-> this (.pushNDArrayListToVariableSpace track))))

(defn attach-workspace
  "workspace - `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  ([^Nd4jCuda$HalfContext this ^org.nd4j.nativeblas.Nd4jCuda$Workspace workspace]
    (-> this (.attachWorkspace workspace))))

(defn get-outer-time
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$HalfContext this]
    (-> this (.getOuterTime))))

(defn push-nd-array-to-variable-space
  "node-id - `int`
  index - `int`
  array - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  ([^Nd4jCuda$HalfContext this ^Integer node-id ^Integer index ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray array]
    (-> this (.pushNDArrayToVariableSpace node-id index array)))
  ([^Nd4jCuda$HalfContext this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray array]
    (-> this (.pushNDArrayToVariableSpace pair array)))
  ([^Nd4jCuda$HalfContext this ^Boolean removable]
    (-> this (.pushNDArrayToVariableSpace removable))))

(defn ensure-variable
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariable [^Nd4jCuda$HalfContext this ^Integer idx]
    (-> this (.ensureVariable idx)))
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariable [^Nd4jCuda$HalfContext this]
    (-> this (.ensureVariable))))

(defn get-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$HalfContext this]
    (-> this (.getWorkspace))))

(defn o-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$HalfContext this]
    (-> this (.oWorkspace))))

(defn get-variable
  "This method returns variable for a given input index for this block

  idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariable [^Nd4jCuda$HalfContext this ^Integer idx]
    (-> this (.getVariable idx))))

(defn forget-workspace
  ""
  ([^Nd4jCuda$HalfContext this]
    (-> this (.forgetWorkspace))))

