(ns org.nd4j.nativeblas.Nd4jCpu$DoubleVariablesSet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleVariablesSet]))

(defn ->double-variables-set
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleVariablesSet [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleVariablesSet p))
  (^Nd4jCpu$DoubleVariablesSet []
    (new Nd4jCpu$DoubleVariablesSet )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariablesSet`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariablesSet [^Nd4jCpu$DoubleVariablesSet this ^Long position]
    (-> this (.position position))))

(defn status
  "returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$DoubleVariablesSet this]
    (-> this (.status))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleVariablesSet this]
    (-> this (.size))))

(defn push-back
  "variable - `org.nd4j.nativeblas.Nd4jCpu$DoubleVariable`"
  ([^Nd4jCpu$DoubleVariablesSet this ^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable variable]
    (-> this (.push_back variable))))

(defn at
  "index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleVariable [^Nd4jCpu$DoubleVariablesSet this ^Integer index]
    (-> this (.at index))))

