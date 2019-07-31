(ns org.nd4j.nativeblas.Nd4jCpu$DoubleVariable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleVariable]))

(defn ->double-variable
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleVariable [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleVariable p))
  (^Nd4jCpu$DoubleVariable [^java.lang.String name ^Integer id ^Integer idx]
    (new Nd4jCpu$DoubleVariable name id idx))
  (^Nd4jCpu$DoubleVariable [^java.lang.String name ^Integer id]
    (new Nd4jCpu$DoubleVariable name id))
  (^Nd4jCpu$DoubleVariable []
    (new Nd4jCpu$DoubleVariable )))

(defn index
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleVariable this]
    (-> this (.index))))

(defn set-variable-type
  "variable-type - `int`"
  ([^Nd4jCpu$DoubleVariable this ^Integer variable-type]
    (-> this (.setVariableType variable-type))))

(defn mark-external
  "This method returns InputType of this variable

  really-external - `boolean`"
  ([^Nd4jCpu$DoubleVariable this ^Boolean really-external]
    (-> this (.markExternal really-external))))

(defn set-nd-array
  "array - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  ([^Nd4jCpu$DoubleVariable this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray array]
    (-> this (.setNDArray array))))

(defn get-nd-array-list
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList [^Nd4jCpu$DoubleVariable this]
    (-> this (.getNDArrayList))))

(defn set-name
  "name - `org.bytedeco.javacpp.BytePointer`

  returns: `void setName( @`"
  ([^Nd4jCpu$DoubleVariable this ^org.bytedeco.javacpp.BytePointer name]
    (-> this (.setName name))))

(defn variable-type
  "returns: `(value="nd4j::graph::VariableType")  int`"
  ([^Nd4jCpu$DoubleVariable this]
    (-> this (.variableType))))

(defn id
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleVariable this]
    (-> this (.id))))

(defn mark-removable
  "really-removable - `boolean`"
  ([^Nd4jCpu$DoubleVariable this ^Boolean really-removable]
    (-> this (.markRemovable really-removable))))

(defn is-removable
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleVariable this]
    (-> this (.isRemovable))))

(defn get-name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCpu$DoubleVariable this]
    (-> this (.getName))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable [^Nd4jCpu$DoubleVariable this ^Long position]
    (-> this (.position position))))

(defn set-id
  "id - `int`
  idx - `int`"
  ([^Nd4jCpu$DoubleVariable this ^Integer id ^Integer idx]
    (-> this (.setId id idx)))
  ([^Nd4jCpu$DoubleVariable this ^Integer id]
    (-> this (.setId id))))

(defn has-nd-array
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleVariable this]
    (-> this (.hasNDArray))))

(defn set-nd-array-list
  "list - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList`"
  ([^Nd4jCpu$DoubleVariable this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList list]
    (-> this (.setNDArrayList list))))

(defn is-placeholder
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleVariable this]
    (-> this (.isPlaceholder))))

(defn get-nd-array
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray [^Nd4jCpu$DoubleVariable this]
    (-> this (.getNDArray))))

(defn set-index
  "index - `int`"
  ([^Nd4jCpu$DoubleVariable this ^Integer index]
    (-> this (.setIndex index))))

(defn is-external
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleVariable this]
    (-> this (.isExternal))))

(defn mark-read-only
  "really-read-only - `boolean`"
  ([^Nd4jCpu$DoubleVariable this ^Boolean really-read-only]
    (-> this (.markReadOnly really-read-only))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable [^Nd4jCpu$DoubleVariable this]
    (-> this (.clone))))

(defn is-empty
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleVariable this]
    (-> this (.isEmpty))))

(defn is-read-only
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleVariable this]
    (-> this (.isReadOnly))))

(defn has-nd-array-list
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleVariable this]
    (-> this (.hasNDArrayList))))

