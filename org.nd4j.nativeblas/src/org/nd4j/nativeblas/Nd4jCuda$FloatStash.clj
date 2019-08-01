(ns org.nd4j.nativeblas.Nd4jCuda$FloatStash
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatStash]))

(defn ->float-stash
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatStash [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatStash p))
  (^Nd4jCuda$FloatStash []
    (new Nd4jCuda$FloatStash )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatStash`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatStash [^Nd4jCuda$FloatStash this ^Long position]
    (-> this (.position position))))

(defn store-array
  "name - `java.lang.String`
  array - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `void storeArray(int nodeId, @`"
  ([^Nd4jCuda$FloatStash this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray array]
    (-> this (.storeArray name array))))

(defn check-stash
  "name - `java.lang.String`

  returns: `(value="bool")  boolean checkStash(int nodeId, @`"
  ([^Nd4jCuda$FloatStash this ^java.lang.String name]
    (-> this (.checkStash name))))

(defn extract-array
  "name - `java.lang.String`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray extractArray(int nodeId, @`"
  ([^Nd4jCuda$FloatStash this ^java.lang.String name]
    (-> this (.extractArray name))))

(defn clear
  ""
  ([^Nd4jCuda$FloatStash this]
    (-> this (.clear))))

