(ns org.nd4j.nativeblas.Nd4jCuda$DoubleResultSet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleResultSet]))

(defn ->double-result-set
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleResultSet [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleResultSet p))
  (^Nd4jCuda$DoubleResultSet []
    (new Nd4jCuda$DoubleResultSet )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleResultSet`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleResultSet [^Nd4jCuda$DoubleResultSet this ^Long position]
    (-> this (.position position))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleResultSet this]
    (-> this (.size))))

(defn at
  "idx - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray [^Nd4jCuda$DoubleResultSet this ^Long idx]
    (-> this (.at idx))))

(defn push-back
  "array - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  ([^Nd4jCuda$DoubleResultSet this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray array]
    (-> this (.push_back array))))

(defn status
  "returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$DoubleResultSet this]
    (-> this (.status))))

(defn set-status
  "status - `int`"
  ([^Nd4jCuda$DoubleResultSet this ^Integer status]
    (-> this (.setStatus status))))

(defn purge
  ""
  ([^Nd4jCuda$DoubleResultSet this]
    (-> this (.purge))))

(defn set-non-removable
  ""
  ([^Nd4jCuda$DoubleResultSet this]
    (-> this (.setNonRemovable))))

