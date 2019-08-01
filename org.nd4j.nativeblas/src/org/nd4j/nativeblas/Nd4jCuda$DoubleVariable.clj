(ns org.nd4j.nativeblas.Nd4jCuda$DoubleVariable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleVariable]))

(defn ->double-variable
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleVariable [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleVariable p))
  (^Nd4jCuda$DoubleVariable [^java.lang.String name ^Integer id ^Integer idx]
    (new Nd4jCuda$DoubleVariable name id idx))
  (^Nd4jCuda$DoubleVariable [^java.lang.String name ^Integer id]
    (new Nd4jCuda$DoubleVariable name id))
  (^Nd4jCuda$DoubleVariable []
    (new Nd4jCuda$DoubleVariable )))

(defn index
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleVariable this]
    (-> this (.index))))

(defn set-variable-type
  "variable-type - `int`"
  ([^Nd4jCuda$DoubleVariable this ^Integer variable-type]
    (-> this (.setVariableType variable-type))))

(defn mark-external
  "This method returns InputType of this variable

  really-external - `boolean`"
  ([^Nd4jCuda$DoubleVariable this ^Boolean really-external]
    (-> this (.markExternal really-external))))

(defn set-nd-array
  "array - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  ([^Nd4jCuda$DoubleVariable this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray array]
    (-> this (.setNDArray array))))

(defn get-nd-array-list
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList [^Nd4jCuda$DoubleVariable this]
    (-> this (.getNDArrayList))))

(defn set-name
  "name - `org.bytedeco.javacpp.BytePointer`

  returns: `void setName( @`"
  ([^Nd4jCuda$DoubleVariable this ^org.bytedeco.javacpp.BytePointer name]
    (-> this (.setName name))))

(defn variable-type
  "returns: `(value="nd4j::graph::VariableType")  int`"
  ([^Nd4jCuda$DoubleVariable this]
    (-> this (.variableType))))

(defn id
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleVariable this]
    (-> this (.id))))

(defn mark-removable
  "really-removable - `boolean`"
  ([^Nd4jCuda$DoubleVariable this ^Boolean really-removable]
    (-> this (.markRemovable really-removable))))

(defn is-removable
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleVariable this]
    (-> this (.isRemovable))))

(defn get-name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCuda$DoubleVariable this]
    (-> this (.getName))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleVariable [^Nd4jCuda$DoubleVariable this ^Long position]
    (-> this (.position position))))

(defn set-id
  "id - `int`
  idx - `int`"
  ([^Nd4jCuda$DoubleVariable this ^Integer id ^Integer idx]
    (-> this (.setId id idx)))
  ([^Nd4jCuda$DoubleVariable this ^Integer id]
    (-> this (.setId id))))

(defn has-nd-array
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleVariable this]
    (-> this (.hasNDArray))))

(defn set-nd-array-list
  "list - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList`"
  ([^Nd4jCuda$DoubleVariable this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList list]
    (-> this (.setNDArrayList list))))

(defn is-placeholder
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleVariable this]
    (-> this (.isPlaceholder))))

(defn get-nd-array
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray [^Nd4jCuda$DoubleVariable this]
    (-> this (.getNDArray))))

(defn set-index
  "index - `int`"
  ([^Nd4jCuda$DoubleVariable this ^Integer index]
    (-> this (.setIndex index))))

(defn is-external
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleVariable this]
    (-> this (.isExternal))))

(defn mark-read-only
  "really-read-only - `boolean`"
  ([^Nd4jCuda$DoubleVariable this ^Boolean really-read-only]
    (-> this (.markReadOnly really-read-only))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleVariable [^Nd4jCuda$DoubleVariable this]
    (-> this (.clone))))

(defn is-empty
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleVariable this]
    (-> this (.isEmpty))))

(defn is-read-only
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleVariable this]
    (-> this (.isReadOnly))))

(defn has-nd-array-list
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleVariable this]
    (-> this (.hasNDArrayList))))

