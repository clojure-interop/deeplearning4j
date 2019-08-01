(ns org.nd4j.nativeblas.Nd4jCpu$Xoroshiro128
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$Xoroshiro128]))

(defn ->xoroshiro-128
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$Xoroshiro128 [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$Xoroshiro128 p)))

(defn refresh-buffer
  ""
  ([^Nd4jCpu$Xoroshiro128 this]
    (-> this (.refreshBuffer))))

