(ns org.nd4j.nativeblas.Nd4jCpu$float_Scope
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_Scope]))

(defn ->float-scope
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_Scope [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_Scope p))
  (^Nd4jCpu$float_Scope []
    (new Nd4jCpu$float_Scope )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_Scope`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_Scope [^Nd4jCpu$float_Scope this ^Long position]
    (-> this (.position position))))

