(ns org.nd4j.nativeblas.Nd4jCpu$DoubleResultSet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleResultSet]))

(defn ->double-result-set
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleResultSet [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleResultSet p))
  (^Nd4jCpu$DoubleResultSet []
    (new Nd4jCpu$DoubleResultSet )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleResultSet`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleResultSet [^Nd4jCpu$DoubleResultSet this ^Long position]
    (-> this (.position position))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleResultSet this]
    (-> this (.size))))

(defn at
  "idx - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray [^Nd4jCpu$DoubleResultSet this ^Long idx]
    (-> this (.at idx))))

(defn push-back
  "array - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  ([^Nd4jCpu$DoubleResultSet this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray array]
    (-> this (.push_back array))))

(defn status
  "returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$DoubleResultSet this]
    (-> this (.status))))

(defn set-status
  "status - `int`"
  ([^Nd4jCpu$DoubleResultSet this ^Integer status]
    (-> this (.setStatus status))))

(defn purge
  ""
  ([^Nd4jCpu$DoubleResultSet this]
    (-> this (.purge))))

(defn set-non-removable
  ""
  ([^Nd4jCpu$DoubleResultSet this]
    (-> this (.setNonRemovable))))

