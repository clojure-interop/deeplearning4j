(ns org.nd4j.nativeblas.Nd4jCpu$HalfStash
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfStash]))

(defn ->half-stash
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfStash [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfStash p))
  (^Nd4jCpu$HalfStash []
    (new Nd4jCpu$HalfStash )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfStash`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfStash [^Nd4jCpu$HalfStash this ^Long position]
    (-> this (.position position))))

(defn store-array
  "name - `java.lang.String`
  array - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`

  returns: `void storeArray(int nodeId, @`"
  ([^Nd4jCpu$HalfStash this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray array]
    (-> this (.storeArray name array))))

(defn check-stash
  "name - `java.lang.String`

  returns: `(value="bool")  boolean checkStash(int nodeId, @`"
  ([^Nd4jCpu$HalfStash this ^java.lang.String name]
    (-> this (.checkStash name))))

(defn extract-array
  "name - `java.lang.String`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray extractArray(int nodeId, @`"
  ([^Nd4jCpu$HalfStash this ^java.lang.String name]
    (-> this (.extractArray name))))

(defn clear
  ""
  ([^Nd4jCpu$HalfStash this]
    (-> this (.clear))))

