(ns org.nd4j.nativeblas.Nd4jCuda$HalfStash
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfStash]))

(defn ->half-stash
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfStash [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfStash p))
  (^Nd4jCuda$HalfStash []
    (new Nd4jCuda$HalfStash )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfStash`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfStash [^Nd4jCuda$HalfStash this ^Long position]
    (-> this (.position position))))

(defn store-array
  "name - `java.lang.String`
  array - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`

  returns: `void storeArray(int nodeId, @`"
  ([^Nd4jCuda$HalfStash this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray array]
    (-> this (.storeArray name array))))

(defn check-stash
  "name - `java.lang.String`

  returns: `(value="bool")  boolean checkStash(int nodeId, @`"
  ([^Nd4jCuda$HalfStash this ^java.lang.String name]
    (-> this (.checkStash name))))

(defn extract-array
  "name - `java.lang.String`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray extractArray(int nodeId, @`"
  ([^Nd4jCuda$HalfStash this ^java.lang.String name]
    (-> this (.extractArray name))))

(defn clear
  ""
  ([^Nd4jCuda$HalfStash this]
    (-> this (.clear))))

