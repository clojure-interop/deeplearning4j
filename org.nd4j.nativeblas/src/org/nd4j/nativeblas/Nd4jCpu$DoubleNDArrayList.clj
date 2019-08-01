(ns org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleNDArrayList]))

(defn ->double-nd-array-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleNDArrayList [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleNDArrayList p)))

(defn counter
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleNDArrayList this]
    (-> this (.counter))))

(defn unstack
  "array - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`
  axis - `int`"
  ([^Nd4jCpu$DoubleNDArrayList this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray array ^Integer axis]
    (-> this (.unstack array axis))))

(defn height
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleNDArrayList this]
    (-> this (.height))))

(defn pick
  "indices - `org.bytedeco.javacpp.IntPointer`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray [^Nd4jCpu$DoubleNDArrayList this ^org.bytedeco.javacpp.IntPointer indices]
    (-> this (.pick indices))))

(defn read-raw
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray [^Nd4jCpu$DoubleNDArrayList this ^Integer idx]
    (-> this (.readRaw idx))))

(defn id
  "returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$DoubleNDArrayList this]
    (-> this (.id))))

(defn read
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray [^Nd4jCpu$DoubleNDArrayList this ^Integer idx]
    (-> this (.read idx))))

(defn name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCpu$DoubleNDArrayList this]
    (-> this (.name))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$DoubleNDArrayList this]
    (-> this (.workspace))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList [^Nd4jCpu$DoubleNDArrayList this]
    (-> this (.clone))))

(defn write
  "idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$DoubleNDArrayList this ^Integer idx ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray array]
    (-> this (.write idx array))))

(defn equals
  "other - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleNDArrayList this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList other]
    (-> this (.equals other))))

(defn elements
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleNDArrayList this]
    (-> this (.elements))))

(defn is-written
  "index - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleNDArrayList this ^Integer index]
    (-> this (.isWritten index))))

(defn stack
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray [^Nd4jCpu$DoubleNDArrayList this]
    (-> this (.stack))))

