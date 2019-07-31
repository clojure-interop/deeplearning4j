(ns org.nd4j.tensorflow.conversion.DummyDeAllocator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.tensorflow.conversion DummyDeAllocator]))

(defn ->dummy-de-allocator
  "Constructor."
  (^DummyDeAllocator []
    (new DummyDeAllocator )))

(defn *get-instance
  "returns: `org.nd4j.tensorflow.conversion.DummyDeAllocator`"
  (^org.nd4j.tensorflow.conversion.DummyDeAllocator []
    (DummyDeAllocator/getInstance )))

(defn call
  "pointer - `org.bytedeco.javacpp.Pointer`
  l - `long`
  pointer-1 - `org.bytedeco.javacpp.Pointer`"
  ([^DummyDeAllocator this ^org.bytedeco.javacpp.Pointer pointer ^Long l ^org.bytedeco.javacpp.Pointer pointer-1]
    (-> this (.call pointer l pointer-1))))

