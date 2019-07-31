(ns org.nd4j.linalg.cpu.nativecpu.rng.CpuNativeRandom
  "CPU implementation for NativeRandom"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu.rng CpuNativeRandom]))

(defn ->cpu-native-random
  "Constructor.

  seed - `long`
  number-of-elements - `long`"
  (^CpuNativeRandom [^Long seed ^Long number-of-elements]
    (new CpuNativeRandom seed number-of-elements))
  (^CpuNativeRandom [^Long seed]
    (new CpuNativeRandom seed))
  (^CpuNativeRandom []
    (new CpuNativeRandom )))

(defn init
  ""
  ([^CpuNativeRandom this]
    (-> this (.init))))

(defn get-extra-pointers
  "returns: `org.bytedeco.javacpp.PointerPointer`"
  (^org.bytedeco.javacpp.PointerPointer [^CpuNativeRandom this]
    (-> this (.getExtraPointers))))

