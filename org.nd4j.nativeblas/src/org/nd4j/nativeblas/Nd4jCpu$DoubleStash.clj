(ns org.nd4j.nativeblas.Nd4jCpu$DoubleStash
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleStash]))

(defn ->double-stash
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleStash [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleStash p))
  (^Nd4jCpu$DoubleStash []
    (new Nd4jCpu$DoubleStash )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleStash`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleStash [^Nd4jCpu$DoubleStash this ^Long position]
    (-> this (.position position))))

(defn store-array
  "name - `java.lang.String`
  array - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`

  returns: `void storeArray(int nodeId, @`"
  ([^Nd4jCpu$DoubleStash this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray array]
    (-> this (.storeArray name array))))

(defn check-stash
  "name - `java.lang.String`

  returns: `(value="bool")  boolean checkStash(int nodeId, @`"
  ([^Nd4jCpu$DoubleStash this ^java.lang.String name]
    (-> this (.checkStash name))))

(defn extract-array
  "name - `java.lang.String`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray extractArray(int nodeId, @`"
  ([^Nd4jCpu$DoubleStash this ^java.lang.String name]
    (-> this (.extractArray name))))

(defn clear
  ""
  ([^Nd4jCpu$DoubleStash this]
    (-> this (.clear))))

