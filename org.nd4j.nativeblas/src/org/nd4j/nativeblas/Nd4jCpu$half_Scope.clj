(ns org.nd4j.nativeblas.Nd4jCpu$half_Scope
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_Scope]))

(defn ->half-scope
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_Scope [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_Scope p))
  (^Nd4jCpu$half_Scope []
    (new Nd4jCpu$half_Scope )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_Scope`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_Scope [^Nd4jCpu$half_Scope this ^Long position]
    (-> this (.position position))))

