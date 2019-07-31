(ns org.nd4j.nativeblas.Nd4jCuda$HalfVariablesSet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfVariablesSet]))

(defn ->half-variables-set
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfVariablesSet [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfVariablesSet p))
  (^Nd4jCuda$HalfVariablesSet []
    (new Nd4jCuda$HalfVariablesSet )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariablesSet`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariablesSet [^Nd4jCuda$HalfVariablesSet this ^Long position]
    (-> this (.position position))))

(defn status
  "returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfVariablesSet this]
    (-> this (.status))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCuda$HalfVariablesSet this]
    (-> this (.size))))

(defn push-back
  "variable - `org.nd4j.nativeblas.Nd4jCuda$HalfVariable`"
  ([^Nd4jCuda$HalfVariablesSet this ^org.nd4j.nativeblas.Nd4jCuda$HalfVariable variable]
    (-> this (.push_back variable))))

(defn at
  "index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariable [^Nd4jCuda$HalfVariablesSet this ^Integer index]
    (-> this (.at index))))

