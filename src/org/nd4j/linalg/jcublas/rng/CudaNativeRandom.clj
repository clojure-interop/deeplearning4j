(ns org.nd4j.linalg.jcublas.rng.CudaNativeRandom
  "NativeRandom wrapper for CUDA with multi-gpu support"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.rng CudaNativeRandom]))

(defn ->cuda-native-random
  "Constructor.

  seed - `long`
  number-of-elements - `long`"
  (^CudaNativeRandom [^Long seed ^Long number-of-elements]
    (new CudaNativeRandom seed number-of-elements))
  (^CudaNativeRandom [^Long seed]
    (new CudaNativeRandom seed))
  (^CudaNativeRandom []
    (new CudaNativeRandom )))

(defn init
  ""
  ([^CudaNativeRandom this]
    (-> this (.init))))

(defn get-extra-pointers
  "returns: `org.bytedeco.javacpp.PointerPointer`"
  (^org.bytedeco.javacpp.PointerPointer [^CudaNativeRandom this]
    (-> this (.getExtraPointers))))

