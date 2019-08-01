(ns org.nd4j.nativeblas.Nd4jCpu$HalfResultSet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfResultSet]))

(defn ->half-result-set
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfResultSet [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfResultSet p))
  (^Nd4jCpu$HalfResultSet []
    (new Nd4jCpu$HalfResultSet )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfResultSet`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfResultSet [^Nd4jCpu$HalfResultSet this ^Long position]
    (-> this (.position position))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfResultSet this]
    (-> this (.size))))

(defn at
  "idx - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray [^Nd4jCpu$HalfResultSet this ^Long idx]
    (-> this (.at idx))))

(defn push-back
  "array - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`"
  ([^Nd4jCpu$HalfResultSet this ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray array]
    (-> this (.push_back array))))

(defn status
  "returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$HalfResultSet this]
    (-> this (.status))))

(defn set-status
  "status - `int`"
  ([^Nd4jCpu$HalfResultSet this ^Integer status]
    (-> this (.setStatus status))))

(defn purge
  ""
  ([^Nd4jCpu$HalfResultSet this]
    (-> this (.purge))))

(defn set-non-removable
  ""
  ([^Nd4jCpu$HalfResultSet this]
    (-> this (.setNonRemovable))))

