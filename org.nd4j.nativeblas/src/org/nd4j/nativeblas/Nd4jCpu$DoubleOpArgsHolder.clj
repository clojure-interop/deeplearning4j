(ns org.nd4j.nativeblas.Nd4jCpu$DoubleOpArgsHolder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleOpArgsHolder]))

(defn ->double-op-args-holder
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleOpArgsHolder [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleOpArgsHolder p)))

(defn get-in-arrs
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector [^Nd4jCpu$DoubleOpArgsHolder this]
    (-> this (.getInArrs))))

(defn get-t-args
  "returns: `org.bytedeco.javacpp.DoublePointer`"
  (^org.bytedeco.javacpp.DoublePointer [^Nd4jCpu$DoubleOpArgsHolder this]
    (-> this (.getTArgs))))

(defn get-i-args
  "returns: `(value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCpu$DoubleOpArgsHolder this]
    (-> this (.getIArgs))))

(defn get-alloc-info
  "returns: `(value="bool*")   org.bytedeco.javacpp.BoolPointer`"
  ([^Nd4jCpu$DoubleOpArgsHolder this]
    (-> this (.getAllocInfo))))

(defn get-num-in-arrs
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleOpArgsHolder this]
    (-> this (.getNumInArrs))))

(defn get-num-t-args
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleOpArgsHolder this]
    (-> this (.getNumTArgs))))

(defn get-num-i-args
  "returns: `int`"
  (^Integer [^Nd4jCpu$DoubleOpArgsHolder this]
    (-> this (.getNumIArgs))))

(defn create-args-holder-for-bp
  "is-in-place - `boolean`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleOpArgsHolder createArgsHolderForBP(  org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector inGradArrs, @`"
  ([^Nd4jCpu$DoubleOpArgsHolder this ^Boolean is-in-place]
    (-> this (.createArgsHolderForBP is-in-place))))

