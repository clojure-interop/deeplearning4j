(ns org.nd4j.nativeblas.Nd4jCuda$DoubleStash
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleStash]))

(defn ->double-stash
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleStash [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleStash p))
  (^Nd4jCuda$DoubleStash []
    (new Nd4jCuda$DoubleStash )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleStash`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleStash [^Nd4jCuda$DoubleStash this ^Long position]
    (-> this (.position position))))

(defn store-array
  "name - `java.lang.String`
  array - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`

  returns: `void storeArray(int nodeId, @`"
  ([^Nd4jCuda$DoubleStash this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray array]
    (-> this (.storeArray name array))))

(defn check-stash
  "name - `java.lang.String`

  returns: `(value="bool")  boolean checkStash(int nodeId, @`"
  ([^Nd4jCuda$DoubleStash this ^java.lang.String name]
    (-> this (.checkStash name))))

(defn extract-array
  "name - `java.lang.String`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray extractArray(int nodeId, @`"
  ([^Nd4jCuda$DoubleStash this ^java.lang.String name]
    (-> this (.extractArray name))))

(defn clear
  ""
  ([^Nd4jCuda$DoubleStash this]
    (-> this (.clear))))

