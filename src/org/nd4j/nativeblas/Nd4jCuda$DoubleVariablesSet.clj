(ns org.nd4j.nativeblas.Nd4jCuda$DoubleVariablesSet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleVariablesSet]))

(defn ->double-variables-set
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleVariablesSet [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleVariablesSet p))
  (^Nd4jCuda$DoubleVariablesSet []
    (new Nd4jCuda$DoubleVariablesSet )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleVariablesSet`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleVariablesSet [^Nd4jCuda$DoubleVariablesSet this ^Long position]
    (-> this (.position position))))

(defn status
  "returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$DoubleVariablesSet this]
    (-> this (.status))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCuda$DoubleVariablesSet this]
    (-> this (.size))))

(defn push-back
  "variable - `org.nd4j.nativeblas.Nd4jCuda$DoubleVariable`"
  ([^Nd4jCuda$DoubleVariablesSet this ^org.nd4j.nativeblas.Nd4jCuda$DoubleVariable variable]
    (-> this (.push_back variable))))

(defn at
  "index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleVariable [^Nd4jCuda$DoubleVariablesSet this ^Integer index]
    (-> this (.at index))))

