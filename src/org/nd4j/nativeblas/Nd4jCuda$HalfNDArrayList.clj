(ns org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfNDArrayList]))

(defn ->half-nd-array-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfNDArrayList [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfNDArrayList p)))

(defn counter
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfNDArrayList this]
    (-> this (.counter))))

(defn unstack
  "array - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`
  axis - `int`"
  ([^Nd4jCuda$HalfNDArrayList this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray array ^Integer axis]
    (-> this (.unstack array axis))))

(defn height
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfNDArrayList this]
    (-> this (.height))))

(defn pick
  "indices - `org.bytedeco.javacpp.IntPointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray [^Nd4jCuda$HalfNDArrayList this ^org.bytedeco.javacpp.IntPointer indices]
    (-> this (.pick indices))))

(defn read-raw
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray [^Nd4jCuda$HalfNDArrayList this ^Integer idx]
    (-> this (.readRaw idx))))

(defn id
  "returns: `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCuda$IntIntPair [^Nd4jCuda$HalfNDArrayList this]
    (-> this (.id))))

(defn read
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray [^Nd4jCuda$HalfNDArrayList this ^Integer idx]
    (-> this (.read idx))))

(defn name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCuda$HalfNDArrayList this]
    (-> this (.name))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$HalfNDArrayList this]
    (-> this (.workspace))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList [^Nd4jCuda$HalfNDArrayList this]
    (-> this (.clone))))

(defn write
  "idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfNDArrayList this ^Integer idx ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray array]
    (-> this (.write idx array))))

(defn equals
  "other - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfNDArrayList this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayList other]
    (-> this (.equals other))))

(defn elements
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfNDArrayList this]
    (-> this (.elements))))

(defn is-written
  "index - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfNDArrayList this ^Integer index]
    (-> this (.isWritten index))))

(defn stack
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray [^Nd4jCuda$HalfNDArrayList this]
    (-> this (.stack))))

