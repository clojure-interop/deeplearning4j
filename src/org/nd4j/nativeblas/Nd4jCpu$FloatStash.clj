(ns org.nd4j.nativeblas.Nd4jCpu$FloatStash
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$FloatStash]))

(defn ->float-stash
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$FloatStash [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$FloatStash p))
  (^Nd4jCpu$FloatStash []
    (new Nd4jCpu$FloatStash )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatStash`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatStash [^Nd4jCpu$FloatStash this ^Long position]
    (-> this (.position position))))

(defn store-array
  "name - `java.lang.String`
  array - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`

  returns: `void storeArray(int nodeId, @`"
  ([^Nd4jCpu$FloatStash this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray array]
    (-> this (.storeArray name array))))

(defn check-stash
  "name - `java.lang.String`

  returns: `(value="bool")  boolean checkStash(int nodeId, @`"
  ([^Nd4jCpu$FloatStash this ^java.lang.String name]
    (-> this (.checkStash name))))

(defn extract-array
  "name - `java.lang.String`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray extractArray(int nodeId, @`"
  ([^Nd4jCpu$FloatStash this ^java.lang.String name]
    (-> this (.extractArray name))))

(defn clear
  ""
  ([^Nd4jCpu$FloatStash this]
    (-> this (.clear))))

