(ns org.nd4j.nativeblas.Nd4jCuda$FloatContext
  "This class defines input desired for any given node/operation within graph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatContext]))

(defn ->float-context
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatContext [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatContext p))
  (^Nd4jCuda$FloatContext [^org.nd4j.nativeblas.Nd4jCuda$FloatContextPrototype prototype ^org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace variable-space]
    (new Nd4jCuda$FloatContext prototype variable-space)))

(defn is-value-available
  "idx - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatContext this ^Integer idx]
    (-> this (.isValueAvailable idx)))
  ([^Nd4jCuda$FloatContext this]
    (-> this (.isValueAvailable))))

(defn has-workspace-provided
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatContext this]
    (-> this (.hasWorkspaceProvided))))

(defn set-outer-time
  "time - `long`"
  ([^Nd4jCuda$FloatContext this ^Long time]
    (-> this (.setOuterTime time))))

(defn get-rng
  "returns: `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer [^Nd4jCuda$FloatContext this]
    (-> this (.getRNG))))

(defn set-inner-time
  "time - `long`"
  ([^Nd4jCuda$FloatContext this ^Long time]
    (-> this (.setInnerTime time))))

(defn get-inner-time
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatContext this]
    (-> this (.getInnerTime))))

(defn get-variable-space
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace [^Nd4jCuda$FloatContext this]
    (-> this (.getVariableSpace))))

(defn set-branch
  "branch - `int`"
  ([^Nd4jCuda$FloatContext this ^Integer branch]
    (-> this (.setBranch branch))))

(defn get-branch
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatContext this]
    (-> this (.getBranch))))

(defn set-variable-space
  "variable-space - `org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace`"
  ([^Nd4jCuda$FloatContext this ^org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace variable-space]
    (-> this (.setVariableSpace variable-space))))

(defn f-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$FloatContext this]
    (-> this (.fWorkspace))))

(defn track-list
  "list - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList`"
  ([^Nd4jCuda$FloatContext this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList list]
    (-> this (.trackList list))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$FloatContext this]
    (-> this (.workspace))))

(defn t-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$FloatContext this]
    (-> this (.tWorkspace))))

(defn variable
  "This method fetches variable from Workspace DIRECTLY

  node - `int`
  index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariable [^Nd4jCuda$FloatContext this ^Integer node ^Integer index]
    (-> this (.variable node index)))
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariable [^Nd4jCuda$FloatContext this ^Integer idx]
    (-> this (.variable idx))))

(defn set-rng
  "rng - `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  ([^Nd4jCuda$FloatContext this ^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer rng]
    (-> this (.setRNG rng))))

(defn get-stash
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatStash`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatStash [^Nd4jCuda$FloatContext this]
    (-> this (.getStash))))

(defn push-nd-array-list-to-variable-space
  "node-id - `int`
  index - `int`
  list - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList`"
  ([^Nd4jCuda$FloatContext this ^Integer node-id ^Integer index ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList list]
    (-> this (.pushNDArrayListToVariableSpace node-id index list)))
  ([^Nd4jCuda$FloatContext this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList list]
    (-> this (.pushNDArrayListToVariableSpace pair list)))
  ([^Nd4jCuda$FloatContext this ^Boolean track]
    (-> this (.pushNDArrayListToVariableSpace track))))

(defn attach-workspace
  "workspace - `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  ([^Nd4jCuda$FloatContext this ^org.nd4j.nativeblas.Nd4jCuda$Workspace workspace]
    (-> this (.attachWorkspace workspace))))

(defn get-outer-time
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatContext this]
    (-> this (.getOuterTime))))

(defn push-nd-array-to-variable-space
  "node-id - `int`
  index - `int`
  array - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatContext this ^Integer node-id ^Integer index ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray array]
    (-> this (.pushNDArrayToVariableSpace node-id index array)))
  ([^Nd4jCuda$FloatContext this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray array]
    (-> this (.pushNDArrayToVariableSpace pair array)))
  ([^Nd4jCuda$FloatContext this ^Boolean removable]
    (-> this (.pushNDArrayToVariableSpace removable))))

(defn ensure-variable
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariable [^Nd4jCuda$FloatContext this ^Integer idx]
    (-> this (.ensureVariable idx)))
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariable [^Nd4jCuda$FloatContext this]
    (-> this (.ensureVariable))))

(defn get-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$FloatContext this]
    (-> this (.getWorkspace))))

(defn o-workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$FloatContext this]
    (-> this (.oWorkspace))))

(defn get-variable
  "This method returns variable for a given input index for this block

  idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariable [^Nd4jCuda$FloatContext this ^Integer idx]
    (-> this (.getVariable idx))))

(defn forget-workspace
  ""
  ([^Nd4jCuda$FloatContext this]
    (-> this (.forgetWorkspace))))

