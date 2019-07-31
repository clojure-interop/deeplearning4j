(ns org.nd4j.nativeblas.Nd4jCpu$double_testreduction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_testreduction]))

(defn ->double-testreduction
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_testreduction [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_testreduction p))
  (^Nd4jCpu$double_testreduction []
    (new Nd4jCpu$double_testreduction )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_testreduction`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_testreduction [^Nd4jCpu$double_testreduction this ^Long position]
    (-> this (.position position))))

