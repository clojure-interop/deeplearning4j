(ns org.nd4j.nativeblas.Nd4jCpu$float_testreduction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_testreduction]))

(defn ->float-testreduction
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_testreduction [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_testreduction p))
  (^Nd4jCpu$float_testreduction []
    (new Nd4jCpu$float_testreduction )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_testreduction`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_testreduction [^Nd4jCpu$float_testreduction this ^Long position]
    (-> this (.position position))))

