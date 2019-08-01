(ns org.nd4j.nativeblas.Nd4jCuda$HalfVariable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfVariable]))

(defn ->half-variable
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfVariable [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfVariable p))
  (^Nd4jCuda$HalfVariable [^java.lang.String name ^Integer id ^Integer idx]
    (new Nd4jCuda$HalfVariable name id idx))
  (^Nd4jCuda$HalfVariable [^java.lang.String name ^Integer id]
    (new Nd4jCuda$HalfVariable name id))
  (^Nd4jCuda$HalfVariable []
    (new Nd4jCuda$HalfVariable )))

(defn index
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfVariable this]
    (-> this (.index))))

(defn set-variable-type
  "variable-type - `int`"
  ([^Nd4jCuda$HalfVariable this ^Integer variable-type]
    (-> this (.setVariableType variable-type))))

(defn mark-external
  "This method returns InputType of this variable

  really-external - `boolean`"
  ([^Nd4jCuda$HalfVariable this ^Boolean really-external]
    (-> this (.markExternal really-external))))

(defn set-nd-array
  "array - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  ([^Nd4jCuda$HalfVariable this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray array]
    (-> this (.setNDArray array))))

(defn get-nd-array-list
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList [^Nd4jCuda$HalfVariable this]
    (-> this (.getNDArrayList))))

(defn set-name
  "name - `org.bytedeco.javacpp.BytePointer`

  returns: `void setName( @`"
  ([^Nd4jCuda$HalfVariable this ^org.bytedeco.javacpp.BytePointer name]
    (-> this (.setName name))))

(defn variable-type
  "returns: `(value="nd4j::graph::VariableType")  int`"
  ([^Nd4jCuda$HalfVariable this]
    (-> this (.variableType))))

(defn id
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfVariable this]
    (-> this (.id))))

(defn mark-removable
  "really-removable - `boolean`"
  ([^Nd4jCuda$HalfVariable this ^Boolean really-removable]
    (-> this (.markRemovable really-removable))))

(defn is-removable
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfVariable this]
    (-> this (.isRemovable))))

(defn get-name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCuda$HalfVariable this]
    (-> this (.getName))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariable [^Nd4jCuda$HalfVariable this ^Long position]
    (-> this (.position position))))

(defn set-id
  "id - `int`
  idx - `int`"
  ([^Nd4jCuda$HalfVariable this ^Integer id ^Integer idx]
    (-> this (.setId id idx)))
  ([^Nd4jCuda$HalfVariable this ^Integer id]
    (-> this (.setId id))))

(defn has-nd-array
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfVariable this]
    (-> this (.hasNDArray))))

(defn set-nd-array-list
  "list - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList`"
  ([^Nd4jCuda$HalfVariable this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList list]
    (-> this (.setNDArrayList list))))

(defn is-placeholder
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfVariable this]
    (-> this (.isPlaceholder))))

(defn get-nd-array
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray [^Nd4jCuda$HalfVariable this]
    (-> this (.getNDArray))))

(defn set-index
  "index - `int`"
  ([^Nd4jCuda$HalfVariable this ^Integer index]
    (-> this (.setIndex index))))

(defn is-external
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfVariable this]
    (-> this (.isExternal))))

(defn mark-read-only
  "really-read-only - `boolean`"
  ([^Nd4jCuda$HalfVariable this ^Boolean really-read-only]
    (-> this (.markReadOnly really-read-only))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariable [^Nd4jCuda$HalfVariable this]
    (-> this (.clone))))

(defn is-empty
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfVariable this]
    (-> this (.isEmpty))))

(defn is-read-only
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfVariable this]
    (-> this (.isReadOnly))))

(defn has-nd-array-list
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfVariable this]
    (-> this (.hasNDArrayList))))

