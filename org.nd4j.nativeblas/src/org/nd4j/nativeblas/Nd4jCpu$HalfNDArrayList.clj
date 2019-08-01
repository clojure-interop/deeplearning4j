(ns org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayList
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfNDArrayList]))

(defn ->half-nd-array-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfNDArrayList [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfNDArrayList p)))

(defn counter
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfNDArrayList this]
    (-> this (.counter))))

(defn unstack
  "array - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`
  axis - `int`"
  ([^Nd4jCpu$HalfNDArrayList this ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray array ^Integer axis]
    (-> this (.unstack array axis))))

(defn height
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfNDArrayList this]
    (-> this (.height))))

(defn pick
  "indices - `org.bytedeco.javacpp.IntPointer`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray [^Nd4jCpu$HalfNDArrayList this ^org.bytedeco.javacpp.IntPointer indices]
    (-> this (.pick indices))))

(defn read-raw
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray [^Nd4jCpu$HalfNDArrayList this ^Integer idx]
    (-> this (.readRaw idx))))

(defn id
  "returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$HalfNDArrayList this]
    (-> this (.id))))

(defn read
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray [^Nd4jCpu$HalfNDArrayList this ^Integer idx]
    (-> this (.read idx))))

(defn name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCpu$HalfNDArrayList this]
    (-> this (.name))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$HalfNDArrayList this]
    (-> this (.workspace))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayList`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayList [^Nd4jCpu$HalfNDArrayList this]
    (-> this (.clone))))

(defn write
  "idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$HalfNDArrayList this ^Integer idx ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray array]
    (-> this (.write idx array))))

(defn equals
  "other - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayList`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$HalfNDArrayList this ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayList other]
    (-> this (.equals other))))

(defn elements
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfNDArrayList this]
    (-> this (.elements))))

(defn is-written
  "index - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$HalfNDArrayList this ^Integer index]
    (-> this (.isWritten index))))

(defn stack
  "returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray [^Nd4jCpu$HalfNDArrayList this]
    (-> this (.stack))))

