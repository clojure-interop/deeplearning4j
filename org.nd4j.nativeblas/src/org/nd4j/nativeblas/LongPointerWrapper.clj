(ns org.nd4j.nativeblas.LongPointerWrapper
  "Wrapper for DoublePointer -> LongPointer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas LongPointerWrapper]))

(defn ->long-pointer-wrapper
  "Constructor.

  pointer - `org.bytedeco.javacpp.Pointer`"
  (^LongPointerWrapper [^org.bytedeco.javacpp.Pointer pointer]
    (new LongPointerWrapper pointer)))

