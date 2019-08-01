(ns org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleNDArrayList]))

(defn ->double-nd-array-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleNDArrayList [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleNDArrayList p)))

(defn counter
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleNDArrayList this]
    (-> this (.counter))))

(defn unstack
  "array - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`
  axis - `int`"
  ([^Nd4jCuda$DoubleNDArrayList this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray array ^Integer axis]
    (-> this (.unstack array axis))))

(defn height
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleNDArrayList this]
    (-> this (.height))))

(defn pick
  "indices - `org.bytedeco.javacpp.IntPointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray [^Nd4jCuda$DoubleNDArrayList this ^org.bytedeco.javacpp.IntPointer indices]
    (-> this (.pick indices))))

(defn read-raw
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray [^Nd4jCuda$DoubleNDArrayList this ^Integer idx]
    (-> this (.readRaw idx))))

(defn id
  "returns: `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCuda$IntIntPair [^Nd4jCuda$DoubleNDArrayList this]
    (-> this (.id))))

(defn read
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray [^Nd4jCuda$DoubleNDArrayList this ^Integer idx]
    (-> this (.read idx))))

(defn name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCuda$DoubleNDArrayList this]
    (-> this (.name))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$DoubleNDArrayList this]
    (-> this (.workspace))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList [^Nd4jCuda$DoubleNDArrayList this]
    (-> this (.clone))))

(defn write
  "idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$DoubleNDArrayList this ^Integer idx ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray array]
    (-> this (.write idx array))))

(defn equals
  "other - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleNDArrayList this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList other]
    (-> this (.equals other))))

(defn elements
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleNDArrayList this]
    (-> this (.elements))))

(defn is-written
  "index - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleNDArrayList this ^Integer index]
    (-> this (.isWritten index))))

(defn stack
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray [^Nd4jCuda$DoubleNDArrayList this]
    (-> this (.stack))))

