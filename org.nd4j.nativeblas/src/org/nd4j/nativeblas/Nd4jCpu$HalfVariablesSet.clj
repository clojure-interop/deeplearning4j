(ns org.nd4j.nativeblas.Nd4jCpu$HalfVariablesSet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfVariablesSet]))

(defn ->half-variables-set
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfVariablesSet [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfVariablesSet p))
  (^Nd4jCpu$HalfVariablesSet []
    (new Nd4jCpu$HalfVariablesSet )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfVariablesSet`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfVariablesSet [^Nd4jCpu$HalfVariablesSet this ^Long position]
    (-> this (.position position))))

(defn status
  "returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$HalfVariablesSet this]
    (-> this (.status))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfVariablesSet this]
    (-> this (.size))))

(defn push-back
  "variable - `org.nd4j.nativeblas.Nd4jCpu$HalfVariable`"
  ([^Nd4jCpu$HalfVariablesSet this ^org.nd4j.nativeblas.Nd4jCpu$HalfVariable variable]
    (-> this (.push_back variable))))

(defn at
  "index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfVariable`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfVariable [^Nd4jCpu$HalfVariablesSet this ^Integer index]
    (-> this (.at index))))

