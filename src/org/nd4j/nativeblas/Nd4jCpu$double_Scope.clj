(ns org.nd4j.nativeblas.Nd4jCpu$double_Scope
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_Scope]))

(defn ->double-scope
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_Scope [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_Scope p))
  (^Nd4jCpu$double_Scope []
    (new Nd4jCpu$double_Scope )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_Scope`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_Scope [^Nd4jCpu$double_Scope this ^Long position]
    (-> this (.position position))))

