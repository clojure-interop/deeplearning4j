(ns org.nd4j.nativeblas.Nd4jCpu$HalfOpArgsHolder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfOpArgsHolder]))

(defn ->half-op-args-holder
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfOpArgsHolder [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfOpArgsHolder p)))

(defn get-in-arrs
  "returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector [^Nd4jCpu$HalfOpArgsHolder this]
    (-> this (.getInArrs))))

(defn get-t-args
  "returns: `(value="float16*")   org.bytedeco.javacpp.ShortPointer`"
  ([^Nd4jCpu$HalfOpArgsHolder this]
    (-> this (.getTArgs))))

(defn get-i-args
  "returns: `(value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCpu$HalfOpArgsHolder this]
    (-> this (.getIArgs))))

(defn get-alloc-info
  "returns: `(value="bool*")   org.bytedeco.javacpp.BoolPointer`"
  ([^Nd4jCpu$HalfOpArgsHolder this]
    (-> this (.getAllocInfo))))

(defn get-num-in-arrs
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfOpArgsHolder this]
    (-> this (.getNumInArrs))))

(defn get-num-t-args
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfOpArgsHolder this]
    (-> this (.getNumTArgs))))

(defn get-num-i-args
  "returns: `int`"
  (^Integer [^Nd4jCpu$HalfOpArgsHolder this]
    (-> this (.getNumIArgs))))

(defn create-args-holder-for-bp
  "is-in-place - `boolean`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfOpArgsHolder createArgsHolderForBP(  org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector inGradArrs, @`"
  ([^Nd4jCpu$HalfOpArgsHolder this ^Boolean is-in-place]
    (-> this (.createArgsHolderForBP is-in-place))))

