(ns org.nd4j.nativeblas.Nd4jCpu$half_testreduction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_testreduction]))

(defn ->half-testreduction
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_testreduction [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_testreduction p))
  (^Nd4jCpu$half_testreduction []
    (new Nd4jCpu$half_testreduction )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_testreduction`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_testreduction [^Nd4jCpu$half_testreduction this ^Long position]
    (-> this (.position position))))

