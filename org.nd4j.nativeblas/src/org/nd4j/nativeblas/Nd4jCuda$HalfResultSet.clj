(ns org.nd4j.nativeblas.Nd4jCuda$HalfResultSet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfResultSet]))

(defn ->half-result-set
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfResultSet [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfResultSet p))
  (^Nd4jCuda$HalfResultSet []
    (new Nd4jCuda$HalfResultSet )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfResultSet`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfResultSet [^Nd4jCuda$HalfResultSet this ^Long position]
    (-> this (.position position))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfResultSet this]
    (-> this (.size))))

(defn at
  "idx - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray [^Nd4jCuda$HalfResultSet this ^Long idx]
    (-> this (.at idx))))

(defn push-back
  "array - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  ([^Nd4jCuda$HalfResultSet this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray array]
    (-> this (.push_back array))))

(defn status
  "returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfResultSet this]
    (-> this (.status))))

(defn set-status
  "status - `int`"
  ([^Nd4jCuda$HalfResultSet this ^Integer status]
    (-> this (.setStatus status))))

(defn purge
  ""
  ([^Nd4jCuda$HalfResultSet this]
    (-> this (.purge))))

(defn set-non-removable
  ""
  ([^Nd4jCuda$HalfResultSet this]
    (-> this (.setNonRemovable))))

